package jbr.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LogoutController {

    @RequestMapping(value = "/disconnect", method = RequestMethod.GET)
    public ModelAndView disconnectProcess(HttpServletRequest request, HttpServletResponse response){

        if (request.getSession().getAttribute("id") != null){
            request.getSession().setAttribute("id", null);
            return new ModelAndView("redirect:/");
        }

        return new ModelAndView("redirect:/login");
    }
}
