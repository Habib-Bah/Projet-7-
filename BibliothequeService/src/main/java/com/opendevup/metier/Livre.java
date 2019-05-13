package com.opendevup.metier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "livre", schema = "public")
@XmlRootElement(name="livre")
public class Livre implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name = "titre")
	@NotNull
	@Size(min=2, max=10) 
	private String titre;
	
	@Column(name = "titre")
	@NotNull
	private int nombredepages;
	
	@Column(name = "categorie")
	@NotNull
	private String categorie;
	
	

	public Livre(@NotNull @Size(min = 2, max = 10) String titre, String categorie, int nombredepages) {
		super();
		this.titre = titre;
		this.nombredepages = nombredepages;
		this.categorie = categorie;
	}
	
	

	public Livre() {
		super();
		
	}



	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getCategorie() {
		return categorie;
	}



	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	

}
