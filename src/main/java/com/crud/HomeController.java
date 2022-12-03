package com.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{

    @RequestMapping("/")
    public String home(){
        return "posts";
    }

    /*
    Format
    @RequestMapping("URL_INPUT")
    public String METHODNAME(PARAMETERS){
        //do stuff
        return ".jsp path";
     */

    @RequestMapping("addpostform")
    public String addPostForm(){


        return "add/addpostform";
    }

    @RequestMapping("addpost")
    public String addPost(){
        return "add/addpost";
    }
}
