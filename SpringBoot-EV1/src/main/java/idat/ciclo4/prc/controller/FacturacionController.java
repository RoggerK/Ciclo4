package idat.ciclo4.prc.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Facturacion")
public class FacturacionController {
	
	@GetMapping("/Abrilar")
	public String abrilar(Model model) {
		model.addAttribute("fecha", LocalDate.now().toString());
		model.addAttribute("hora", LocalTime.now().toString());
		return "Facturacion/Abrilar";
	}
	
	@GetMapping("/Bactrin")
	public String bactrin(Model model) {
		model.addAttribute("fecha", LocalDate.now().toString());
		model.addAttribute("hora", LocalTime.now().toString());
		return "Facturacion/Bactrin";
	}
	
	@GetMapping("/BioGaia")
	public String bioGaia(Model model) {
		model.addAttribute("fecha", LocalDate.now().toString());
		model.addAttribute("hora", LocalTime.now().toString());
		return "Facturacion/BioGaia";
	}
	
	@GetMapping("/Enterogermina")
	public String enterogermina(Model model) {
		model.addAttribute("fecha", LocalDate.now().toString());
		model.addAttribute("hora", LocalTime.now().toString());
		return "Facturacion/Enterogermina";
	}
	
	@GetMapping("/Vick")
	public String vick(Model model) {
		model.addAttribute("fecha", LocalDate.now().toString());
		model.addAttribute("hora", LocalTime.now().toString());
		return "Facturacion/Vick";
	}
}
