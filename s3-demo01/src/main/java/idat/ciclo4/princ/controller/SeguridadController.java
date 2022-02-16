package idat.ciclo4.princ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.ciclo4.princ.model.UsuarioModel;

@Controller
@RequestMapping("/Seguridad")
public class SeguridadController {
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new UsuarioModel());
		return "Tema03/Seguridad/login";
	}
	
	@PostMapping("/index")
	public String ingreso(@ModelAttribute("user") UsuarioModel us, Model model) {
		
		if(us.getCorreo().equals("rogger9081@gmail.com") && us.getContrasenia().equals("123456")) {
			return "Tema03/Seguridad/index";
		}else {
			model.addAttribute("user", new UsuarioModel());
			return "Tema03/Seguridad/login";
		}
	}
}