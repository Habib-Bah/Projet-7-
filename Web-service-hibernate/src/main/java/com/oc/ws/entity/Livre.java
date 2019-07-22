package com.oc.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement(name="livre")
public class Livre {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="titre")
    private String titre;

    @Column(name="nombredepage")
    private int nombredepage;

    @Column(name="categorie")
    private String categorie;

    @Column(name="auteur")
    private String auteur;

    @Column(name="nombreexemplaire")
    private int nombreexemplaire;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNombredepage() {
        return nombredepage;
    }

    public void setNombredepage(int nombredepage) {
        this.nombredepage = nombredepage;
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

    public int getNombreexemplaire() {
        return nombreexemplaire;
    }

    public void setNombreexemplaire(int nombreexemplaire) {
        this.nombreexemplaire = nombreexemplaire;
    }
}
