package com.adlinec.testjava.models;

public class Voiture extends Vehicule{

    private int nbrDeChevaux;

//methode
    public Voiture(String marque, int nbrDeChevaux) {
        super(4, marque);
        this.nbrDeChevaux = nbrDeChevaux;


    }
//get et set
    public int getNbrDeChevaux() {
        return nbrDeChevaux;
    }

    public void setNbrDeChevaux(int nbrDeChevaux) {
        this.nbrDeChevaux = nbrDeChevaux;
    }
    public int fraisKilometrique(int nbrKilometre){
        return nbrKilometre * nbrDeChevaux * 34;
    }

}
