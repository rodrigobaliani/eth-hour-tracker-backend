package com.ga.accelerator.security;
/*import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper;

import com.ga.accelerator.repository.UserRepository;

public class CustomUserDetailsContextMapper implements UserDetailsContextMapper {
	
	@Autowired 
	private UserRepository userRepository;

	@Override
	public UserDetails mapUserFromContext(DirContextOperations ctx, String username,
			Collection<? extends GrantedAuthority> authorities) {
		
		Collection<GrantedAuthority> databaseAuthorities = new ArrayList<GrantedAuthority>();;
		
		if(!this.userRepository.existsByMail(username)) {
			this.userRepository.save(new com.ga.accelerator.model.User(username, true));
		}
		
		return new User(username, "", databaseAuthorities);
	}

	@Override
	public void mapUserToContext(UserDetails user, DirContextAdapter ctx) {
		// TODO Auto-generated method stub
		
	}
	

}*/
