package com.restful.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restful.entities.UserRoles;
import com.restful.service.UserRolesService;

@RestController
@RequestMapping("/api")
public class UserRolesController {
	@Autowired
	UserRolesService userRolesService;
	
	@PostMapping(value="/userroles")
	public UserRoles createUserRoles(@RequestBody UserRoles userRoles) {
		userRoles.setCreatedDate(new Date());
	    return userRolesService.createUserRoles(userRoles);
	}
	
	@GetMapping(value="/userroles")
	public List<UserRoles> readUserRoles() {
		List<UserRoles> userRolesList = userRolesService.getAllUserRoles();
	    return userRolesList;
	}
	
	@PutMapping(value="/userroles/{userRoleId}")
	public UserRoles updateuserRoles(@PathVariable(value = "userRoleId") Long id, @RequestBody UserRoles userRoles) {
	    return userRolesService.updateUserRoles(id, userRoles);
	}
}
