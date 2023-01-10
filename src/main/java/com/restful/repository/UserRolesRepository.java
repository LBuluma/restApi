package com.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful.entities.UserRoles;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Long> {

}