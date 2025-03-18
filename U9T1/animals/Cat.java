package U9T1.animals;

public class Cat extends Animal{
    private String furColor;

    public Cat (String name, int age, boolean isVaccinated, String furColor) {
        super(name, age, isVaccinated);
        this.furColor = furColor;
    }

    public void getFurColor() {
        System.out.println(furColor);
    }
}
