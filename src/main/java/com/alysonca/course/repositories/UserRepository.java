package com.alysonca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alysonca.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
