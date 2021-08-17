public class Main {
    public static void main(String[] args) {
        int account = 100;
        int recharge = 1100;
        int totalBonus;
        if (recharge > 1000) {
            totalBonus = recharge / account;
        } else {
            totalBonus = 0;
        }
        System.out.println("Бонус за пополнение:" + totalBonus);

    }

}

