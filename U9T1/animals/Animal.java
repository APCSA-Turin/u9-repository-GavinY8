package U9T1.animals;

public class Animal {
    private boolean isVaccinated;
    private int age;
    private String name;

    public Animal(String name, int age, boolean isVaccinated) {
        this.age = age;
        this.isVaccinated = isVaccinated;
        this.name = name;
    }

    public void getAge() {
        System.out.println(age);
    }

    public void getName() {
        System.out.println(name);
    }

    public void VaccinationStatus() {
        if (isVaccinated) {
            System.out.println("Vaccinated");
        }
        else {
            System.out.println("Not Vaccinated");
        }
    }
}