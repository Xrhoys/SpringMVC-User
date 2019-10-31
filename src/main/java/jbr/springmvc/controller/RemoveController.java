package jbr.springmvc.controller;

import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveController {

    @Autowired
    UserService userService;

    @RequestMapping(value ="/remove", method = RequestMethod.GET)
    public ModelAndView removeUser(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("remove", "IsRemoved", false);

        return mav;
    }

    @RequestMapping(value ="/removeProcess", method = RequestMethod.POST)
    public ModelAndView removeProcess(HttpServletRequest request, HttpServletResponse response,
                                      @ModelAttribute("user") User user){

        userService.removeByID(Integer.parseInt(user.getId()));

        return new ModelAndView("remove", "IsRemoved", true);
    }
}
