import javax.swing.*;

public class Car {
    private String model;
    private double engine;
    private double mileage;
    private int preOwners;

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setPreOwners(int preOwners) {
        this.preOwners = preOwners;
    }

    public double getEngine() {
        return engine;
    }

    public double getMileage() {
        return mileage;
    }

    public int getPreOwners() {
        return preOwners;
    }

    public String getModel() {
        return model;
    }

    public Car(String model,int preOwners,double mileage,double engine){
        setEngine(engine);
        setMileage(mileage);
        setModel(model);
        setPreOwners(preOwners);
    }

    public Car(){
        this.engine = 1.4;
        this.mileage = 100000 ;
        this.model = "Opel Astra" ;
        this.preOwners = 2;
    }


    public String toString() {
      return "Model: "+model+"\nEngine: "+engine+"\nMileage: "+mileage+"\nPrevious Owners: "+preOwners;
    }

    public Car createCar(){

        String model = JOptionPane.showInputDialog(null,"Please enter the model of your car:");
        double engine =Double.parseDouble( JOptionPane.showInputDialog(null,"Please enter the engine size of your car:"));
        int preOwners = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of previous owners of your car:"));
        double mileage =Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the mileage of your car:"));

        Car car2 = new Car( model, preOwners, mileage,engine);

        double service = mileage %25000;

        JOptionPane.showMessageDialog(null,"your last service "+ service+ " miles ago");


       return car2;
    }




    }



