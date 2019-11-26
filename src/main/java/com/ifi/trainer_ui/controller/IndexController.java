package com.ifi.trainer_ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(){
	    return "index"; 
	}
	 
	@PostMapping("/registerTrainer")
	ModelAndView registerNewTrainer(String trainerName){
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("register");
	    modelAndView.getModel().put("name", trainerName);
	    return modelAndView;
	}

}
