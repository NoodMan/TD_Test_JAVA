package com.adlinec.testjava.models;

public class Bus extends Vehicule{

    private int nbrDePassager;
//methode
    public Bus(int nombreDeRoue, String marque, int nbrDePassager) {
        super(nombreDeRoue, marque);
        this.nbrDePassager = nbrDePassager;
    }
//get et set
    public int getNbrDePassager() {
        return nbrDePassager;
    }


}
