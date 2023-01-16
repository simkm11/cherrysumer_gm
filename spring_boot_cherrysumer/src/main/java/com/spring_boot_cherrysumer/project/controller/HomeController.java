package com.spring_boot_cherrysumer.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {

		return "NewFile";
	}
	
	@RequestMapping("/member/signup")
	public String signUp() {

		return "member/signup";
	}
	
	@RequestMapping("/member/login")
	public String login() {

		return "member/login";
	}
}
