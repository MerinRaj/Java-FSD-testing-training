package com.ust.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class KeyboardController {
	
	@GetMapping("keyboard/details")
	public Keyboard getDetails()
	{
		Keyboard k=new Keyboard();
		k.setId(2);
		k.setBrand("Splender");
		k.setPrice(40000);
		return k;
	}

}