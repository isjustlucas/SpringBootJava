package com.cursoudemy.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.web.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
