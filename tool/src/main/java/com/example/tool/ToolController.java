package com.example.tool;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/tool")
public class ToolController {
	
	@GetMapping("/hello")
	public String getMethodName() {
		return "Hello rahiman how are you";
	}
	

}
