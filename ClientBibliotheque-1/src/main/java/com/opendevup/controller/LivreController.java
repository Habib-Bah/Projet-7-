package com.opendevup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

import com.opendevup.client2.BibliotequeVilleWS;
import com.opendevup.client2.BibliothequeService;
import com.opendevup.client2.Livre;

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
	public String findRecherche(Model model, Livre l) {

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
