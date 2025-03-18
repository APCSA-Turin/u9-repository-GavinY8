package U9T1;

import U9T1.gun.Pistol;
import U9T1.gun.Shotgun;

public class Runner {
    public static void main(String[] args) {
        Shotgun qwe = new Shotgun("that one jcpenney gun", 12, true, "buckshot");
        Pistol wer = new Pistol("G17", 17, true, true);
        qwe.PewPew();
        qwe.getBullets();
        qwe.getName();
        qwe.isLgeal();
        qwe.checkAmmoType();
        wer.PewPew();
        wer.getBullets();
        wer.getName();
        wer.isLgeal();
        wer.Throw();
    }
}