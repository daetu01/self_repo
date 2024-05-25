package ssgssak.team1.sist.login;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import ssgssak.team1.sist.MainController;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping(value = "/login/*")
public class LoginController {
	
	@GetMapping(value = "/popup")
	public String Login(Locale locale, Model model) {
		log.info(" > loginController get in... ");
		
		return "/member/loginPage_Form";
	}
}
