package semester2.Lab10_2;

public abstract class Armor {
    protected int durability;

    public Armor(int durability) {
        this.durability = durability;
    }

    public int protect(int damage) {
        int absorbed = Math.min(damage, durability);
        durability -= absorbed;
        return damage - absorbed;
    }

    public boolean isBroken() {
        return durability <= 0;
    }

    @Override
    public String toString() {
        return "durability: " + durability + ", broken: " + isBroken();
    }
}
