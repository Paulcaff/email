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

        


    }
}
