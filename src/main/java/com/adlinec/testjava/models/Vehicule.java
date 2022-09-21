package com.adlinec.testjava.models;

public class Vehicule { //public abstract class Vehicule --> pas possible de crée de nouveau vehicule

    protected int nombreDeRoue;

    protected String marque;

    public Vehicule(int nombreDeRoue, String marque) {
        this.nombreDeRoue = nombreDeRoue;
        this.marque = marque;
    }

    public String info () {
        return "Véhicules sans catégorie à " + nombreDeRoue + " roues";
    }

//    public abstract String info ();  //methode abtraite
    public int getNombreDeRoue() {
        return nombreDeRoue;
    }

    public void setNombreDeRoue(int nombreDeRoue) {
        this.nombreDeRoue = nombreDeRoue;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

}
