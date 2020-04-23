package com.ipo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipo.Model.Details;
import com.ipo.Service.IpoService;

@RestController
public class HomeControler {
	@Autowired
	IpoService service;
	
	@GetMapping("/verify")
	public String status()
	{
		return "user is working";
	}
	
	/*
	 * @RequestMapping("/List") void get() { List<Details> list=service.getAll();
	 * System.out.println(list);
	 * 
	 * }
	 */
}
