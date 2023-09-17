package com.fakecoders.foundation.community.git.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.fakecoders.foundation.community.git.dto.UserRegisteredDTO;
import com.fakecoders.foundation.community.git.model.User;



public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);




	
}
