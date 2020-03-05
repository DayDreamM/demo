package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
@RequestMapping("/")
public class JsonController {

	@RequestMapping("/json")
	public User getUser() {
		return new User(1, "倪升武", "123456");		
	}
}
