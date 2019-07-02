package com.opendevup;

import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.TimerTask;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.opendevup.client2.client2.BibliotequeVilleWS;
import com.opendevup.client2.client2.BibliothequeService;
import com.opendevup.client2.client2.Pret;
import com.opendevup.client2.client2.Utilisateur;

public class SchedulerMain extends TimerTask {

	Date current;
	int cnt = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		BibliothequeService livreS = new BibliothequeService();
		BibliotequeVilleWS bib = livreS.getBibliotequeVilleWSPort();

		List<Pret> prets = bib.listPret();
		List<Utilisateur> users = bib.listUser();

		for (Pret p : prets) {

			for (Utilisateur u : users) {

				if (p.getEmail().equalsIgnoreCase(u.getEmail())) {

					final String username = "habibelmundo@gmail.com";
					final String password = "aeoneflux14";

					Properties props = new Properties();
					props.put("mail.smtp.host", "smtp.gmail.com");
					props.put("mail.smtp.port", "587");
					props.put("mail.smtp.auth", "true");
					props.put("mail.smtp.starttls.enable", "true");

					Session session = Session.getInstance(props, new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username, password);
						}
					});

					try {

						Message message = new MimeMessage(session);
						message.setFrom(new InternetAddress("habibelmundo@gmail.com"));
						message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(u.getEmail()));
						message.setSubject("Retour de pret");
						message.setText("Bonjour " + p.getPrenom() + ", votre pret pour le livre " + p.getTitrelivre()
								+ " prend fin le " + p.getDatefin()
								+ ". N'oubliez pas de retourner votre pret avant cette date. Bien cordialement");

						Transport.send(message);

						System.out.println("Envoyé avec succès");

					} catch (MessagingException e) {
						e.printStackTrace();
					}
				}

			}
		}
	}
}
