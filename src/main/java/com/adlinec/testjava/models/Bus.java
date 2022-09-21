package com.adlinec.testjava.models;

public class Bus extends Vehicule{

    private int nbrDePassager;

    public int coutMaintenanceRoue(){
        return nombreDeRoue * 500;
    }
//methode
    public Bus(int nombreDeRoue, String marque, int nbrDePassager) {
        super(nombreDeRoue, marque);
        this.nbrDePassager = nbrDePassager;
    }
//get et set
    public int getNbrDePassager() {
        return nbrDePassager;
    }


    @Override //pour definir la methode abtraite
    public String info() {
        return super.info();
    }
}
