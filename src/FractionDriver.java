import java.sql.SQLOutput;

public class FractionDriver {
    public static void main(String[] args) {

        Fraction fraction = new Fraction(15,25);
        Fraction fraction2 = new Fraction(10,20);
        Fraction fraction3 = new Fraction();
        Fraction fraction4= new Fraction();
        Fraction fraction5= new Fraction();
        Fraction fraction6= new Fraction();

        System.out.println(fraction.toString());


        fraction3 = fraction.add(fraction2);
        System.out.println(fraction3);

        fraction4 = fraction.subtract(fraction2);
        System.out.println(fraction4);

        fraction5 = fraction.multiply(fraction2);
        System.out.println(fraction5);

        fraction6 = fraction.divide(fraction2);
        System.out.println(fraction6);




    }
}
