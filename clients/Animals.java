package clients;

import java.time.LocalDate;

/**
 * Enimals
 */
public class Animals {

    protected String name;
    protected float weight;
    protected LocalDate adge;
    protected Owner owner;
 
    public Animals(String name, float weight, LocalDate adge, Owner owner) {
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
// 1) Добавить в класс Animal public методы двигаться(toGo), летать(fly), плавать(swim).
    
    public void life(){
        wakeUp(15);
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

    public float getWeight() {
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