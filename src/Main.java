public class Main {
    public static void main(String[] args) {
        int account = 100;
        int recharge = 1100;
        int totalBonus;
        int totalAmount = account + recharge;
        if (recharge <= 1000) {
            totalBonus = 0;
        } else {
            totalBonus = account + recharge + recharge / account;
        }
        System.out.println("Остаток на счету:" + totalBonus);

    }

}

