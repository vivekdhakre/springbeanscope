package com.dhakre.controller;

import com.dhakre.beans.HelloRequestScopeData;
import com.dhakre.beans.HelloSessionScopeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vivek on 11/4/17.
 */


@Controller
public class HelloController {

    @Autowired
    private HelloRequestScopeData requestscopehellodata;

    @Autowired
    private HelloSessionScopeData sessionscopehellodata;

    @RequestMapping(value = "/")
    public String hellodata(Model model) {
        model.addAttribute("requestscopedate", requestscopehellodata.getDate());
        model.addAttribute("sessionscopedate", sessionscopehellodata.getDate());

        return "hello";
    }


}
