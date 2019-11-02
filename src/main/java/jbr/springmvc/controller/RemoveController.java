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
public class RemoveController {

    @Autowired
    UserService userService;

    @RequestMapping(value ="/remove", method = RequestMethod.GET)
    public ModelAndView removeUser(HttpServletRequest request, HttpServletResponse response,
                                      @RequestParam("userID") int ID){

        userService.removeByID(ID);

        return new ModelAndView("remove", "IsRemoved", true);
    }
}
