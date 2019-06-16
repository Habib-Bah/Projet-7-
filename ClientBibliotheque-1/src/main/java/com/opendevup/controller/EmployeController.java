package com.opendevup.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opendevup.client2.BibliotequeVilleWS;
import com.opendevup.client2.BibliothequeService;
import com.opendevup.client2.Pret;
import com.opendevup.model.AppUser;
import com.opendevup.client2.Utilisateur;;

@Controller
public class EmployeController {

	@RequestMapping(value = "/Utilisateurs")
	public String Utilisateurs(Model model) {

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
	public String loginEmploye(Model model, AppUser u) {

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
	public String PretEmployee(Model model) {

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		java.util.List<Pret> pret = new ArrayList<>();
		pret = bib.listPret();

		model.addAttribute("listprets", pret);
		return "PretEmployee";
	}

	@RequestMapping(value = "/DeconnectionEmploye")
	public String DeconnectionEmploye(Model model) {

		return "deconnection";
	}

	@RequestMapping(value = "/ReservationEmploye")
	public String reservationEmploye(Model model) {

		return "reservationEmploye";
	}

	@RequestMapping(value = "/PolongerPourClient")
	public String polongerPourClient(Model model) {

		return "polongerPourClient";
	}
	
	@RequestMapping(value = "/Horaires")
	public String Horaires(Model model) {

		return "Horaires";
	}

}
