package Animal;

import java.util.Random;

public class main {

    public static int getRandomNumber(int n) {
        int x = (int) (Math.random() * n);
        return x;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        Cat[] cats = new Cat[5];
        String[] names = {"Барсик", "Вася", "Шарик", "Найда", "Киса"};
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(names[getRandomNumber(5)], getRandomNumber(1000), getRandomNumber(3));
            dogs[i] = new Dog(names[getRandomNumber(5)], getRandomNumber(1000), getRandomNumber(1000), getRandomNumber(3));
        }

        for (int i = 0; i < 5; i++) {
             if (cats[i].distanceRun <= cats[i].maxDistanceRun|| cats[i].height <= cats[i].maxHeight)
                System.out.println(cats[i].animalCat + cats[i].name + " пробежал " + cats[i].distanceRun  + " м, подбрыгнул на "+ cats[i].height + " м" );
            if (dogs[i].distanceRun <= dogs[i].maxDistanceRun|| dogs[i].height <= dogs[i].maxHeight)
                System.out.println(dogs[i].animalDog + dogs[i].name + " пробежал " + dogs[i].distanceRun  + " м, подбрыгнул на "+ dogs[i].height + " м и проплыл "+ dogs[i].distanceSwim );
        }
    }
}
