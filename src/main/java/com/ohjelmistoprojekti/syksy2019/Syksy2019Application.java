/**
 * 
 */

package com.ohjelmistoprojekti.syksy2019;

import com.ohjelmistoprojekti.syksy2019.domain.question.IsSchoolProject;
import com.ohjelmistoprojekti.syksy2019.domain.question.IsSchoolProjectRepository;
import com.ohjelmistoprojekti.syksy2019.domain.question.ProgrammingLanguages;
import com.ohjelmistoprojekti.syksy2019.domain.question.ProgrammingLanguagesRepository;
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
			ProgrammingLanguagesRepository programmingLanguagesRepository
	) {
		return (args) -> {

			/**
			 * Luo testikäyttäjä
			 */
			//User user1 = new User ("Pekka", "Paavola", "pekka.paavola@gmail.com", "admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			//urepository.save(user1);

			/**
			 * Luo vaihtoehdot kysymykseen
			 * 	"Tarvitsetko apua koulukurssin suorittamiseen?"
			 */
			isSchoolProjectRepository.save(new IsSchoolProject(("Kyllä")));
			isSchoolProjectRepository.save(new IsSchoolProject(("Ei")));

			/**
			 * Luo vaihtoehdot kysymykseen
			 * 	"Kieli"
			 */
			programmingLanguagesRepository.save(new ProgrammingLanguages("HTML"));
			programmingLanguagesRepository.save(new ProgrammingLanguages("Java"));
			programmingLanguagesRepository.save(new ProgrammingLanguages("JSS"));
			programmingLanguagesRepository.save(new ProgrammingLanguages("CSS"));
			programmingLanguagesRepository.save(new ProgrammingLanguages("PHP"));

		};
	}
}