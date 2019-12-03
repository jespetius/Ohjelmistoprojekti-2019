/**
 * 
 */

package com.ohjelmistoprojekti.syksy2019;

import com.ohjelmistoprojekti.syksy2019.domain.question.IsSchoolProject;
import com.ohjelmistoprojekti.syksy2019.domain.question.IsSchoolProjectRepository;
import com.ohjelmistoprojekti.syksy2019.domain.question.ProgrammingLanguages;
import com.ohjelmistoprojekti.syksy2019.domain.question.ProgrammingLanguagesRepository;
import com.ohjelmistoprojekti.syksy2019.domain.question.Question;
import com.ohjelmistoprojekti.syksy2019.domain.question.QuestionRepository;
import com.ohjelmistoprojekti.syksy2019.domain.question.SimpleAnswer;
import com.ohjelmistoprojekti.syksy2019.domain.question.SimpleAnswerRepository;
import com.ohjelmistoprojekti.syksy2019.domain.question.SimpleQuestion;
import com.ohjelmistoprojekti.syksy2019.domain.question.SimpleQuestionRepository;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ohjelmistoprojekti.syksy2019.domain.User;
import com.ohjelmistoprojekti.syksy2019.domain.UserRepository;

@SpringBootApplication
public class Syksy2019Application {

	public static void main(String[] args) {
		SpringApplication.run(Syksy2019Application.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(
			UserRepository urepository,
			IsSchoolProjectRepository isSchoolProjectRepository,
			ProgrammingLanguagesRepository programmingLanguagesRepository,
			QuestionRepository questionRepository,
			SimpleQuestionRepository simpleQuestionRepository,
			SimpleAnswerRepository simpleAnswerRepository
			
	) {
		return (args) -> {

			/**
			 * Luo testikäyttäjät
			 *	 => https://www.browserling.com/tools/bcrypt
			 */
			//urepository.save(new User ("Pekka", "Paavola", "pekka.paavola@gmail.com", "admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN"));
			//urepository.save(new User ("Pekkaa", "Paavolaa", "pekka.paavolaa@gmail.com", "user", "$2a$10$LTjPPrHhtLSdS8ZrhO/Wg.tgT2B2LOeLKCXAVJ/Hkr4F/bsckgo9W", "USER"));
			
			/**
			 * Luo vaihtoehdot kysymykseen
			 * 	"Tarvitsetko apua koulukurssin suorittamiseen?"
			 */
			isSchoolProjectRepository.save(new IsSchoolProject("Kyllä"));
			isSchoolProjectRepository.save(new IsSchoolProject("Ei"));

			/**
			 * Luo vaihtoehdot kysymykseen
			 * 	"Kieli"
			 */
			programmingLanguagesRepository.save(new ProgrammingLanguages("HTML"));
			programmingLanguagesRepository.save(new ProgrammingLanguages("Java"));
			programmingLanguagesRepository.save(new ProgrammingLanguages("JSS"));
			programmingLanguagesRepository.save(new ProgrammingLanguages("CSS"));
			programmingLanguagesRepository.save(new ProgrammingLanguages("PHP"));
			programmingLanguagesRepository.save(new ProgrammingLanguages("Python"));
			
			/**
			 * Tehdään testivastaukset
			 */
//			simpleAnswerRepository.save(new SimpleAnswer("Vastaus 1"));
//			simpleAnswerRepository.save(new SimpleAnswer("Vastaus 2"));
//			simpleAnswerRepository.save(new SimpleAnswer("Vastaus 3"));
//			simpleAnswerRepository.save(new SimpleAnswer("Vastaus 4"));
//			simpleAnswerRepository.save(new SimpleAnswer("Vastaus 5"));
//			simpleAnswerRepository.save(new SimpleAnswer("Vastaus 6"));
			
			
			/**
			 * Tehdään testikysymykset
			 */
			simpleQuestionRepository.save(new SimpleQuestion("Kysymys 1", "Tarvitsetko apua koulukurssin suorittamiseen?"));
			simpleQuestionRepository.save(new SimpleQuestion("Kysymys 2", "Deadline?"));
			simpleQuestionRepository.save(new SimpleQuestion("Kysymys 3", "Aikataulu?"));
			simpleQuestionRepository.save(new SimpleQuestion("Kysymys 4", "Kuvaile ongelma?"));
			simpleQuestionRepository.save(new SimpleQuestion("Kysymys 5", "Aikataulu?"));
			simpleQuestionRepository.save(new SimpleQuestion("Kysymys 6", "Oma osaamistasosi?"));
			simpleQuestionRepository.save(new SimpleQuestion("Kysymys 7", "Ohjelmointikielet?"));
			
		};
	}
}
