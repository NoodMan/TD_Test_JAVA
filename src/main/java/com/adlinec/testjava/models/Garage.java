package com.adlinec.testjava.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Garage {

    protected  String nom;

    protected ArrayList<Voiture> listeVoitures = new ArrayList<>();

    //protected  Voiture [] ListeVoiture = new Voiture[100];

    public Garage(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Voiture> getListeVoitures() {
        return listeVoitures;
    }

    public void setListeVoitures(ArrayList<Voiture> listeVoitures) {
        this.listeVoitures = listeVoitures;
    }

    public void addVoiture (Voiture... tableauVoitures) {

//        for (Voiture voiture : tableauVoitures){
//            listeVoitures.add(voiture);
//            listeVoitures.add(voiture);
//        }
        //ou avec la methode addAll
        Collections.addAll(listeVoitures, tableauVoitures);
    }

}
