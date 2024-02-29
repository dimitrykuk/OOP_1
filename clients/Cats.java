package clients;

import java.time.LocalDate;

public class Cats extends Animals{

    public Cats(String name, float weight, LocalDate adge, Owner owner) {
        super(name, weight, adge, owner);
    }
    @Override
    public void fly() {
        System.out.println(Gettype() + " летает только с балкона");
    }
    @Override
    public void swim() {
        System.out.println(Gettype() + " не охотно плавает");
    }
    
}