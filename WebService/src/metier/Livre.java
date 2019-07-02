package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="livre")
public class Livre implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String titre;
	private int nombredepage;
	private String categorie;
	private String auteur;
	private int nombreexemplaire;
	
	public Livre(String titre, int pages, String categorie, String auteur, int nombreexemplaire) {
		super();
		this.titre = titre;
		this.nombredepage = pages;
		this.categorie = categorie;
		this.auteur = auteur;
		this.nombreexemplaire = nombreexemplaire;
	}
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNombredepage() {
		return nombredepage;
	}
	public void setNombredepage(int nombredepage) {
		this.nombredepage = nombredepage;
	}
	public int getNombreexemplaire() {
		return nombreexemplaire;
	}
	public void setNombreexemplaire(int nombreexemplaire) {
		this.nombreexemplaire = nombreexemplaire;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
		
}
