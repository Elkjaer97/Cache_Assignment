package com.example.demo.controller;

import com.example.demo.Cache;
import com.example.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    Cache cache = new Cache();

    @GetMapping("/get-user-data")
    @ResponseBody
    public String renderData(@RequestParam int id) throws InterruptedException {
        if(cache.has(id) == true) {
            return cache.get(id);
        } else if(cache.has(id) == false) {
            User user = new User(id);
            String val = user.getDataSlow();
            cache.set(id,val);
            return val;
        }

        
        return "/get-user-data";
    }

}
