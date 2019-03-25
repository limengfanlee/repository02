package com.hhhh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HJJJ {

        @ResponseBody
        @RequestMapping("/qqq")
        public  String qqq(){
            return "qqq";
        }


}
