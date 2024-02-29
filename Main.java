import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clients.Lion;
import clients.Owner;
import clients.Animals;
import clients.Cats;

// 1) Добавить в класс Animal public методы двигаться(toGo), летать(fly), плавать(swim).

// 2) Создать по два класса
// наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).

// 3) В main добиться того, чтобы при вызове метода действия, 
//которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion("lev", 100, LocalDate.of(2022, 10, 03), new Owner());
        Cats cat1 = new Cats("lev", 100, LocalDate.of(2022, 10, 03), new Owner());
        System.out.println(cat1.Gettype());
        System.out.println(lion1.getWeight()); 
        lion1.setWeight(20);
        System.out.println(lion1.getWeight());
        System.out.println(new Lion());
        lion1.life();

        List<Animals> animals = new ArrayList<Animals>();
        animals.add(lion1);
        animals.add(cat1);
        animals.add(lion1);
        System.out.println(animals);
    }
    
}
