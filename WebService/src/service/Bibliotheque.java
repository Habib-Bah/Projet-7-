package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import config.Configuration;
import metier.Livre;
import metier.Pret;
import metier.Reservation;
import metier.Utilisateur;

@WebService(name = "BibliotequeVilleWS")
public class Bibliotheque {

	List<Livre> livres = new ArrayList<>();
	List<Utilisateur> utilisateurs = new ArrayList<>();
	List<Reservation> listreservation = new ArrayList<>();

	Connection connection;
	Statement statement;
	ResultSet result;
	//String baseDeDonnee = conf.getMotDepasse();

	@WebMethod(operationName = "Listedeslivres")
	public List<Livre> getLivre() throws IOException {

		Configuration conf = new Configuration();
		
		try {

			Class.forName("org.postgresql.Driver").newInstance();
			//connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bibliotheque");
			connection = DriverManager.getConnection(conf.getMotDepasse());
			statement = connection.prepareStatement("select * from livre");

			statement = connection.createStatement();
			result = statement.executeQuery("select * from livre");

			while (result.next()) {

				String auteur = result.getString(2);
				String titre = result.getString(3);
				int nombredepages = result.getInt(4);
				int nombreexemplaire = result.getInt(5);
				String categorie = result.getString(6);

				Livre l = new Livre();
				l.setAuteur(auteur);
				l.setTitre(titre);
				l.setNombredepage(nombredepages);
				l.setNombreexemplaire(nombreexemplaire);
				l.setCategorie(categorie);
				livres.add(l);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return livres;
	}

	@WebMethod(operationName = "reservation")
	public void pret(@WebParam(name = "Nomutilisateur") String nomutilisateur, @WebParam(name = "prenom") String prenom,
			@WebParam(name = "titrelivre") String titrelivre, @WebParam(name = "datedebut") String datedebut,
			@WebParam(name = "datefin") String datefin, @WebParam(name = "email") String email) throws IOException {
		
		Configuration conf = new Configuration();

		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());
			statement = connection.createStatement();
			String sql = "insert into reservation (nomutilisateur, prenom, titrelivre, datedebut, datefin, email) values ( '"
					+ nomutilisateur + "', '" + prenom + "' ,'" + titrelivre + "', '" + datedebut + "', '" + datefin
					+ "','" + email + "')";
			statement.executeQuery(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@WebMethod(operationName = "USerReservation")
	public List USerReservation(@WebParam(name = "email") String email) throws IOException {

		// List<Reservation> listreservation = new ArrayList<>();
		Configuration conf = new Configuration();

		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());
			statement = connection.createStatement();
			String sql = "(select * from reservation where email = '" + email + "')";
			result = statement.executeQuery(sql);

			while (result.next()) {
				if (result.getString(7).equalsIgnoreCase(email)) {
					Reservation r = new Reservation();
					r.setNomutilisateur(result.getString(2));
					r.setPrenom(result.getString(3));
					r.setTitrelivre(result.getString(4));
					r.setDatedebut(result.getString(5));
					r.setDatefin(result.getString(6));
					r.setEmail(email);

					listreservation.add(r);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listreservation;
	}

	@WebMethod(operationName = "inscription")
	public void inscription(@WebParam(name = "nom") String nom, @WebParam(name = "prenom") String prenom,
			@WebParam(name = "email") String email, @WebParam(name = "motdepasse") String motdepasse) throws IOException {

		Utilisateur utilisateur = new Utilisateur(nom, prenom, motdepasse, email);
		utilisateurs.add(utilisateur);
		
		Configuration conf = new Configuration();

		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());

			statement = connection.createStatement();
			String sql = "insert into utilisateurs (nom, prenom, email, motdepasse, role) values ('" + nom + "','"
					+ prenom + "', '" + email + "','" + motdepasse + "', 'user')";
			statement.executeQuery(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@WebMethod(operationName = "connexion")
	public boolean connexion(@WebParam(name = "email") String email, @WebParam(name = "motdepasse") String motdepasse) throws IOException {

		boolean res = false;
		Configuration conf = new Configuration();
		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());

			statement = connection.createStatement();
			String sql = "select * from utilisateurs";
			result = statement.executeQuery(sql);

			while (result.next()) {

				if ((result.getString(4).equalsIgnoreCase(email))
						&& (result.getString(5).equalsIgnoreCase(motdepasse))) {
					res = true;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@WebMethod(operationName = "prolongerpret")
	public void prolongerPret(@WebParam(name = "nom") String nomutilisateur, @WebParam(name = "prenom") String prenom,
			@WebParam(name = "titrelivre") String titrelivre, @WebParam(name = "datedebut") String datedebut,
			@WebParam(name = "datefin") String datefin, @WebParam(name = "email") String email) throws IOException {

		List<Reservation> listreservation = new ArrayList<>();
		Reservation reservation = new Reservation(nomutilisateur, prenom, titrelivre, datedebut, datefin, email);
		listreservation.add(reservation);
		
		Configuration conf = new Configuration();
		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());
			statement = connection.createStatement();
			String sql = "insert into reservation (nomutilisateur, prenom, titrelivre, datedebut, datefin, email) values ( '"
					+ nomutilisateur + "', '" + prenom + "' '" + titrelivre + "', '" + datedebut + "', '" + datefin
					+ "', '" + email + "')";
			statement.executeQuery(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@WebMethod(operationName = "trouverlivre")
	public Livre trouverlivre(@WebParam(name = "titrelivre") String titrelivre) throws IOException {

		Livre l = new Livre();
		Configuration conf = new Configuration();

		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());
			statement = connection.createStatement();
			String sql = "select * from livre";
			result = statement.executeQuery(sql);

			while (result.next()) {
				if (result.getString(3).equalsIgnoreCase(titrelivre)) {
					l.setTitre(titrelivre);
					l.setNombreexemplaire(result.getInt(5));
					l.setNombredepage(result.getInt(4));
					l.setAuteur(result.getString(2));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return l;
	}

	@WebMethod(operationName = "listUser")
	public List<Utilisateur> listUser() throws IOException {
		List<Utilisateur> listUser = new ArrayList<>();
		Configuration conf = new Configuration();

		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());
			statement = connection.createStatement();
			String sql = "select * from utilisateurs";
			result = statement.executeQuery(sql);

			while (result.next()) {
				Utilisateur u = new Utilisateur();
				u.setNom(result.getString(2));
				u.setPrenom(result.getString(3));
				u.setEmail(result.getString(4));
				u.setMotdepasse(result.getString(5));
				u.setRole(result.getString(6));
				listUser.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listUser;
	}

	@WebMethod(operationName = "connexionEquipe")
	public boolean connexionEquipe(@WebParam(name = "email") String email,
			@WebParam(name = "motdepasse") String motdepasse) throws IOException {

		boolean res = true;
		Configuration conf = new Configuration();
		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());

			statement = connection.createStatement();
			String sql = "select * from utilisateurs";
			result = statement.executeQuery(sql);

			while (result.next()) {

				if (result.getString(4).equals(email) && result.getString(5).equals(motdepasse)) {

					if (result.getString(6).equalsIgnoreCase("admin")) {
						res = true;
					}

					else {
						res = false;
					}

				} else {
					res = false;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@WebMethod(operationName = "ListPret")
	public List<Pret> ListPret() throws IOException {
		List<Pret> prets = new ArrayList();
		Configuration conf = new Configuration();

		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());

			statement = connection.createStatement();
			String sql = "select * from reservation";
			result = statement.executeQuery(sql);

			while (result.next()) {
				Pret p = new Pret();
				p.setNomutilisateur(result.getString(2));
				p.setPrenom(result.getString(3));
				p.setTitrelivre(result.getString(4));
				p.setDatedebut(result.getString(5));
				p.setDatefin(result.getString(6));
				p.setEmail(result.getString(7));
				prets.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return prets;
	}
	
	@WebMethod(operationName = "Retour")
	public void Retour(@WebParam(name = "email") String email, @WebParam(name = "titrelivre") String titrelivre) throws IOException {
	
		Configuration conf = new Configuration();
		try {

			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager.getConnection(conf.getMotDepasse());

			statement = connection.createStatement();
			
			String sql = "delete from reservation where titrelivre like '"+titrelivre+"' and email like '"+email+"'";
			statement.executeQuery(sql);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
