package com.demo.apptest;

import javax.*;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class UserController {
	@RequestMapping(value = "/userview", method = RequestMethod.GET)
    public String display(HttpServletRequest req,Model m)
    {
        //read the provided form data
//        String name=req.getParameter("name");
//        String pass=req.getParameter("pass");
//        if(pass.equals("admin"))
//        {
            String msg="Hello nitin";
            //add a message to the model
            m.addAttribute("message", msg);
            return "viewpage";
//        }
//        else
//        {
//            String msg="Sorry "+ name+". You entered an incorrect password";
//            m.addAttribute("message", msg);
//            return "errorpage";
//        }
    }
}
