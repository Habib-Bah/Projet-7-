package com.oc.ws.wsService;


import com.oc.ws.config.AppConfig;
import com.oc.ws.entity.Livre;
import com.oc.ws.entity.Pret;
import com.oc.ws.entity.Reservation;
import com.oc.ws.entity.Utilisateur;
import com.oc.ws.service.LivreService;
import com.oc.ws.service.PretService;
import com.oc.ws.service.ReservationService;
import com.oc.ws.service.UtilisateurService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebService(name = "BibliotequeVilleWS")
public class Bibliotheque {

    List<Livre> livres = new ArrayList<>();
    List<Utilisateur> utilisateurs = new ArrayList<>();
    List<Reservation> listreservation = new ArrayList<>();


    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    LivreService livreService = context.getBean(LivreService.class);
    ReservationService reservationService = context.getBean(ReservationService.class);
    UtilisateurService utilisateurService = context.getBean(UtilisateurService.class);
    PretService pretService = context.getBean(PretService.class);

    @WebMethod(operationName = "Listedeslivres")
    public List<Livre> getLivre() throws IOException {

        try {

            livres = livreService.listLivres();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return livres;
    }


    @WebMethod(operationName = "reservation")
    public void pret(@WebParam(name = "Nomutilisateur") String nomutilisateur, @WebParam(name = "prenom") String prenom,
                     @WebParam(name = "titrelivre") String titrelivre, @WebParam(name = "datedebut") String datedebut,
                     @WebParam(name = "datefin") String datefin, @WebParam(name = "email") String email) throws IOException {

        try {

            Reservation reservation = new Reservation();

            reservation.setDatedebut(datedebut);
            reservation.setDatefin(datefin);
            reservation.setEmail(email);
            reservation.setNomutilisateur(nomutilisateur);
            reservation.setPrenom(prenom);
            reservation.setTitrelivre(titrelivre);

            reservationService.add(reservation);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @WebMethod(operationName = "USerReservation")
    public List USerReservation(@WebParam(name = "email") String email) throws IOException {

        try {
            listreservation = reservationService.listReservationsUser(email);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listreservation;
    }


    @WebMethod(operationName = "inscription")
    public void inscription(@WebParam(name = "nom") String nom, @WebParam(name = "prenom") String prenom,
                            @WebParam(name = "email") String email, @WebParam(name = "motdepasse") String motdepasse) throws IOException {

        try {

            Utilisateur utilisateur = new Utilisateur(nom, prenom, motdepasse, email);

            utilisateurService.add(utilisateur);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @WebMethod(operationName = "connexion")
    public boolean connexion(@WebParam(name = "email") String email, @WebParam(name = "motdepasse") String motdepasse) throws IOException {

        boolean res = false;
        try {

            Utilisateur connexion = utilisateurService.connexion(email, motdepasse);

            if(connexion != null ) res = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res; 
        
        
    }



    @WebMethod(operationName = "prolongerpret")
    public void prolongerPret(@WebParam(name = "nom") String nomutilisateur, @WebParam(name = "prenom") String prenom,
                              @WebParam(name = "titrelivre") String titrelivre, @WebParam(name = "datedebut") String datedebut,
                              @WebParam(name = "datefin") String datefin, @WebParam(name = "email") String email) throws IOException {


        try {

            Reservation reservation = new Reservation();

            reservation.setDatedebut(datedebut);
            reservation.setDatefin(datefin);
            reservation.setEmail(email);
            reservation.setNomutilisateur(nomutilisateur);
            reservation.setPrenom(prenom);
            reservation.setTitrelivre(titrelivre);

            reservationService.add(reservation);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @WebMethod(operationName = "trouverlivre")
    public Livre trouverlivre(@WebParam(name = "titrelivre") String titrelivre) throws IOException {

        Livre l = new Livre();

        try {

            l = livreService.trouverlivre(titrelivre);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return l;
    }



    @WebMethod(operationName = "listUser")
    public List<Utilisateur> listUser() throws IOException {
        List<Utilisateur> listUser = new ArrayList<>();

        try {
           listUser =  utilisateurService.listUtilisateurs();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listUser;
    }


    @WebMethod(operationName = "connexionEquipe")
    public boolean connexionEquipe(@WebParam(name = "email") String email,
                                   @WebParam(name = "motdepasse") String motdepasse) throws IOException {

        boolean res = true;

        try {

            Utilisateur utilisateurs = utilisateurService.connexion(email, motdepasse);

            if(utilisateurs != null){

                return "admin".equalsIgnoreCase(utilisateurs.getRole());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    @WebMethod(operationName = "ListPret")
    public List<Pret> ListPret() throws IOException {
        List<Pret> prets = new ArrayList();

        try {

            pretService.listPrets();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return prets;
    }


    @WebMethod(operationName = "Retour")
    public void Retour(@WebParam(name = "email") String email, @WebParam(name = "titrelivre") String titrelivre) throws IOException {

        try {

            Reservation reservation = reservationService.retour(email, titrelivre);

            reservationService.delete(reservation);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
