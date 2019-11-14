package com.ohjelmistoprojekti.syksy2019.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ohjelmistoprojekti.syksy2019.domain.Answer;
import com.ohjelmistoprojekti.syksy2019.domain.QuestionRest;

public class PostController {
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/kysymys")
	public QuestionRest post(
			@RequestParam(value="name", defaultValue="In which language you need help with?") String name,
			@RequestParam(value="q", defaultValue="") String q
			) {
				return new QuestionRest(counter.incrementAndGet(),
                    String.format( name), String.format(q));
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String update(@RequestBody Answer answer) {
	    return "/";
	}
	
	@RequestMapping(value = "/")
	public ResponseEntity<Answer> get() {
		Answer answer = new Answer();
	    answer.setKoodikieli("Blue");
	    answer.setKommentti("jotain");
	
	    return new ResponseEntity<Answer>(answer, HttpStatus.OK);
	}
}
