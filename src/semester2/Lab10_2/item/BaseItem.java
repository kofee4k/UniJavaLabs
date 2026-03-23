package semester2.Lab10_2.item;

public abstract class BaseItem implements Item {

    protected int count;
    private boolean used = false;

    public BaseItem(int count) {
        if (count < MIN_VALUE || count > MAX_VALUE) {
            throw new IllegalArgumentException(
                "Count must be between " + MIN_VALUE + " and " + MAX_VALUE + ", got: " + count
            );
        }
        this.count = count;
    }

    @Override
    public boolean isUsed() {
        return used;
    }

    protected void markUsed() {
        this.used = true;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + ", count: " + count
                + ", isUsed: " + isUsed();
    }
}
