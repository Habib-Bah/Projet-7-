package com.opendevup;

import java.util.Date;
import java.util.List;
import java.util.TimerTask;

import com.opendevup.client2.client2.BibliotequeVilleWS;
import com.opendevup.client2.client2.BibliothequeService;
import com.opendevup.client2.client2.Pret;

public class SchedulerMain extends TimerTask {

	Date current;
	int cnt = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		/*
		 * current = new Date(); System.out.println("La date et l'heure actuelle est :"
		 * +current); cnt ++;
		 * 
		 * if(cnt == 5) { System.out.println("EXIT."); System.exit(0); }
		 */

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		List<Pret> prets = bib.listPret();

		for (Pret p : prets) {
			System.out.println("Bonjour " + p.getPrenom() + " , n'oubliez pas de rendre votre livre" + p.getTitrelivre()
					+ " le " + p.getDatefin() + " .Bonne lecture. Cordialement");
			cnt++;
		}

		if (cnt == prets.size()) {
			System.out.println("EXIT.");
			System.exit(0);
		}
	}

}
