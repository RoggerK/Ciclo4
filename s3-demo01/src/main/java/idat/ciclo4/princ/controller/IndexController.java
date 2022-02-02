package idat.ciclo4.princ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Tema03")
public class IndexController {
	
	@GetMapping("/thymeleaf")
	public String index(Model model) {
		return "Tema03/thymeleaf";
	}
}
