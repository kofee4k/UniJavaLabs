package semester2.Lab10_2.hero;

import semester2.Lab10_2.armor.Armor;
import semester2.Lab10_2.weapon.Weapon;

interface Equipment {

    int CLOTHES_COUNT = 3;

    boolean change(Weapon weapon);

    void dress(Armor armor);
}
