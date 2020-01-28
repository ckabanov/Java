package Cat;


class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;

    }
    boolean decreaseFood(int n) {
        int negativePlate = food-n;
        if (negativePlate<0) return false;
        food -= n;
        return true;

    }
    public void info() {
        System.out.println("plate: " + food);
    }
    void addFood(int food) {
        this.food += food;
    }
}
class Cat {
    private boolean full;
    private String name;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = true;
    }
    public void eat(Plate p) {
        if (full && p.decreaseFood(appetite)) full =false;
    }
    public void info (){
        String isHungry = !full ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }
}
public class Main {
    public static void main(String[] args) {

        Cat[]Cats = new Cat [5];
        Cats [0] = new Cat("Barsik", 10);
        Cats [1] = new Cat("Vasia", 15);
        Cats [2] = new Cat("Marusia", 20);
        Cats [3] = new Cat("Timosha", 25);
        Cats [4] = new Cat("Kolyan", 30);
        Plate plate = new Plate(60);
        for (Cat Cat: Cats) {
            plate.info();
            Cat.eat(plate);
            Cat.info();
            System.out.println();
        }
    }

}