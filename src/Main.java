public class Main {
    public static void main(String[] args) {

        int account = 100;
        int recharge = 1500;
        int bonusAmount = 100;

        int bonus;
        if (recharge >= 1000) {
            bonus = recharge / bonusAmount;
        }
        else
        {
            bonus = 0;
        }
        int total = account + recharge + bonus;

        System.out.println(total);
        System.out.println(bonus);

    }
}