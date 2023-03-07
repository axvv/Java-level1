package lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4Homework {

    //        инициализация всего приложения
//        размер игрового поля
    private static final int SIZE = 3;
    //    размер выигрышной комбинации
    private static final int WIN_SIZE = 3;
    //счётчик подряд идущих символов
    private static int count = 0;
    //        символы для игры
    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    public static final String FIRST_HEADER_SYMBOL = "♥";
    public static final String SPACE_MAP_SYMBOL = " ";
    //        игровое поле
    private static final char[][] MAP = new char[SIZE][SIZE];
    //        принимать значения извне
    private static final Scanner in = new Scanner(System.in);
    //        рандомные значения для хода компьютера
    private static final Random random = new Random();
    private static int turnsCount = 0;

    public static void main(String[] args) {
        while (true)
        turnGame();
    }

    public static void turnGame() {
//        инициализировать игровое поле и заполнить его символами пустоты
        initMap();
//        печать массива (игровое поле)
//        первая строка будет символ, пробел и числа от 1 до SIZE
        printMap();
//         игра (бизнес-логика)
        playGame();
    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
//        перенос на следущую строку
        printBodyMap();
    }

    private static void printBodyMap() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
//            вывод номера строки перед игровым полем
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
//         перенос на следущую строку
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP_SYMBOL);
    }

    private static void printHeaderMap() {
        System.out.print(FIRST_HEADER_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
    }

    private static void playGame() {
        while (true) {
//        3.1 Ход игрока-человека
            humanTurn();

            printMap();

//            проверка на конец игры
            if (checkEnd(DOT_HUMAN)) {
                break;
            }
//        3.1 Ход игрока- компьютера
            aiTurn();
            printMap();
//        3.1.4 Сохранить ход
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void humanTurn() {
        System.out.println("\nХод человека");
        int rowNumber;
        int columnNumber;
//        принимаем данные от человека и приводим в нужный вид
        while (true) {
            System.out.print("Введите строку   ");
            rowNumber = in.nextInt() - 1;
            System.out.print("Введите столбец   ");
            columnNumber = in.nextInt() - 1;
//        выполним проверку, что эта ячейка свободна
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("Ошибка! Ячейка %s:%s занята. Ввведите другие координаты %n ", rowNumber + 1, columnNumber + 1);
        }
//        покажем ход человека и посчитаем ход
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;

    }

    //    проверка чей ход сейчас
    private static void aiTurn() {
        System.out.println("\nХод компьютера");
        int rowNumber;
        int columnNumber;
        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
//        если ячейка не свободна (занята), то находим новую координату
        } while (!isCellFree(rowNumber, columnNumber));

//        покажем ход компьютера и посчитаем ход
        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static boolean checkEnd(char symbol) {
//    проверка на победу
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("Ура! Вы победили!");
            } else {
                System.out.println("Победил компьютер");
            }
            return true;
        }
//        ничья
        if (checkDraw()) {
            System.out.println("Наступила ничья");
            return true;
        }
        return false;
    }

    private static boolean checkWin(char symbol) {
//            метод проверяющий победу если нет, то return false
        if (countSymbol(count,symbol) == WIN_SIZE) {
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        if (turnsCount >= SIZE * SIZE) {
            return true;
        }
        return false;
    }

    private static int countSymbol(int count,char symbol) {
//        проверка строк
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == symbol) {
                    count++;
                    if (count == WIN_SIZE) {
                        return count;
                    }
                }
            }
            count = 0;
        }
//        проверка рядов
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[j][i] == symbol) {
                    count++;
                    if (count == WIN_SIZE) {
                        return count;
                    }
                }
            }
            count = 0;
        }
//        проверка диагонали 1
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[j][j] == symbol) {
                    count++;
                    if (count == WIN_SIZE) {
                        return count;
                    }
                }
            }
            count = 0;
        }
        //        проверка диагонали 2
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[(SIZE-1-j)][j] == symbol) {
                    count++;
                    if (count == WIN_SIZE) {
                        return count;
                    }
                }
            }
            count = 0;
        }
        return count;
    }
}



