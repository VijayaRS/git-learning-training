package com.study;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	
	@Autowired
	DemoService service;
	
	@PostMapping
     public void save(@Valid@RequestBody Demo demo) {
		System.out.println("save method call");
		System.out.println(demo.getName());
		System.out.println(demo.getAge());
		service.saveDemo(demo);
	}
	
	@GetMapping
	List<Demo> getDemo(){
		return service.getAllDemo();
	}
	

}
