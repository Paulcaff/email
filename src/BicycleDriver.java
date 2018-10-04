import javax.swing.*;


public class BicycleDriver {

    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle("Paul", "bmx",  200);

        Bicycle bicycle3 = new Bicycle();

        System.out.println(bicycle1.toString());

        Bicycle bicycle2 = createBike();

         bicycle3 = setValues(bicycle3);

        System.out.println(bicycle2.toString());

        System.out.println(bicycle3.toString());

        double totalValue = bicycle3.getValue() + bicycle2.getValue();


        System.out.println(bicycle2.getName() + bicycle3.getName());
        System.out.println(totalValue);



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

        value += 10 ;


        bike.setName(name);
        bike.setValue(value);
        bike.setMake(make);

        return bike;


    }





}
