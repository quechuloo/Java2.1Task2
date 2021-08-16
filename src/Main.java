public class Main {
    public static void main(String[] args) {
        int account = 100;
        int recharge = 1200;
        int totalAmount;
        if (recharge > 1000) {
            totalAmount = account + recharge + recharge / account;
        } else {
            totalAmount = account + recharge;
        }
        System.out.println("Остаток на счету:" + totalAmount);

    }

}

