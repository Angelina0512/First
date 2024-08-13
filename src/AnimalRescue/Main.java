package AnimalRescue;

public class Main {

    public static void main(String[] args) {

        Adopter adopter = new Adopter();
        Dog animal = new Dog();



        System.out.println("Numele persoanei care vrea sa adopte este: " + adopter.name);
        System.out.println("Numele animalului este: " + animal.nume);

    }
}
