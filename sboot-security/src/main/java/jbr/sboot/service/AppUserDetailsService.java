package jbr.sboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jbr.sboot.model.AppUser;
import jbr.sboot.repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  // deverlop need to write  code or method 
  
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {  // ur mehtod
   
	  AppUser user = userRepository.findByUsername(username); // with databasee example mysql
	  
	
    if (null == user) throw new UsernameNotFoundException("User not found!!!");

    return new AppUserDetails(user);
  }

}
