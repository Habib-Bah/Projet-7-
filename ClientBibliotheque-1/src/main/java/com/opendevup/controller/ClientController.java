package com.opendevup.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opendevup.client.BibliotequeVilleWS;
import com.opendevup.client.BibliothequeService;
import com.opendevup.client.Livre;
import com.opendevup.client.Reservation;
import com.opendevup.client2.Pret;
import com.opendevup.client2.Retour;
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

		com.opendevup.client2.BibliothequeService livreS = new com.opendevup.client2.BibliothequeService();
		com.opendevup.client2.BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();
	
		
		java.util.List<Pret> pret = new ArrayList<>();
		pret = bib.listPret();
		java.util.List<Pret>  prets = new ArrayList<>();
		
		for(Pret p : pret) {
			if(p.getEmail().equalsIgnoreCase(r.getEmail())) {
				Pret pr = new Pret();
				pr.setNomutilisateur(p.getNomutilisateur());
				pr.setPrenom(r.getPrenom());
				pr.setEmail(p.getEmail());
				pr.setTitrelivre(p.getTitrelivre());
				pr.setDatedebut(pr.getDatedebut());
				pr.setDatefin(p.getDatefin());
				prets.add(pr);
				
				
			}
		}
		
		model.addAttribute("prets", prets);
		return "resultReservation";

		
	}
	
	/*
	@RequestMapping(value = "/touverpret", method = RequestMethod.GET)
	public String touverpret(Model model, Reservation r) {

		
		return "listpret";
	}
	*/
	
	@RequestMapping(value = "/Recherche", method = RequestMethod.GET)
	public String Recherche(Model model) {
		
		model.addAttribute("livre", new Livre());
		
		return "recherche";
	}
	
	@RequestMapping(value = "/findLivre", method = RequestMethod.POST)
	public String findRecherche(Model model, Livre l) {

		com.opendevup.client2.BibliothequeService livreS = new com.opendevup.client2.BibliothequeService();
		com.opendevup.client2.BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();
		com.opendevup.client2.Livre livre = bib.trouverlivre(l.getTitre());
		
		List<com.opendevup.client2.Livre> livres = bib.listedeslivres();
		
		for(com.opendevup.client2.Livre li : livres) {
			if(li.getTitre().equalsIgnoreCase(livre.getTitre())) {
				model.addAttribute(livre);
				return "resultatRechecheLivre";
			}
			
		}
		
		return "pasDeResultatDelaRecherhceDeLivre";
		
	}
	
	@RequestMapping(value = "/Sport")
	public String Sport(Model model) {

		return "sport";
	}
	
	@RequestMapping(value = "/Musique")
	public String Musique(Model model) {

		return "musique";
	}
	
	
	@RequestMapping(value = "/index")
	public String listeL(Model model) {

		return "index";
	}
	
	@RequestMapping(value = "/RetourDePret", method = RequestMethod.GET)
	public String RetourDePret(Model model, String titrelivre) {

		model.addAttribute("retour", new Retour());
		Livre l = new Livre();
		l.setTitre(titrelivre);
		model.addAttribute("titrelivre", l.getTitre());
		return "RetourDePret";
	}
	
	@RequestMapping(value = "/ConfirmRetourDePret", method = RequestMethod.POST)
	public String ConfirmRetourDePret(Model model, Retour r) {
		
		com.opendevup.client2.BibliothequeService livreS = new com.opendevup.client2.BibliothequeService();
		com.opendevup.client2.BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();
		bib.retour(r.getEmail(), r.getTitrelivre());
		
		return "ConfirmRetourDePret";
		
	}
	
	@RequestMapping(value = "/reserver", method = RequestMethod.GET)
	public String reserver(Model model) {
		
		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();
		
		List <Livre> listelivre = new ArrayList();
		listelivre = bib.listedeslivres();
		model.addAttribute("listelivre", listelivre);
		model.addAttribute("reservation", new Reservation()); 

		return "reserver";
	}
	
	@RequestMapping(value = "/CReserver", method = RequestMethod.POST)
	public String CReserver(Model model, Reservation r) {
		
		com.opendevup.client2.BibliothequeService livreS = new com.opendevup.client2.BibliothequeService();
		com.opendevup.client2.BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();
		
		String pattern = "MM/dd/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		Date today = Calendar.getInstance().getTime();
		String datedebut = df.format(today);
		today.setMonth(today.getMonth() + 1);
		String datefin = df.format(today);
		
		bib.reservation(r.getNomutilisateur(), r.getPrenom(), r.getTitrelivre(), datedebut , datefin, r.getEmail());
		
		return "ConfReser";
		
	}
}
