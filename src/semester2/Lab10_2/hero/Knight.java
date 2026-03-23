package semester2.Lab10_2.hero;

import semester2.Lab10_2.item.Food;
import semester2.Lab10_2.item.Item;
import semester2.Lab10_2.weapon.Sword;
import semester2.Lab10_2.weapon.Weapon;

public class Knight extends Hero {

    private static final int MAX_STRENGTH = 100;

    private int strength;
    private int forcePower;

    public Knight(String username, int health, int strength) {
        super(username, health);
        if (strength <= 0 || strength > MAX_STRENGTH) {
            throw new IllegalArgumentException(
                "Strength must be between 1 and " + MAX_STRENGTH + ", got: " + strength
            );
        }
        this.strength = strength;
        this.forcePower = 1;
    }

    @Override
    public boolean fight(Player target, int distance) {
        if (isDied() || target.isDied()) return false;
        if (strength < forcePower) return false;

        int attackDistance;
        int attackDamage;

        if (weapon != null) {
            attackDistance = weapon.getDistance();
            attackDamage = (int) (forcePower * weapon.getPower());
        } else {
            attackDistance = 1;
            attackDamage = forcePower;
        }

        if (distance > attackDistance) return false;

        strength -= forcePower;
        target.damage(attackDamage);
        return true;
    }

    @Override
    public boolean change(Weapon newWeapon) {
        if (!(newWeapon instanceof Sword)) return false;
        this.weapon = newWeapon;
        return true;
    }

    @Override
    protected boolean canUse(Item item) {
        return item instanceof Food || super.canUse(item);
    }

    @Override
    protected void applyItemEffect(Item item, int value) {
        if (item instanceof Food) {
            strength = Math.min(strength + value, MAX_STRENGTH);
        }
    }

    public int getStrength() {
        return strength;
    }

    public int getForcePower() {
        return forcePower;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", strength: " + strength;
    }
}
