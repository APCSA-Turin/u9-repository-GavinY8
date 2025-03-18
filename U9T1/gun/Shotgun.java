package U9T1.gun;

public class Shotgun extends Firearms{
    private String ammoType;

    public Shotgun(String name, int bulletCount, boolean legal, String ammoType) {
        super(name, bulletCount, legal);
        this.ammoType = ammoType;
    }

    public void checkAmmoType() {
        System.out.println(ammoType);
    }
}