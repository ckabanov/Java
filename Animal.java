package Animal;

public abstract class Animal {
    String name;
    int distanceRun,distanceSwim,height;

    public void run( int distanceRun){
        this.distanceRun=distanceRun;
    }

    public  void swim ( int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }
    public  void jump ( int height) {
        this.height = height;
    }
    public  void name ( String name) {
        this.name = name;
    }

}