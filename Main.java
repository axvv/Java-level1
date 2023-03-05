package lesson7;


public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(20);
        final int amountCat = 5;
        Cat[] arrayCat = new Cat[amountCat];
        arrayCat[0] = new Cat("Юнга", 7);
        arrayCat[1] = new Cat("Матрос", 5);
        arrayCat[2] = new Cat("Боцман", 9);
        arrayCat[3] = new Cat("Кок", 10);
        arrayCat[4] = new Cat("Рулевой", 2);
        while (true) {
//        информация о количестве корма в тарелке
            System.out.println(plate);
//      информация о состоянии котов
            catInfo(amountCat, arrayCat);
//        кормим котов, выводим информацию о состоянии кота и тарелки после кормления
            catsPlateInfoAfterFeeding(plate, amountCat, arrayCat);
            //  Проверка на количество корма в тарелке

            if (checkEndFood(plate)) break;
//делаем котов голодными
            catsMakeHungry(amountCat, arrayCat);

//увеличили количество еды
            plate.increaseFood();


        }

/*    private static boolean checkEndOfFeeding(Plate plate, int amountCat, Cat[] arrayCat) {
        for (int i = 0; i < amountCat; i++) {
            if (arrayCat[i].getAppetite() >= plate.getFood());
        }
        break;
    }*/
//        private static boolean checkEndFood(Plate plate);

    }

    private static boolean checkEndFood(Plate plate) {
        if (plate.getFood() == 0) {
            System.out.println("Коты голодные, а корма нет");
            return true;
        }
        return false;
    }

    private static void catsPlateInfoAfterFeeding(Plate plate, int amountCat, Cat[] arrayCat) {
        System.out.println("Кормим котов");
        for (int i = 0; i < amountCat; i++) {
            arrayCat[i].eat(plate);
            System.out.println(arrayCat[i]);
            System.out.println(plate);
        }
    }

    private static void catInfo(int amountCat, Cat[] arrayCat) {
        for (int i = 0; i < amountCat; i++) {
            System.out.println(arrayCat[i]);
        }
    }

    private static void catsMakeHungry(int amountCat, Cat[] arrayCat) {
        System.out.println("Коты поспали и проголодались");
        for (int i = 0; i < amountCat; i++) {
            arrayCat[i].makeHungry();
            System.out.println(arrayCat[i]);
        }
    }


    private static void increaseFood() {
    }


}



