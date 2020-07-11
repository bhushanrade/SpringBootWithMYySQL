package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.User;

public interface UserRepository extends CrudRepository<User, Integer>  {

public List<User> findByName(String name);

public List<User> findByNameOrEmail(String name, String email);

public List<User> findByNameAndEmail(String name, String email);

@Query("select u from User u where u.email = ?1")
public List<User> findemail(String email);

}
