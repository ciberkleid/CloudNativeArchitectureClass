package io.springbox;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringboxController {
	
	@RequestMapping("/")
	public String greet(Locale locale, Model model) {
		return "home";
	}
}
