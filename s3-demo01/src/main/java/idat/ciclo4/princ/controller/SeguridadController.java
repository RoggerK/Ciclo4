package idat.ciclo4.princ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Seguridad")
public class SeguridadController {
	
	@GetMapping("/login")
	public String login(Model model) {
		return "Tema03/Seguridad/login";
	}
}
