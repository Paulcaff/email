public class CarDriver {
    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car("Ford Mondeo",2,123456,1.4);
        Car car2 = new Car();

        System.out.println(car.toString());
        System.out.println(car1.toString());

        car2 = car2.createCar();


    }
}


