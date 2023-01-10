package com.restful.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.entities.UserRoles;
import com.restful.repository.UserRolesRepository;
import com.restful.service.UserRolesService;

@Service
public class UserRolesServiceImpl implements UserRolesService {
	
	@Autowired
	UserRolesRepository userRolesRepository;

	@Override
	public UserRoles createUserRoles(UserRoles usrRoles) {
		return userRolesRepository.save(usrRoles);
	}

	@Override
	public List<UserRoles> getAllUserRoles() {
		return userRolesRepository.findAll();
	}

	@Override
	public UserRoles updateUserRoles(Long usrRoleId, UserRoles usrRoles) {
		UserRoles userRoles = userRolesRepository.findById(usrRoleId).get();
		userRoles.setActiveFlag(usrRoles.getActiveFlag());
		userRoles.setRoleName(usrRoles.getRoleName());
		usrRoles.setUpdatedBy(usrRoles.getUpdatedBy());
		usrRoles.setUpdatedDate(new Date());
		return userRolesRepository.save(usrRoles);
	}

}
