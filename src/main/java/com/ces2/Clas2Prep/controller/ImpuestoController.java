package com.ces2.Clas2Prep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ces2.Clas2Prep.model.Impuesto;



@Controller
public class ImpuestoController {
	
	@GetMapping("/impuesto")
	public String greetingForm(Model model) {
		model.addAttribute("impuesto",new Impuesto());
		return "impuesto";
	}	
	
	@PostMapping("/impuesto")
		public String greetingSubmit(@ModelAttribute Impuesto impuesto, Model model) {
		double impuestoCalculado = impuesto.calcularImpuesto();
		model.addAttribute("calculo",impuestoCalculado);
		model.addAttribute("impuesto", impuesto);
		return "impuestoresult";
	}

}
