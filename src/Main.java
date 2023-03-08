public class Main {
    public static void main(String[] args) {

        int initialamount = 100; // начальная сумма
        int replenishmentamount = 1100; // сумма пополнения
        int bonus = replenishmentamount / 100;
        int finalamount = initialamount + replenishmentamount + bonus;

        if (replenishmentamount <= 1000) {
            System.out.println("Количество начисленных бонусов: 0");
            bonus = 0;
        } else {
            System.out.println("Количество начисленных бонусов:");
            System.out.println((replenishmentamount / 100) + " бонусов");
        }
        {
            System.out.println("Итоговая сумма на счету:");
            System.out.println((initialamount + replenishmentamount + bonus) + " рублей");
        }

    }
}