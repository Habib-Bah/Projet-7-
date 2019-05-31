package com.opendevup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opendevup.client.LivreServiceService;


@Controller
public class ClientController {

	LivreServiceService livreS = new LivreServiceService();
	
	
	@RequestMapping(value = "/Livre")
	public String ListLivre(Model model) {
		
		return "livre";
	}
	
	@RequestMapping(value = "/Roman")
	public String Roman(Model model) {
		
		return "roman";
	}
	
	@RequestMapping(value = "/Economie")
	public String Economie(Model model) {
		
		return "economie";
	}
	
	@RequestMapping(value = "/Science")
	public String Science(Model model) {
		
		return "science";
	}
	
	@RequestMapping(value = "/Droit")
	public String Droit(Model model) {
		
		return "droit";
	}
	
	@RequestMapping(value = "/Musique")
	public String Musique(Model model) {
		
		return "musique";
	}
	
	@RequestMapping(value = "/Sport")
	public String Sport(Model model) {
		
		return "sport";
	}
	
	@RequestMapping(value = "/Inscription")
	public String Inscription(Model model) {
		
		return "inscription";
	}
	
	@RequestMapping(value = "/Connexion")
	public String Connexion(Model model) {
		
		return "connexion";
	}
}
