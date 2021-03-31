package com.example.demoNew.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoNew.Entity.DemoEntity;
import com.example.demoNew.Service.DemoInterface;

@RestController
@RequestMapping("/")
public class DemoController {
	
	@Autowired
	private DemoInterface DemoInterface;
	
	@PostMapping("/demo")
	public String getdemo() {
		return "Welcome";
	}
	@PostMapping("/about")
	public String getabout()
	{
		return "https://www.google.co.in/";
	}
	@PostMapping("/add")
	public String getcredit(@RequestBody DemoEntity demo) {
		DemoInterface.save(demo);
		return "Credit @SGM LLP";
	}
	@GetMapping("/show")
	public List<DemoEntity> getData(){
		return DemoInterface.findAll();
		
	}

	
}
