package com.opendevup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import client.BibliotequeVilleWS;
import client.BibliothequeService;
import client.IOException_Exception;
import client.Livre;

import java.util.List;

@Controller
public class LivreController {

	@RequestMapping(value = "/Economie")
	public String Economie(Model model) {

		return "economie";
	}

	@RequestMapping(value = "/Droit")
	public String Droit(Model model) {

		return "droit";
	}

	@RequestMapping(value = "/Science")
	public String Science(Model model) {

		return "science";
	}

	@RequestMapping(value = "/Recherche", method = RequestMethod.GET)
	public String Recherche(Model model) {

		model.addAttribute("livre", new Livre());

		return "recherche";

	}

	@RequestMapping(value = "/findLivre", method = RequestMethod.POST)
	public String findRecherche(Model model, Livre l) throws IOException_Exception {

		
		
		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		List<Livre> livres = bib.listedeslivres();
		
		for(Livre liv : livres) {
			
			if(liv.getTitre().equalsIgnoreCase(l.getTitre())) {
				Livre livre = bib.trouverlivre(l.getTitre());
				
				model.addAttribute("livre", livre);
				
				return "resultatRechecheLivre";
			}
		}

		return "pasDeResultatDelaRecherhceDeLivre";
	}
}
