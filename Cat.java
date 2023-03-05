package lesson7;

public class Cat {
    private final String name;
    private final int appetite;

    public int getAppetite() {
        return appetite;
    }

    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(appetite);
    }


    public void makeHungry() {
        satiety = false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
