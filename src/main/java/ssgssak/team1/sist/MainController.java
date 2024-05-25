package ssgssak.team1.sist;


import java.util.Locale;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log4j
@AllArgsConstructor
public class MainController {

	@GetMapping(value = {"/", "/SSGSSAK/mainPage/main"})
	public String main(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.");
		
		return "mainPage/main";
	}
	
}
