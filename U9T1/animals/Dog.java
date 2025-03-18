package U9T1.animals;

public class Dog extends Animal{
    private String breed;

    public Dog (String name, int age, boolean isVaccinated, String breed) {
        super(name, age, isVaccinated);
        this.breed = breed;
    }

    public void getBreed() {
        System.out.println(breed);
    }
}
