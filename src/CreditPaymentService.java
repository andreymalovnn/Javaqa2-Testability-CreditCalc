public class CreditPaymentService {
    // a = amount, m = month, yR = year rate, mR - month rate, aR - annuity ratio
    public double calculate(double a, double m) {
        double yR = 9.99;
        double mR = yR / 12 / 100;
        double aR = (mR * Math.pow((1 + mR), m)) / (Math.pow((1 + mR), m) - 1);
        return a * aR;
    }
}
