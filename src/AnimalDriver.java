public class AnimalDriver{

    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println(animal.toString());


        Animal animal2 = new Animal("giraffe",12,142,"Africa");
        System.out.println(animal2.toString());

        Animal animal3 = new Animal();
        animal3.setType("Lion");
        animal3.setAge(10);
        animal3.setWeight((float) 143.4);
        animal3.setContinents("Africa");

        animal3.getType();
        animal3.getAge();
        animal3.getWeight();
        animal3.getContinents();

        System.out.println(animal3.toString());



    }
}
