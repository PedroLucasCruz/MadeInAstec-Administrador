package com.adminportal.service;

import java.util.Set;

import com.adminportal.domain.User;
import com.adminportal.domain.security.UserRole;



public interface UserService {
	User criarUsuario(User user, Set<UserRole> userRoles) throws Exception;
	
	User salvar(User user);
}
