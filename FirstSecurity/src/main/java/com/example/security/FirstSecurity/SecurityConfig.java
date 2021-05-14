package com.example.security.FirstSecurity;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure( AuthenticationManagerBuilder auth) throws Exception {
		
		
		
		auth.inMemoryAuthentication()
		.withUser("navin")
		.password("navin")
		.roles("USER")
		.and()
		.withUser("pavan")
		.password("pavan")
		.roles("ADMIN");
		
        
				  
		
	}
	
	@Override
	protected void configure( HttpSecurity http) throws Exception {
	
		http.authorizeRequests()
		   .antMatchers("/admin").hasRole("ADMIN")
		   .antMatchers("/usesr").hasRole("USER")
		   .antMatchers("/").permitAll()
		   .and().formLogin();
		
	
	      
	}
	
	
	@Bean
	public  PasswordEncoder passwordEncoder()
	{
		 return NoOpPasswordEncoder.getInstance();
		
		
		
	}

}
