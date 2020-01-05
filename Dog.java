package Animal;

import java.util.Random;

public class Dog extends Animal{
    String animalDog = "Собака ";
    int maxDistanceRun = (int) (Math.random() * 500);
    double maxHeight =  Math.random();
    int maxSwim = (int) (Math.random() * 30);

    public Dog(String name, int distanceRun, int distanceSwim, int height) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        this.height = height;
    }
}