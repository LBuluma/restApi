package com.restful.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restful.entities.UserRoles;


public interface UserRolesService {
	
	UserRoles createUserRoles(UserRoles usrRoles) ;
	
	List<UserRoles> getAllUserRoles();
	
	UserRoles updateUserRoles(Long usrRoleId, UserRoles usrRoles) ;
}
