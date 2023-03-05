package lesson7;


public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food -= foodToDecrease;
            return true;
        }
        return false;
    }

    public void increaseFood() {
        int addFood = 20;
        System.out.printf("Добавили %s кусочков корма в тарелку   Теперь ", addFood);
        food += addFood;
    }


    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
