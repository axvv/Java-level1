package lesson5;

public class Main {
    public static void main(String[] args) {
        int sizeArray = 5;
        int maxAge = 40;
        Personal[] persArray = new Personal[sizeArray];
        persArray[0] = new Personal("Багров Данила", "охранник", "killBill@bandit.ru", "5525255", 5555555, 26);
        persArray[1] = new Personal("Муромец Илья", "охранник", "sivka@burka.ru", "5555662", 5455515, 55);
        persArray[2] = new Personal("Премудрая Василиса", "финансовый директор", "kladez@uma.ru", "5555555", 5500000, 38);
        persArray[3] = new Personal("Пальчиков Бой", "Специалист", "sdachi@nenado.ru", "5555826", 60000, 27);
        persArray[4] = new Personal("Власкова Злата", "Специалист", "golden@lady.ru", "5655824", 60000, 22);
        for (int i = 0; i < sizeArray; i++) {
            if (persArray[i].age > maxAge) {
                persArray[i].printInfo();
            }
        }
    }

}
