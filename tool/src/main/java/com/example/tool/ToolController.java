package com.example.tool;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/tool")
public class ToolController {
	
	@GetMapping("/hello")
	public String getMethodName() {
		return "Hello rahiman how are you";
	}
	
	@PostMapping("/posting")
	public String postMethodName(@RequestBody String name) {
		return name;
	}
	
	

}
