/**
 * 
 */

package com.ohjelmistoprojekti.syksy2019.controller;

import com.ohjelmistoprojekti.syksy2019.domain.question.IsSchoolProjectRepository;
import com.ohjelmistoprojekti.syksy2019.domain.question.ProgrammingLanguagesRepository;
import com.ohjelmistoprojekti.syksy2019.domain.question.Question;
import com.ohjelmistoprojekti.syksy2019.domain.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

	/**
	 * Näyttää kaikki kysymykset tässä toistaiseksi
	 */
	@GetMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("questions", questionRepository.findAll());
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
	@Autowired ProgrammingLanguagesRepository programmingLanguagesRepository;

	@GetMapping("/addquestion")
	public String askQuestion(Model model) {
		model.addAttribute("question", new Question());
		model.addAttribute("isSchoolProjectOptions", isSchoolProjectRepository.findAll());
		model.addAttribute("programmingLanguages", programmingLanguagesRepository.findAll());
		return "addquestion";
	}

	@PostMapping("/addquestion")
	public String saveQuestion(Question question) {
		questionRepository.save(question);
		return "redirect:/index";
	}
}
