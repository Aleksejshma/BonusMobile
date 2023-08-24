public class Main {
    public static void main(String[] args) {
        int initialBalance = 470;
        int addend = 1800;
        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;

        } else {
            bonus = 0;
        }

        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый баланс " + finalBalance);
        System.out.println("Бонус " + bonus);
    }

}
