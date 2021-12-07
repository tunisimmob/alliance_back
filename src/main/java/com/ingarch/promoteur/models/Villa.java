package com.ingarch.promoteur.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Villa")
public class Villa implements Serializable {
    @ManyToOne
    private Projet projet;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombrechambre")
    private String nombrechambre;


    @Column(name = "type")
    private String type;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "nom")
    private String nom;

    @Column(name = "surfacetotale")
    private Integer surfacetotale;

    @Column(name = "surfacecouvrante")
    private Integer surfacecouvrante;


    @Column(name = "plan")
    private String plan;


    @Column(name = "emplacement")
    private String emplacement;

    @Column(name = "images")
    @ElementCollection
    List<String> images;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getSurfacetotale() {
        return surfacetotale;
    }

    public void setSurfacetotale(Integer surfacetotale) {
        this.surfacetotale = surfacetotale;
    }

    public Integer getSurfacecouvrante() {
        return surfacecouvrante;
    }

    public void setSurfacecouvrante(Integer surfacecouvrante) {  this.surfacecouvrante = surfacecouvrante;    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getNombrechambre() {
        return nombrechambre;
    }

    public void setNombrechambre(String nombrechambre) {
        this.nombrechambre = nombrechambre;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

}
