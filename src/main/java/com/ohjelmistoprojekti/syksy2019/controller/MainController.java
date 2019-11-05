/**
 * 
 */

package com.ohjelmistoprojekti.syksy2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.ohjelmistoprojekti.syksy2019.domain.User;

import co.ohjelmistoprojekti.syksy2019.service.UserService;

@Controller
public class MainController {
	
/*	@RequestMapping(value = "/signin", method =RequestMethod.GET)
	public String signin(Model model) {
		model.addAttribute("user",  new User());
		
		return "signin";
	}
	
	@RequestMapping(value = "/signin", method =RequestMethod.GET)
	public String signin(@ModelAttribute("user") User user,
	BindingResult bindingresult, Model model) {
		userValidator.validate(user, bindingresult);
		
		if (bindingresult.hasErrors()) {
			return "signin";
		}
		UserService.save(user);

	    securityService.autologin(user.getUsername(), user.getPasswordConfirm());

	    return "redirect:/index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
	    if (error != null)
	        model.addAttribute("error", "Your username and password is invalid.");

	    if (logout != null)
	        model.addAttribute("message", "You have been logged out successfully.");

	    return "login";
	}

	@RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
	public String welcome(Model model) {
	    return "welcome";
	}
		
	} */

	@GetMapping({"/", "/index"})
	public String index() {
		return "index";
	}
	
	@GetMapping({ "/signin"})
	public String signin() {
		return "signin";
	}
	
	@GetMapping({ "/login"})
	public String login() {
		return "login";
	}
	
}
