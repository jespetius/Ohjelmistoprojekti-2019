/**
 * 
 */

package com.ohjelmistoprojekti.syksy2019;

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
	public CommandLineRunner bookDemo(UserRepository urepository) { 
		return (args) -> {
			
			
			
			
			User user1 = new User ("Pekka", "Paavola", "pekka.paavola@gmail.com", "admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);

			
			
		
		};

}
}
