package lesson6;

public class Dog extends Animal{
    private int runLength = 400;


    private int swimLength = 100;


    public Dog(String nameAnimal, int maxRunLength, int maxSwimLength, int runLength, int swimLength) {
        super(nameAnimal, maxRunLength, maxSwimLength, "Собака");
        this.runLength = runLength;
        this.swimLength = swimLength;
    }

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public int getSwimLength() {
        return swimLength;
    }

    public void setSwimLength(int swimLength) {
        this.swimLength = swimLength;
    }
}



