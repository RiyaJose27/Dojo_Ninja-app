package com.codingdojo.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.crud.models.Ninja;
import com.codingdojo.crud.repositories.NinjaRepository;


@Service
public class NinjaService {

	
	 @Autowired
	 NinjaRepository ninjaRepo;
	 
	 
	 
	 //method to find all Poke
	 public List<Ninja> allNinjas(){
		 return ninjaRepo.findAll();
	 }
	 
	 //method to create a Poke
	 
	 public Ninja create(Ninja ninja) {
		 return ninjaRepo.save(ninja);
	 }
	 
	 //method to find one poke
	 public Ninja oneNinja(Long id) {
		 Optional <Ninja> optionalNinja = ninjaRepo.findById(id);
		 if(optionalNinja.isPresent())
		 {
			 return optionalNinja.get();
		 } else {
			 return null;
		 }
	 }
	 
	 //Method to update a poke
	  public Ninja updateNinja(Ninja ninja) {
		  return ninjaRepo.save(ninja);
	  }
	 
	 //method to delete poke
	  public void destroy(Long id) {
		 ninjaRepo.deleteById(id);
	  }
	 
}
