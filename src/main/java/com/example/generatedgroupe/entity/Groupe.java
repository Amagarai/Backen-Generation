package com.example.generatedgroupe.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private String theme;
    private String nom;
    private int nombre;

    @ManyToMany(mappedBy = "groupes")
    @JsonIgnore
    private List<Admnistrateur> admnistrateurs;

    @OneToMany(mappedBy = "groupe", cascade = CascadeType.ALL)
    private List<Apprenant> apprenants;

    @ManyToOne(cascade = CascadeType.ALL)
    private Travaux travaux;

    public Groupe() {
    }

    //public String getTheme() {
      //  return theme;
    //}

    //public void setTheme(String theme) {
     //   this.theme = theme;
   // }

    public Travaux getTravaux() {
        return travaux;
    }

    public void setTravaux(Travaux travaux) {
        this.travaux = travaux;
    }

    public List<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(List<Apprenant> apprenants) {
        this.apprenants = apprenants;
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

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
}
