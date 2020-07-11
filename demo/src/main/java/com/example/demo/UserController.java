package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.UserRepository;
import com.example.demo.pojo.Rate;
import com.example.demo.pojo.User;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String hello() {
		return "Hello User !! use /getuser or /adduser";
	}
	@GetMapping("/getuser")
	public Iterable<User> getAllUser() {
		return userRepository.findAll();
	}
	
	@GetMapping("/getuser/{name}")
	public List<User> getUser(@PathVariable String name) { 
		return userRepository.findByName(name);
	}
	
	@GetMapping("/getuserbynameoremail/{name}/{email}")
	public List<User> getUser(@PathVariable String name, @PathVariable String email) { 
		return userRepository.findByNameOrEmail(name, email);
	}
	
	@GetMapping("/getuserbyemailq/{email}")
	public List<User> getuserbyemail(@PathVariable String email) {
		return userRepository.findemail(email);
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestParam String name, @RequestParam String email) {
		User user=new User();
		user.setName(name);
		user.setEmail(email);
		return userRepository.save(user);
		
	}
	
	@PostMapping("/add")
	public User add(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@GetMapping("/restcall")
	public List<Rate> restcall() {
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<List<Rate>> rateResponse =
		        restTemplate.exchange("https://bitpay.com/api/rates",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Rate>>() {
		            });
		List<Rate> rates = rateResponse.getBody();
		return rates;
		
	}
	

}
