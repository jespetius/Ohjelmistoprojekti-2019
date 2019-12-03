package com.ohjelmistoprojekti.syksy2019.domain.question;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SimpleAnswerRepository extends CrudRepository<SimpleAnswer, Long> {
	List<SimpleAnswer> findByAnswer(String answer);
}
