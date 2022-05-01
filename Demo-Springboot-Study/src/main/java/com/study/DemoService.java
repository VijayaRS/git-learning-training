package com.study;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	@Autowired
	DemoRepository repository;
	
	List<Demo> demo=new ArrayList<>();
	
	public void saveDemo(Demo demo) {
		repository.save(demo);
		System.out.println("order saved");
	}
	
	List <Demo> getAllDemo() {
		return repository.findAll();
	}

	


	
}
