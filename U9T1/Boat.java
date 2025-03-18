package U9T1;

public class Boat extends Vehicle{
    private int passengers;

    public Boat(String name, int wheels, int passengers) {
        super(name, wheels);
        this.passengers = passengers;
    }

    public void getPassengers() {
        System.out.println("I have " + passengers + " passengers!");
    }

    public void Anchor() {
        System.out.println("Boat Anchored");
    }

    public void Unanchor() {
        System.out.println("Boat Unanchored");
    }
}
