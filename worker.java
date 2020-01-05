import java.util.Random;

public class worker {
    private String name;
    private String position;
    private String email;
    private String phone;
    private String salary;
    private int age;
    public static Random rand = new Random();

    public worker (String name, String position,String email, String phone, String salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        worker[]workers = new worker[5];
        workers[1] = new worker("Сергей","Инженер","ckv@gmail.com","87875525289","40000",30);
        workers[2] = new worker("Гена","Директор","nov@gmail.com","87875454987","100000",50);
        workers[3] = new worker("Юля","Секретарь","ban@gmail.com","87874285987","40000",28);
        workers[4] = new worker("Вадим","Грузчик","kab@gmail.com","87872758597","30000",39);
        workers[0] = new worker("Женя","Начальник отдела","482@gmail.com","87875987","60000",41);
        System.out.println("Сотрудники старше 40 лет: ");
        for (int i = 0; i<workers.length;i++){
            if(workers[i].age>40) System.out.println(String.format("%s, %s, %s, %s",workers[i].name, workers[i].position, workers[i].email, workers[i].phone));
        }
    }
}
