package clients;

import java.time.LocalDate;

public class Lion extends Animals {

    public Lion(String name, float weight, LocalDate adge, Owner owner) {
        super(name, weight, adge, owner);

    }

    @Override
    protected void fly() {
        System.out.println(Gettype() + " не летает");
    }
    @Override
    protected void swim() {
        System.out.println(Gettype() + " не охотно плавает");
    }
}
