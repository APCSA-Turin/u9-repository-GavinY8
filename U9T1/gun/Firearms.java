package U9T1.gun;

public class Firearms {
    private String name;
    private int bulletCount;
    private boolean legal;

    public Firearms(String name, int bulletCount, boolean legal) {
        this.name = name;
        this.bulletCount = bulletCount;
        this.legal = legal;
    }

    public void PewPew() {
        System.out.println("*shoots and dodges your dodge*");
    }

    public void getBullets() {
        System.out.println(bulletCount);
    }

    public void getName() {
        System.out.println(name);
    }

    public void isLgeal() {
        System.out.println(legal);
    }
}
