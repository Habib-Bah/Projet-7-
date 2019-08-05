package com.opendevup.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opendevup.model.AppUser;

import client.BibliotequeVilleWS;
import client.BibliothequeService;
import client.IOException_Exception;
import client.Pret;
import client.Reservation;
import client.Retour;
import client.Utilisateur;;

@Controller
public class EmployeController {

	@RequestMapping(value = "/Utilisateurs")
	public String Utilisateurs(Model model) throws IOException_Exception {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		java.util.List<Utilisateur> user;
		user = bib.listUser();

		model.addAttribute("listusers", user);

		return "listUsers";
	}

	@RequestMapping(value = "/ConnexionEmploye", method = RequestMethod.GET)
	public String ConnexionEmploye(Model model) {

		model.addAttribute("appuser", new AppUser());
		return "connexionEmploye";
	}

	@RequestMapping(value = "/ConnexionE", method = RequestMethod.GET)
	public String ConnexionE(Model model) {

		model.addAttribute("appuser", new AppUser());
		return "connexionE";
	}

	@RequestMapping(value = "/loginEmploye", method = RequestMethod.POST)
	public String loginEmploye(Model model, AppUser u) throws IOException_Exception {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		java.util.List<Utilisateur> user;
		user = bib.listUser();

		boolean res = bib.connexion(u.getEmail(), u.getEncrytedPassword());

		if (res == true) {

			for (Utilisateur us : user) {
				if (us.getEmail().equalsIgnoreCase(u.getEmail())) {
					if (us.getRole().equalsIgnoreCase("admin")) {
						return "pageEmploye";
					}

					else {
						return "ErreurCEE";
					}
				}
			}
		}

		return "ErreurCE";
	}

	@RequestMapping(value = "/PretEmployee")
	public String PretEmployee(Model model) throws IOException_Exception {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		java.util.List<Pret> pret = new ArrayList<>();
		pret = bib.listPret();

		model.addAttribute("listprets", pret);
		
	
		return "PretEmployee";
	}

	@RequestMapping(value = "/RetourE", method = RequestMethod.GET)
	public String RetourE(Model model) {

		model.addAttribute("retour", new Retour());
		return "retourE";
	}

	@RequestMapping(value = "/SaveRetourE", method = RequestMethod.POST)
	public String SaveRetourE(Model model, Retour r) throws IOException_Exception {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		
		java.util.List<Pret> pret = new ArrayList<>();
		pret = bib.listPret();

		for (Pret p : pret) {

			if (p.getEmail().equalsIgnoreCase(r.getEmail()) && p.getTitrelivre().equalsIgnoreCase(r.getTitrelivre())) {
				bib.retour(r.getEmail(), r.getTitrelivre());

				return "SaveRetourE";
			}
		}


		return "erreurRetourE";

	}

	@RequestMapping(value = "/DeconnectionEmploye")
	public String DeconnectionEmploye(Model model) {

		return "deconnection";
	}

	@RequestMapping(value = "/ReservationEmploye")
	public String reservationEmploye(Model model) {

		model.addAttribute("reservation", new Reservation());
		return "reservationEmploye";
	}

	@RequestMapping(value = "/SaveRE")
	public String SaveRE(Model model, Reservation r) throws IOException_Exception  {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		String pattern = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		Date today = Calendar.getInstance().getTime();
		String datedebut = df.format(today);
		today.setMonth(today.getMonth() + 1);
		String datefin = df.format(today);

		bib.reservation(r.getNomutilisateur(), r.getPrenom(), r.getTitrelivre(), datedebut, datefin, r.getEmail());

		return "confirmRE";
	}

	@RequestMapping(value = "/PolongerPourClient", method = RequestMethod.GET)
	public String polongerPourClient(Model model) {

		model.addAttribute("reservation", new Reservation());
		return "polongerPourClient";
	}
	
	@RequestMapping(value = "/EProlonger", method = RequestMethod.POST)
	public String EProlonger(Model model, Reservation r) throws IOException_Exception {
		
		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();
		
		
		java.util.List <Pret> prets = new ArrayList();
		java.util.List <Utilisateur> users = new ArrayList();
		
		prets = bib.listPret();
		users = bib.listUser();
		
		String pattern = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		Date today = Calendar.getInstance().getTime();
		String datedebut = df.format(today);
		today.setMonth(today.getMonth() + 1);
		String datefin = df.format(today);
		
		
		for(Pret p : prets) {
			
			if(p.getEmail().equalsIgnoreCase(r.getEmail()) && p.getTitrelivre().equalsIgnoreCase(r.getTitrelivre())) {
				
				bib.retour(r.getEmail(), r.getTitrelivre());
				bib.reservation(r.getNomutilisateur(), r.getPrenom(), r.getTitrelivre(), datedebut, datefin, r.getEmail());
				return "confirmationPE";
			}
		}
		
		
		
		return "mauvaisEMailE";
		
	}

	@RequestMapping(value = "/Horaires")
	public String Horaires(Model model) {

		return "Horaires";
	}

	@RequestMapping(value = "/PageEmploye")
	public String PageEmploye(Model model) {

		return "pageEmploye";
	}

}
