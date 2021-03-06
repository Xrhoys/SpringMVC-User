package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

import java.util.List;

@Controller
@SessionAttributes("id")
public class LoginController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = null;
    if (request.getSession().getAttribute("id") != null){
      List<User> users = userService.getUserList();
      mav = new ModelAndView("welcome");
      mav.addObject("users", users);
    } else {
      mav = new ModelAndView("login");
      mav.addObject("login", new Login());
    }

    return mav;
  }

  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("login") Login login) {

    if (request.getSession().getAttribute("id") != null){
      return new ModelAndView("redirect:/login");
    }

    ModelAndView mav = null;

    User user = userService.validateUser(login);

    if (null != user) {
      List<User> users = userService.getUserList();

      mav = new ModelAndView("welcome");
      mav.addObject("users", users);

      request.getSession().setAttribute("id", user.getId());
    } else {
      mav = new ModelAndView("login");
      mav.addObject("message", "Username or Password is wrong!!");
    }

    return mav;
  }

}
