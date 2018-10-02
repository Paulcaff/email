public class Fraction {

    private int numerator ;
    private int denominator ;


    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public Fraction() {
        this(0, 1);
    }

    public Fraction (int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public String toString() {
        return numerator+"/"+denominator;
    }

    public Fraction add(Fraction fraction2){


        int num1 = (this.numerator * fraction2.denominator)+ (fraction2.numerator * this.denominator);
        int denom1 = (this.denominator * fraction2.denominator);

        Fraction answer = new Fraction(num1,denom1);

        return answer;

    }

    public Fraction subtract(Fraction fraction2){


        int num1 = (this.numerator * fraction2.denominator) - (fraction2.numerator * this.denominator);
        int denom1 = (this.denominator * fraction2.denominator);

        Fraction answer = new Fraction(num1,denom1);

        return answer;

    }

    public Fraction multiply(Fraction fraction2){
        int num1 = (this.numerator * fraction2.numerator);
        int denom1 = (this.denominator * fraction2.denominator);

        Fraction answer = new Fraction(num1,denom1);

        return answer;


    }

    public Fraction divide(Fraction fraction2){
        int num1 = (this.numerator * fraction2.denominator);
        int denom1 = (this.denominator * fraction2.numerator);

        Fraction answer = new Fraction(num1,denom1);

        return answer;


    }
}
