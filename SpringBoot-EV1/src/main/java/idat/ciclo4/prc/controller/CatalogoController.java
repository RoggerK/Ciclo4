package idat.ciclo4.prc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.ciclo4.prc.service.MedicamentoService;

@Controller
@RequestMapping("/Catalogo")
public class CatalogoController {
	
	@Autowired
	MedicamentoService service;
	
	@GetMapping("/Home")
	public String home(Model model) {
		model.addAttribute("producto", service.listMedicamento());
		return "Catalogo/home";
	}
}
