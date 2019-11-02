package jbr.springmvc.controller;

import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ProfileViewController {
    @Autowired
    public UserService userService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView showProfile(HttpServletRequest request, HttpServletResponse response,
                                    @RequestParam("userID") int ID) {
        ModelAndView mav = new ModelAndView("profile");

        User users = userService.selectByID(ID);
        mav.addObject("user", users);

        return mav;
    }
}
