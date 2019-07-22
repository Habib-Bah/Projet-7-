package com.oc.ws.entity;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name="utilisateur")
public class Utilisateur {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String nom;
    @Column
    private String Prenom;
    @Column
    private String motdepasse;
    @Column
    private String email;
    @Column
    private String role;
    public Utilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Utilisateur(String nom, String prenom, String motdepasse, String email) {
        super();
        this.nom = nom;
        this.Prenom = prenom;
        this.motdepasse = motdepasse;
        this.email = email;
        this.role = "user";
    }

    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }


}
