package com.training.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Center;
import com.training.springboot.repository.CenterRepository;
import com.training.springboot.service.CenterService;

@RestController
public class CenterController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	CenterRepository repository4;
	
	@Autowired
	CenterService service1;
	
	@RequestMapping("/")
	public String getMsg() {
		return "Hello from spring boot";
	}
	
	@PostMapping("/addCenter")
	public void newCenter(@RequestBody Center center) {
		repository4.save(center);
	}	
		
	@GetMapping("/baseurl/api/v1/all")
	public ResponseEntity<List<Center>> getCenters(){
			
		List<Center> centers = repository4.findAll();
				
		return new ResponseEntity<List<Center>> (centers, HttpStatus.OK);
		
	}
		
	@GetMapping("/baseurl/api/v1/{pincode}")
	public ResponseEntity<List<Center>> getCenterByPincode(@PathVariable("pincode") int pincode){
		List<Center> centers = service1.getByPincode(pincode);
		return new ResponseEntity<List<Center>>(centers,HttpStatus.OK);
	}
	
	@GetMapping("/baseurl/api/v1")
	public ResponseEntity<List<Center>> getCenterByDistrict(@RequestParam(value = "district") String district){
		List<Center> centers = service1.getByDistrict(district);
		return new ResponseEntity<List<Center>>(centers,HttpStatus.OK);
	}


	}

