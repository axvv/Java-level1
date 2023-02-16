package lesson2;

public class Lesson2HomeWork {
    public static void main(String[] args) {
//        1
        System.out.println(checkSum(10, 20));
        System.out.println(checkSum(10, 0));
        System.out.println(checkSum(10, 2));
        System.out.println(checkSum(0, 0));
//        2
        checkNumbers(101);
        checkNumbers(-101);
        checkNumbers(0);
        checkNumbers(10);
        checkNumbers(-10);
//        3
        System.out.println(compairNumbers(10));
        System.out.println(compairNumbers(0));
        System.out.println(compairNumbers(-10));
//        4
        testCycle("ПРИВЕТ", 4);
//        5
        System.out.println(compairYears(2000));
        System.out.println(compairYears(2001));
        System.out.println(compairYears(2002));
        System.out.println(compairYears(2003));
        System.out.println(compairYears(2004));
        System.out.println(compairYears(2005));
        System.out.println(compairYears(0000));
    }



    //    1
    private static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //    2
    private static void checkNumbers(int value) {
        if (value >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    //  3
    private static boolean compairNumbers(int number) {
        return number < 0;
    }

    //   4
    private static void testCycle(String something, int limitOfCycle) {
        for (int i = 0; i < limitOfCycle; i++) {
            System.out.println(something);
        }
    }

    //    5
    private static boolean compairYears(int year) {
      return (year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0;
    }
}