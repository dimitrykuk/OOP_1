package clients;

import java.time.LocalDate;

public class Mice extends Animals{
        public Mice(String name, float weight, LocalDate adge, Owner owner){
        super(name, weight, adge, owner);
    }
    @Override
    public void fly() {
        System.out.println(Gettype() + " не летает");
    }
}
