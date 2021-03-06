public class CreditPaymentService {
    public static long calculate (double credit, int year, double rate){
        double rateMonth = (rate /12) / 100;
        int month = year * 12;
        double coefficient = rateMonth * Math.pow((1 + rateMonth),month) / (Math.pow((1 + rateMonth),month) - 1);
        double payment = coefficient * credit;
        long payment2 = Math.round(payment);
        return payment2;
    }
}
//83333

//54932 5.4932%
//107360 10.736%
//161432 16.1432%