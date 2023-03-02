package lesson6;


public class Animal {
    private String nameAnimal;
    private int maxRunLength;
    private int maxSwimLength;
    private final String typeAnimal;

    public Animal(String nameAnimal, int maxRunLength, int maxSwimLength, String typeAnimal) {
        this.nameAnimal = nameAnimal;
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.typeAnimal = typeAnimal;
    }


    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public void setMaxRunLength(int maxRunLength) {
        this.maxRunLength = maxRunLength;
    }

    public int getMaxSwimLength() {
        return maxSwimLength;
    }

    public void setMaxSwimLength(int maxSwimLength) {
        this.maxSwimLength = maxSwimLength;
    }

    public void actionRun(int runLength) {
        if (runLength <= getMaxRunLength()) {
            System.out.printf("%s %s пробежал %s м.\n", typeAnimal, nameAnimal, runLength);
        } else {
            System.out.printf("%s %s пробежал %s м. и устал, больше не может\n", typeAnimal, nameAnimal, maxRunLength);
        }
    }

    public void actionSwim(int swimLength) {
        if (swimLength <= getMaxSwimLength()) {
            System.out.printf("%s %s проплыл %s м.\n", typeAnimal, nameAnimal, swimLength);
        }else {
            System.out.printf("%s %s проплыл %s м. и устал, больше не может\n", typeAnimal, nameAnimal, maxRunLength);
        }
    }
}

