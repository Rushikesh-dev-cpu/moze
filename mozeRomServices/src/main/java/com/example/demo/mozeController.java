package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mozeController {

	@GetMapping("moze.html")
	String moze() {
		return "2index.html";
	}
	
	//rfgdgdfg
}
