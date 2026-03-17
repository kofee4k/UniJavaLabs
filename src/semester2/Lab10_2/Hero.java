package semester2.Lab10_2;

public abstract class Hero implements Player, Healthy, Equipment, Inventory {
    protected String username;
    protected int health;

    protected Weapon weapon;
    protected Armor armor;
    protected Item[] items = new Item[3];

    public Hero(String username, int health) {
        if (username == null || username.isEmpty() || health < 0) {
            throw new IllegalArgumentException();
        }
        this.username = username;
        this.health = health;
    }

    public String getUsername() {
        return username;
    }

    protected void loseHealth(int value) {
        health = Math.max(0, health - value);
    }

    @Override
    public boolean isDied() {
        return health == 0;
    }

    @Override
    public void recoverHealth(int value) {
        health += value;
    }

    @Override
    public void change(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void dress(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void putInto(int index, Item item) {
        items[index] = item;
    }

    @Override
    public void useItem(int index) {
        if (items[index] != null && !items[index].isUsed()) {
            items[index].use(this);
        }
    }

    @Override
    public int damage(int value) {
        if (armor != null) {
            value = armor.protect(value);
        }
        loseHealth(value);
        return value;
    }

    @Override
    public String toString() {
        String weaponStr = (weapon == null) ? "no" : weapon.toString();

        String inv = "";
        for (Item item : items) {
            inv += (item == null ? "no" : item.toString()) + " ";
        }

        return getClass().getSimpleName() + ": " + username +
                ", health: " + health +
                ", weapon: " + weaponStr +
                ", inventory: " + inv;
    }
}
