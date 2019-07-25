package com.risk.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.risk.model.User;
import com.risk.service.UserService;

@Controller
public class EntryController {
	
	@Autowired
	private UserService userservice;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@RequestMapping(value="/registerSuccess", method=RequestMethod.POST)
	public String registerSuccess(@Valid @ModelAttribute("user") User user, BindingResult result) {
		
		if(user.getName().isEmpty())
			throw new RuntimeException();
		
		if(result.hasErrors())
			return "register";
		userservice.addUser(user);
		return "redirect:/listUsers";
	}
	
	@RequestMapping(value="/listUsers", method=RequestMethod.GET)
	public ModelAndView display(ModelAndView mav) {
		mav.setViewName("listUsers");
		List<User> list = userservice.getUser();
		mav.addObject("list", list);
		return mav;
	}
	
	@ModelAttribute
	public void Model(Model model) {
		model.addAttribute("headerMessage", "Welcome to Risk Team!!");
		}

	
	 @ExceptionHandler(value=RuntimeException.class) public String myException() {
	 return "exception"; }
	 
}
