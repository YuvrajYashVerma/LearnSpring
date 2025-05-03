package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
	@RequestMapping("/abc")
	public String getName(){
		return "yuvraj";
	} 
	@PostMapping("/id")
	public String getId(){
		return ""+10;
	}
	@GetMapping("/pass")
	public String getPassword(@RequestParam("un") String un){
		return ""+un;
	}
}


