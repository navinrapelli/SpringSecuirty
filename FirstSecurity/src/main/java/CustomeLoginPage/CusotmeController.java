package CustomeLoginPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CusotmeController {
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	
	

	
}
