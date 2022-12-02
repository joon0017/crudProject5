package com.crud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class HomeController{

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    /*
    Format
    @RequestMapping("URL_INPUT")
    public String METHODNAME(PARAMETERS){
        //do stuff
        return ".jsp path";
     */
}
