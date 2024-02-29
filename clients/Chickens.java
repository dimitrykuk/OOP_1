package clients;

import java.time.LocalDate;

public class Chickens extends Animals{
    public Chickens(String name, float weight, LocalDate adge, Owner owner){
        super(name, weight, adge, owner);
    }

    @Override
    protected void fly() {
        System.out.println(Gettype() + " не летаюая");
    }
}
