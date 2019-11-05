package co.ohjelmistoprojekti.syksy2019.service;

import java.util.Optional;

import com.ohjelmistoprojekti.syksy2019.domain.User;


public interface UserService {
	
	Optional<User> findByUsername(String username);
	Optional<User> findByEmail(String email);
	User save(User user);
}
