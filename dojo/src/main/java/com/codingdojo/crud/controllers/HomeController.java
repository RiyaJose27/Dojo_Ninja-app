package com.codingdojo.crud.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.crud.models.Dojo;
import com.codingdojo.crud.models.Ninja;
import com.codingdojo.crud.services.DojoService;
import com.codingdojo.crud.services.NinjaService;





@Controller
public class HomeController {
	
	@Autowired
	NinjaService ninjaServ;
	DojoService dojoServ;

	public HomeController(DojoService dojoServ) {
		this.dojoServ = dojoServ;
	}
	
	//show all ninjas
	@RequestMapping("/")
		public String index(Model model) {
		
		List<Ninja> allNinjas = ninjaServ.allNinjas();
		
		model.addAttribute("ninjas", allNinjas);
		
			return "index.jsp";
		}
	
	
	
	
	//Renders a form for creating a ninja
	@RequestMapping("/newNinja")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> allDojos = dojoServ.allDojos();
		model.addAttribute("dojos", allDojos);
		return "newNinja.jsp";
	}
	
	
	
	//Render the form for creating a Dojo
	@RequestMapping("/newDojo")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		
		return "newDojo.jsp";
	}
	
	
	
	
	
	
	
	//This is the action from the form to actually make the ninja
	 @RequestMapping(value="/createNinja", method=RequestMethod.POST)
	 
	 public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		 
		 if(result.hasErrors()) {
			 return "newNinja.jsp";
		 }
		ninjaServ.create(ninja); 
		 return "redirect:/";
	 }
	 
	 
	 //This is for action from the form to actually make the dojo
        @RequestMapping(value="/createDojo", method=RequestMethod.POST)
	 
	 public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		 
		 if(result.hasErrors()) {
			 return "newDojo.jsp";
		 }
		dojoServ.create(dojo); 
		 return "redirect:/";
	 }
	 
	
	 
	 
	 
	 
	 
	
	//render the jsp for the form to edit a ninja
	@RequestMapping("/editNinja/{id}")
	public String editNinja(@PathVariable("id") long id, Model model) {
		Ninja ninja = ninjaServ.oneNinja(id);
		model.addAttribute("ninja", ninja);
		return "editNinja.jsp";
	}
	
	//this is the action form the form to actually edit the ninja
	
	@RequestMapping(value="editNinja/{id}", method=RequestMethod.PUT)
	
	public String editingNinja(@Valid@ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "editNinja.jsp";
        } else {
            ninjaServ.updateNinja(ninja);
            return "redirect:/";
        }
    }
	
	

	
	//show one ninja 
	@RequestMapping("/oneNinja/{id}")
	public String oneNinja(@PathVariable("id") Long id, Model model) {
		model.addAttribute("ninja", ninjaServ.oneNinja(id));
		return "oneNinja.jsp";
	}
	
	
	//show one dojo
	@RequestMapping("oneDojo/{id}")
	public String oneDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoServ.oneDojo(id));
		return "oneDojo.jsp";
	}
	
	
	
	
	
	//delete one ninja
	@RequestMapping("/destroy/{id}")
	public String destroy(@PathVariable("id") Long id) {
		ninjaServ.destroy(id);
		return"redirect:/";
	}
	
	}
