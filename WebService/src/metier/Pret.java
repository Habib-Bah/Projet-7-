package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="pret")
public class Pret implements Serializable{

	private static final long serialVersionUID = 1L;
	private String datedebut;
	private String datefin;
	private String nomutilisateur;
	private String prenom;
	private String titrelivre;
	private String email;
	private int id;

	public Pret() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pret(String nomUtilisateur, String prenom, String titrelivre, String dateDeDebutDePret,
			String dateDeFinDePret, String email) {
		super();
		this.datedebut = dateDeDebutDePret;
		this.prenom = prenom;
		this.datefin = dateDeFinDePret;
		nomutilisateur = nomUtilisateur;
		this.titrelivre = titrelivre;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomutilisateur() {
		return nomutilisateur;
	}

	public void setNomutilisateur(String nomutilisateur) {
		this.nomutilisateur = nomutilisateur;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}

	public String getDatefin() {
		return datefin;
	}

	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}

	public String getTitrelivre() {
		return titrelivre;
	}

	public void setTitrelivre(String titrelivre) {
		this.titrelivre = titrelivre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
