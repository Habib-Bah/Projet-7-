package com.opendevup.metier;

import java.io.Serializable;
import java.util.*;

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
@Table(name = "pret", schema = "public")
@XmlRootElement(name="pret")
public class Pret implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name = "titre")
	@NotNull
	@Size(min=2, max=10) 
	private String titre;
	
	@Column(name = "datedebut")
	@NotNull
	private Date datedebut;
	
	@Column(name = "datefin")
	@NotNull
	private Date datefin;

	public Pret(@NotNull @Size(min = 2, max = 10) String titre, @NotNull Date datedebut, @NotNull Date datefin) {
		super();
		this.titre = titre;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}

	public Pret(Long id, @NotNull @Size(min = 2, max = 10) String titre, @NotNull Date datedebut,
			@NotNull Date datefin) {
		super();
		Id = id;
		this.titre = titre;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}

	public Pret() {
		super();
		
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	
	
	
}
