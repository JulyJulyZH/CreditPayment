public class Main {
    public static void main(String[] args) {
        CreditPaymentService credit = new CreditPaymentService();

        System.out.println(credit.calculate(9.99, 1000000, 1));
        System.out.println(credit.calculate(9.99, 1000000, 2));
        System.out.println(credit.calculate(9.99, 1000000, 3));
    }
}