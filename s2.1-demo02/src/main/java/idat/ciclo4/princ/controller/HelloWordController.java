package idat.ciclo4.princ.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.ciclo4.princ.model.MensajeModel;

@Controller
public class HelloWordController {
	
	@RequestMapping("/helloword")
	
	public String helloword(Model model) {
		
		/*
		
		// De forma normal
		
		MensajeModel mensaje = new MensajeModel();
		
		mensaje.setMessage("HOLA MUNDO");
		mensaje.setDatetime(LocalDateTime.now().toString());
		
		*/
		
		//Con constructor
		
		String tiempo = LocalDateTime.now().toString();
		MensajeModel mensaje = new MensajeModel("HOLA MUNDO", tiempo);
		
		model.addAttribute("Mensaje", mensaje.getMessage());
		model.addAttribute("Hora", "Hora actual: "+mensaje.getDatetime());
		return "helloword";
	}
}
