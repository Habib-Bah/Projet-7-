package com.opendevup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opendevup.client.BibliotequeVilleWS;
import com.opendevup.client.BibliothequeService;
import com.opendevup.client.Livre;
import com.opendevup.client.Reservation;
import com.opendevup.model.AppUser;


@Controller
public class ClientController {

	@RequestMapping(value = "/Inscription", method = RequestMethod.GET)
	public String formUser(Model model) {

		model.addAttribute("appuser", new AppUser());
		return "inscriptionform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Model model, AppUser u) {

		BibliothequeService livreS = new BibliothequeService();
		
		
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		bib.inscription(u.getUserName(), u.getPrenom(), u.getEmail(), u.getEncrytedPassword());

		return "resultatInscription";
	}
	
	@RequestMapping(value = "/Connexion", method = RequestMethod.GET)
	public String Connexion(Model model) {

		model.addAttribute("appuser", new AppUser());
		return "connexion";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, AppUser u) {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		boolean res = bib.connexion(u.getEmail(), u.getEncrytedPassword());

		if (res == true) {
			List <Livre> listelivre = new ArrayList();
			listelivre = bib.listedeslivres();
			model.addAttribute("listelivre", listelivre);
			
			return "listeL";
		}

		else {
			return "erreurC";
		}

	}
	
	@RequestMapping(value = "/ListeL", method = RequestMethod.GET)
	public String ListeL(Model model) {
		
		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();
		
		List <Livre> listelivre = new ArrayList();
		listelivre = bib.listedeslivres();
		model.addAttribute("listelivre", listelivre);
		
		return "listeL";
	}
	
	@RequestMapping(value = "/reserV", method = RequestMethod.POST)
	public String reserV(Model model, AppUser u) {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		return "resultatReservation";
	}
	
	@RequestMapping(value = "/Livre")
	public String ListLivre(Model model) {

		return "livre";
	}
	
	@RequestMapping(value = "/Deconnection")
	public String Deconnection(Model model) {

		return "deconnection";
	}
	
	@RequestMapping(value = "/Reservation", method = RequestMethod.GET)
	public String Reservation(Model model) {
		
		
		
		model.addAttribute("reservation", new Reservation());
		
		return "reservations";
	}
	
	@RequestMapping(value = "/findReservation", method = RequestMethod.POST)
	public String findReservation(Model model, Reservation r) {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();
	
		
		List<Object> listeReservation = new ArrayList<>();
		listeReservation = bib.uSerReservation(r.getEmail());

		return "resultReservation";
	}
	
	/*
	@RequestMapping(value = "/touverpret", method = RequestMethod.POST)
	public String touverpret(Model model, Reservation r) {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		List <Object> listepret = new ArrayList<>();
		listepret = bib.uSerReservation(r.getEmail());
		
		return "listpret";
	}
	*/
}
