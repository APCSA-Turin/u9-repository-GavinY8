package U9T1.gun;

public class Pistol extends Firearms{
    private Boolean isConcealable;

    public Pistol(String name, int bulletCount, boolean legal, boolean isConcealable) {
        super(name, bulletCount, legal);
        this.isConcealable = isConcealable;
    }

    public void canConceal() {
        System.out.println(isConcealable);
    }

    public void Throw() {
        System.out.println("why woudl youd do that are you stupdi");
    }
}
