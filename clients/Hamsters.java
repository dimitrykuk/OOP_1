package clients;

import java.time.LocalDate;

public class Hamsters extends Animals{
    public Hamsters(String name, double d, LocalDate adge, Owner owner){
        super(name, d, adge, owner);
    }
    
    @Override
    public void fly() {
        System.out.println(Gettype() + " не летает");
    }

    @Override
    public void swim() {
        System.out.println(Gettype() + " не уверен, но по-моему как кирпич");
    }
}
