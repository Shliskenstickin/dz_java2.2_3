public class Main {
    public static void main(String[] args) {
        CreditPaymentService slave = new CreditPaymentService();
        System.out.println(slave.calculate(1000000, 1, 9.99));
        System.out.println(slave.calculate(1000000, 2, 9.99));
        System.out.println(slave.calculate(1000000, 3, 9.99));
    }
}
