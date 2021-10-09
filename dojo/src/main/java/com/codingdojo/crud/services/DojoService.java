package com.codingdojo.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.crud.models.Dojo;
import com.codingdojo.crud.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	DojoRepository dojoRepo;
	
	
	//method to find all dojos
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}

	//method to create  a dojo
	public Dojo create(Dojo dojo)
	{
		return dojoRepo.save(dojo);
	}
	
	 
	
	public Dojo oneDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	
	
	
	
}
