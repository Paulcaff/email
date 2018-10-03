import javax.swing.*;
import java.sql.SQLOutput;

public class BicycleDriver {

    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle("Paul", "bmx",  200);

        Bicycle bicycle3 = new Bicycle();

        System.out.println(bicycle1.toString());

        Bicycle bicycle2 = createBike();

         bicycle3 = setValues(bicycle3);

        System.out.println(bicycle2.toString());




    }


    public static Bicycle createBike() {
        String name = JOptionPane.showInputDialog(null, "Please enter your name: ");
        String make = JOptionPane.showInputDialog(null, "Please enter your make of bike: ");
        double value = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the value of the bike:"));

        Bicycle bike = new Bicycle(name, make, value);

        return bike;

    }

    public static Bicycle setValues(Bicycle bike){

        String name = JOptionPane.showInputDialog(null, "Please enter your name: ");
        String make = JOptionPane.showInputDialog(null, "Please enter your make of bike: ");
        double value = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the value of the bike:"));

        bike.setName(name);
        bike.setValue(value);
        bike.setMake(make);

        return bike;


    }





}
