package semester2.Lab10_2.armor;

public abstract class BaseArmor implements Armor {

    protected int durability;

    public BaseArmor(int durability) {
        if (durability < MIN_VALUE || durability > MAX_VALUE) {
            throw new IllegalArgumentException(
                "Durability must be between " + MIN_VALUE + " and " + MAX_VALUE + ", got: " + durability
            );
        }
        this.durability = durability;
    }

    @Override
    public boolean isBroken() {
        return durability <= 0;
    }

    @Override
    public int protect(int damage) {
        if (isBroken()) {
            return damage;
        }
        if (durability < damage) {
            int remaining = damage - durability;
            durability = 0;
            return remaining;
        } else {
            durability -= damage;
            return 0;
        }
    }

    @Override
    public String toString() {
        return getPosition() + ": " + getClass().getSimpleName()
                + ", durability: " + durability
                + ", isBroken: " + isBroken();
    }
}
