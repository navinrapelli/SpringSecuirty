package CustomeLoginPage;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
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
	protected void configure(HttpSecurity http) throws Exception
	{
		
		http.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.loginPage("/login")
		.permitAll();
	}
}
