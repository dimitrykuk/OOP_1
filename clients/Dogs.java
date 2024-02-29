package clients;

import java.time.LocalDate;

public class Dogs extends Animals{
        public Dogs(String name, float weight, LocalDate adge, Owner owner){
        super(name, weight, adge, owner);
    }
    
    @Override
    protected void fly() {
        System.out.println(Gettype() + " не летает");
    }
}
