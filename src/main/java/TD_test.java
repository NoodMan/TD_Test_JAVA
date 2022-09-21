import com.adlinec.testjava.models.Bus;
import com.adlinec.testjava.models.Vehicule;
import com.adlinec.testjava.models.Voiture;

public class TD_test {
    public static void main(String[] args) {

        Vehicule monTest = new Vehicule(4, "Tesla");
        System.out.println(monTest.getMarque());

        Voiture monTestV = new Voiture("Camaro", 426);
        System.out.println(monTestV.getNombreDeRoue());
        System.out.println(monTestV.fraisKilometrique(100));

        Bus monTestB = new Bus(4, "SETRA", 25);
        System.out.println(monTestB.getNbrDePassager());

        //monTestV.toString()
    }


}
