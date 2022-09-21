import com.adlinec.testjava.models.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class TD_test {
    public static void main(String[] args) { //void main ne retourne rien

        Vehicule monTest = new Vehicule(4, "Tesla");
        System.out.println(monTest.getMarque());
        System.out.println("");
        Voiture monTestV = new Voiture("Camaro", 426);
        System.out.println(monTestV.getNombreDeRoue());
        System.out.println(monTestV.fraisKilometrique(100));

        Bus monTestB = new Bus(4, "SETRA", 25);
        System.out.println(monTestB.getNbrDePassager());

        //monTestV.toString()
//abstract pas de nouvelle instance
//        Vehicule monVehicule = new Vehicule(2, "Fiat");
//        System.out.println(monVehicule.info());

        Voiture maVoiture = new Voiture("Fiat", 39);
        System.out.println(maVoiture.info());

        Bus monBus = new Bus(8, "Le bus magique", 10);
        System.out.println(monBus.info());
//cast
        Vehicule autreVehicule = maVoiture;
        Voiture nouvelVoiture = (Voiture) autreVehicule; //pour le transformer en voiture

//final pour interdire les changements, pas de surcharge (pour une methode), pas d'heritage pour une classe
        final Voiture maNewVoiture = new Voiture("Léon", 40);

        System.out.println(nouvelVoiture.info());

//static
        Personne.listeCivilite[0] = "Me."; // pour changer un index d'un tableau
        //System.out.println(Personne.listeCivilite[1]);
        for (String civilite : Personne.listeCivilite) {
            System.out.println((civilite));
        }
        for (int i = 0; i < Personne.listeCivilite.length; i++) {
            Personne.listeCivilite[i] = "Autre";
        }
        Personne.test();

//        public void autreMethode() {
//            System.out.println("Hello");
//        }

        Bus bus = new Bus(6, "BIC", 20) {
        };

//Tableau
//        Voiture[] tableauVoiture = new Voiture[50];
//        tableauVoiture[2] = new Voiture("Porche", 309);
//
//        Voiture uneVoiture = new Voiture("renault", 45);
//
//        ArrayList<Voiture> listeVoiture = new ArrayList<>();
//        listeVoiture.add(new Voiture("Opel", 60));
//        listeVoiture.add(new Voiture("Fiat", 70));
//        listeVoiture.add(uneVoiture);
//
//        System.out.println(listeVoiture.get(1).getMarque());

        Garage superVroom = new Garage("Super Vroom Vroom ! ");

        Voiture renault = new Voiture("Renault", 45);

        superVroom.getListeVoitures().add(renault);
        superVroom.getListeVoitures().add(
                new Voiture("Dia", 34)
        );


//add nouvelle voiture
//        superVroom.addVoiture(renault);
//        superVroom.addVoiture(new());

// ou avec Voiture... ligne 33/Garage.java
        superVroom.addVoiture(
                renault,
                new Voiture("Toto", 21),
                new Voiture("Titi", 22)
                );

        //System.out.println(superVroom.getListeVoitures().size());

        ArrayList<Voiture> listeVoiture = new ArrayList<>();
        //pour enlever les doublons
        //HashSet<Voiture> listeVoiture = new HashSet<>();
        listeVoiture.add(renault);
        listeVoiture.add(renault);
        listeVoiture.add(new Voiture("Loulou",40));

        System.out.println(listeVoiture.size());
        Voiture mini = new Voiture("Hummer", 32);
        //HashMap<K = clé, V = valeur>
        HashMap<String, Voiture> mapVoiture = new HashMap<>();
        mapVoiture.put("Renault", renault);
        mapVoiture.put("Mini",new Voiture("Mini", 32));

        System.out.println(mapVoiture.get("Mini").getNbrDeChevaux());

    }
}
