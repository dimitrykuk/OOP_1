package clients;

import java.time.LocalDate;

public class Goats extends Animals{
        public Goats(String name, float weight, LocalDate adge, Owner owner){
        super(name, weight, adge, owner);
    }
    @Override
    public void fly() {
        System.out.println(Gettype() + " не летает");
    }

    @Override
    public void swim() {
        System.out.println(Gettype() + " не плавает");
    }
}
