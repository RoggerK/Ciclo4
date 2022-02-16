package idat.ciclo4.prc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Contactar")
public class ContactarController {
	
	@GetMapping("/Index")
	public String index(Model model) {
		return "Contactar/index";
	}
	
	@GetMapping("/Contacto")
	public String contacto(Model model) {
		return "Contactar/contacto";
	}
}
