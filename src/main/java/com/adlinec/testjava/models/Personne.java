package com.adlinec.testjava.models;

public class Personne {

    public static String[] listeCivilite = {"Mlle.", "Me.", "Mr."}; // static pour pas crée nouvelle liste de civilité

    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    public static void test () {
        System.out.println("INFO");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
