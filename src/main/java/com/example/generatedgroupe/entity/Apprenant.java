package com.example.generatedgroupe.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private int tel;
    private Etat etat;

    @ManyToMany(mappedBy = "apprenants")
    private List<Admnistrateur> admnistrateurs;

    @ManyToOne(cascade = CascadeType.ALL)
    private Groupe groupe;


    public Apprenant() {
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public List<Admnistrateur> getAdmnistrateurs() {
        return admnistrateurs;
    }

    public void setAdmnistrateurs(List<Admnistrateur> admnistrateurs) {
        this.admnistrateurs = admnistrateurs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
