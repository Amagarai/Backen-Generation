package com.example.generatedgroupe.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Travaux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private LocalDate debut;
    private LocalDate fin;
    private String description;
    private int nombre;
    private Type type;
    @ManyToMany(mappedBy = "travaux")
    @JsonIgnore
    private List<Admnistrateur> admnistrateurs;

    @OneToMany(mappedBy = "travaux", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Groupe> groupes;

    public Travaux() {
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public List<Admnistrateur> getAdmnistrateurs() {
        return admnistrateurs;
    }

    public void setAdmnistrateurs(List<Admnistrateur> admnistrateurs) {
        this.admnistrateurs = admnistrateurs;
    }

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<Groupe> groupes) {
        this.groupes = groupes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDebut() {
        return debut;
    }

    public void setDebut(LocalDate debut) {
        this.debut = debut;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
