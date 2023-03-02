package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*  Animal animal = new Animal();*/
        while (true) {
            System.out.println("Животные сейчас побегут. Введите длину, метров__");
            Scanner scanner = new Scanner(System.in);
            int runLength = scanner.nextInt();
            System.out.println("Животные сейчас поплывут. Введите длину, метров__");
            int swimLength = scanner.nextInt();

            Dog dog = new Dog("Шарик", 500, 10, runLength, swimLength);
            Cat cat = new Cat("Барбарик", 200, 0, runLength, swimLength);
            dog.actionRun(runLength);
            cat.actionRun(runLength);
            dog.actionSwim(swimLength);
            cat.actionSwim();
            System.out.println("Хотите закончить марафон животных? yes/no   ");
            String whichChoice = scanner.nextLine();
            if (scanner.nextLine() == "yes") {

            }
            break;
        }
        System.out.println("Победила дружба!");
    }
}