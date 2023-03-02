package lesson6;

public class Cat extends Animal {
    private int runLength;
    private int swimLength;

    public Cat(String nameAnimal, int maxRunLength, int maxSwimLength, int runLength, int swimLength) {
        super(nameAnimal, maxRunLength, maxSwimLength, "Кот");
        this.runLength = runLength;
        this.swimLength = swimLength;
    }
    public void actionSwim(){
        System.out.printf("Кот %s не умеет плавать!", getNameAnimal());
    }
}
