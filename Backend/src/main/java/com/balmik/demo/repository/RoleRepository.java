package com.balmik.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balmik.demo.pojo.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
