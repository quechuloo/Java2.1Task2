public class Main {
    public static void main(String[] args) {
        int account = 100;
        int recharge = 1100;
        int totalBonus;
        int totalAmount = account + recharge + recharge / account;

        if (recharge > 1000) {
            totalBonus = recharge / account;
        } else {
            totalBonus = account + recharge;
        }
        System.out.println("Бонус за пополнение:" + totalBonus);
        System.out.println("Остаток на счету:" + totalAmount);

    }

}

