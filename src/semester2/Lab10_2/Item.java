package semester2.Lab10_2;

public abstract class Item {
    protected int count;
    protected boolean used = false;

    public Item(int count) {
        this.count = count;
    }

    public boolean isUsed() {
        return used;
    }

    public abstract void use(Hero hero);

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", count: " + count +
                ", isUsed: " + used;
    }
}
