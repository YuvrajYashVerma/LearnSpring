package com.example.demo.contoller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
@RestController
public class DemoController2 {
    @RequestMapping("/abc2")
    public String getName(){
    	return "yuvraj";
    }
    @GetMapping("/xyz/{id}")
    public String getId(@PathVariable("id") String un) {
    	return ""+un;
    }
    @GetMapping("/id2")
    public String getId2(@RequestParam(required =true) String id) {
    	return ""+id;
    }
}
