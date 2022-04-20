package com.training.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Center;
import com.training.springboot.repository.CenterRepository;

@Service
public class CenterService {
	
	@Autowired
	CenterRepository repository4;
	
	public List<Center> getByPincode(int pincode){
		List<Center> centers = (List<Center>)repository4.findAll();
		return centers.stream().filter(center -> center.getPincode()==pincode).collect(Collectors.toList());
	}
	
	public List<Center> getByDistrict(String district){
		List<Center> centers = (List<Center>)repository4.findAll();
		return centers.stream().filter(center -> center.getDistrict().equals(district)).collect(Collectors.toList());
	}

}
