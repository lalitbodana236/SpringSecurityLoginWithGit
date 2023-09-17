package com.fakecoders.foundation.community.git.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fakecoders.foundation.community.git.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String emailId);
}
