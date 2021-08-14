package com.example.subham.controller;

import com.example.subham.model.Notice;
import com.example.subham.repository.NoticeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class HomeController {
	@Autowired
	NoticeRepo noticeRepo;

	@GetMapping("/index")
	public String index(Model model) {

		return "index";
	}
	
	@GetMapping("login")
	public String login(Model model, HttpServletRequest request) {
		return "login";
	}
	
}
