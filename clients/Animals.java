package clients;

import java.time.LocalDate;

/**
 * Enimals
 */
public class Animals {

    protected String name;
    protected double weight;
    protected LocalDate adge;
    protected Owner owner;
 
    public Animals(String name, double weight, LocalDate adge, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.adge = adge;
        this.owner = owner;
    }

    public Animals() {
        this("Animal",100,LocalDate.now(),new Owner());
    }

    private void sleep(){
        System.out.println(Gettype() + " спит");
    }

    private void wakeUp(){
        System.out.println(Gettype() + " встал");
    }
    private void wakeUp(int time){
        System.out.println(Gettype() + " встал in " + time);
    }
    private void eat(){
        System.out.println(Gettype() + " ест");
    }

    private void play(){
        System.out.println(Gettype() + " играет");
    } 

    public void toGo(){
        System.out.println(Gettype() + " идет");
    }

    public void fly(){
        System.out.println(Gettype() + " летит");
    }

    public  void swim(){
        System.out.println(Gettype() + " плывет");
    }

    public void life(){
        wakeUp();
        eat();
        play();
        sleep();
    }

    public String Gettype() {
        return getClass().getSimpleName();

        
        
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getAdge() {
        return adge;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("name = %s, ves = %s, age = %s, owner = %s ", name, weight,adge, owner);
    }
}