package idat.ciclo4.princ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("DesSelva", "Ven y disfruta de un espacio natural.");
		model.addAttribute("DesCosta", "Disfruta de la ciudad y sus maravillosos paisajes.");
		model.addAttribute("DesSierra", "Las alturas te llama y la naturaleza lo sabe.");
		return "index";
	}
}
