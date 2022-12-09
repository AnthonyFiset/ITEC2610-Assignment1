import java.math.*;

class Mod_Frac {
    
    //Part A

    //Integer for numerator(n) & denominator(d)
    private int numerator;
    private int denominator;

    public Mod_Frac(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        System.out.println("Your Numerator is: " +  numerator);
        System.out.println("Your Denominator is: " + denominator);
        System.out.println("Fraction is: " + numerator + "/" + denominator);
    }

    //Part B

    public Mod_Frac(double number) {
        String string = Double.toString(number);
        int digitsDec = string.length() - 1 - string.indexOf('.');

        int denom = 1;
        for (int i = 0; i < digitsDec; i++) {
            number *= 10;
            denom *= 10;
        }

        int num = (int)Math.round(number);


        this.numerator = num;
        this.denominator = denom;

        System.out.println("The Fraction: " + num + "/" + denom);

    }

    //Getting the GCD

    public int getGCD(int x, int y) {

        int i, gcd = 1;

        for(i = Math.min(x, y); i > 1; i--) {

            if(x % i == 0 && y % i == 0) {
                gcd = i;
                return gcd;
            }

        }

        return gcd;

    }

}
