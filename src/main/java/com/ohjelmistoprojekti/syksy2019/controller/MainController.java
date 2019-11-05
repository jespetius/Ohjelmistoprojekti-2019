/**
 * 
 */

package com.ohjelmistoprojekti.syksy2019.controller;

import com.ohjelmistoprojekti.syksy2019.domain.question.IsSchoolProjectRepository;
import com.ohjelmistoprojekti.syksy2019.domain.question.Question;
import com.ohjelmistoprojekti.syksy2019.domain.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

	@GetMapping({"/", "/index"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}


	/**
	 * Kysymyksen lisäämiseen tarvittavat GET-, ja POST-metodit
	 */
	@Autowired QuestionRepository questionRepository;
	@Autowired IsSchoolProjectRepository isSchoolProjectRepository;

	@GetMapping("/addquestion")
	public String askQuestion(Model model) {
		model.addAttribute("question", new Question());
		model.addAttribute("isSchoolProjectOptions", isSchoolProjectRepository.findAll());
		return "addquestion";
	}

	@PostMapping("/addquestion")
	public String saveQuestion(Question question) {
		questionRepository.save(question);
		return "redirect:/index";
	}
}
