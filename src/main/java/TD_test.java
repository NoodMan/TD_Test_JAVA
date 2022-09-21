import com.adlinec.testjava.models.Bus;
import com.adlinec.testjava.models.Vehicule;
import com.adlinec.testjava.models.Voiture;

public class TD_test {
    public static void main(String[] args) {

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
        Voiture nouvelVoiture = (Voiture)autreVehicule; //pour le transformer en voiture

//final pour interdire les changements, pas de surcharge (pour une methode)
        final Voiture maNewVoiture = new Voiture("Léon", 40);

        System.out.println(nouvelVoiture.info());

    }


}
