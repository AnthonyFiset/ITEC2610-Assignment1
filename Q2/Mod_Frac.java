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
    // Convert the decimal to a string to get the numerator and denominator
    String str = Double.toString(number);
    int index = str.indexOf('.');
    int denominator = (int) Math.pow(10, str.length() - index - 1);
    int numerator = (int) (number * denominator);

    // Simplify the fraction
    int gcd = getGCD(numerator, denominator);
    this.numerator = numerator / gcd;
    this.denominator = denominator / gcd;

    System.out.println("The Fraction: " + numerator + "/" + denominator);

    System.out.println("The Fraction Simplified: " + this.numerator + "/" + this.denominator);
  }

    //Getting the GCD

    public int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    //Part C

    //Fraction to decimal
    
    public double toDecimal(int numerator, int denominator) {
        double decimal = (double) numerator / denominator;
        this.numerator = numerator;
        this.denominator = denominator;
        System.out.println("The Decimal: " + decimal);
        return decimal;
    }

    //Part D

    //Addition

    public Mod_Frac add(Mod_Frac other) {
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Mod_Frac(newNumerator, newDenominator);
    }

    //Subtraction

    public Mod_Frac subtract(Mod_Frac other) {
        int newNumerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Mod_Frac(newNumerator, newDenominator);
    }

}