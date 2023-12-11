
public class Vehicle {
    String Brand;
    String Model;
    int Year;
    public Vehicle(String Brand1, String Model1, int Year1) {
        Brand = Brand1;
        Model = Model1;
        Year = Year1;
    }
    public void Accelerate() {
        System.out.printf("I'm putting the pedal to the metal (Let's hope the car doesnt explode)\n");
    }
    public void Brake() {
        System.out.printf("Woah! Slow down boy!\n");
    }
    public void Describe() {
        System.out.printf("I'm a %s %s made in %d\n", Brand, Model, Year);
    }
    public void Weight() {
        System.out.printf("Woah! Slow down boy!\n");
    }
    public void Wheels() {
        System.out.printf("Woah! Slow down boy!\n");
    }
}
