package com.sist.web.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sist.web.service.BarService;

@Controller
public class MainController {
	@Autowired
	private BarService bService;
	
	@GetMapping("/")
	public String main_page(@RequestParam(name="page",required = false) String page,Model model)
	{
		if(page==null)
			page="1";
		int curpage=Integer.parseInt(page);
		Map map = bService.barListData(curpage);
			model.addAttribute("map", map);
		   model.addAttribute("main_html","main/home");
		return "index";
	}
}
