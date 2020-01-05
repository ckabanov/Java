package Animal;

public class Cat extends Animal{
    String animalCat = "Кот ";
    int maxDistanceRun = (int) (Math.random() * 300);
    int maxHeight = (int) (Math.random() * 5);

    public Cat(String name, int distanceRun, int height) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.height = height;
    }



}

