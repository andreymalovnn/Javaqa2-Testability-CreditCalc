public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        double monthlyPayment1 = payment.calculate(1000_000, 12);
        String result1 = String.format("%.0f", monthlyPayment1);
        System.out.println("Ваш ежемесячный платеж =  " + result1);

        double monthlyPayment2 = payment.calculate(1000_000, 24);
        String result2 = String.format("%.0f", monthlyPayment2);
        System.out.println("Ваш ежемесячный платеж =  " + result2);

        double monthlyPayment3 = payment.calculate(1000_000, 36);
        String result3 = String.format("%.0f", monthlyPayment3);
        System.out.println("Ваш ежемесячный платеж =  " + result3);
    }
}
