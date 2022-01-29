package idat.ciclo4.pric.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import idat.ciclo4.pric.modelo.PromedioModelo;

@Controller
public class HomeControlador {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("ecos", new PromedioModelo());
		return "home";
	}
	
	@PostMapping("/evaluacion")
	public String operacion(@ModelAttribute("ecos") PromedioModelo pro,Model model){
		model.addAttribute("resultado", pro.resultado());
		return "home";
	}
}
