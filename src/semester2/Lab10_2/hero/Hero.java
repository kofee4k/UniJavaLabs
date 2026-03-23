package semester2.Lab10_2.hero;

import semester2.Lab10_2.armor.Armor;
import semester2.Lab10_2.item.HealthPotion;
import semester2.Lab10_2.item.Item;
import semester2.Lab10_2.weapon.Weapon;

public abstract class Hero implements Player, Healthy, Equipment, Inventory {

    protected String username;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes;
    protected Item[] items;

    public Hero(String username, int health) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username must not be empty");
        }
        if (health <= 0 || health > MAX_HEALTH) {
            throw new IllegalArgumentException(
                "Health must be between 1 and " + MAX_HEALTH + ", got: " + health
            );
        }
        this.username = username;
        this.health = health;
        this.clothes = new Armor[CLOTHES_COUNT];
        this.items = new Item[ITEMS_COUNT];
    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public int damage(int incomingDamage) {
        int remaining = incomingDamage;
        for (Armor armor : clothes) {
            if (armor != null && !armor.isBroken()) {
                remaining = armor.protect(remaining);
                if (remaining == 0) break;
            }
        }
        loseHealth(remaining);
        return remaining;
    }

    @Override
    public boolean isDied() {
        return health <= 0;
    }

    @Override
    public void recoverHealth(int amount) {
        if (amount <= 0) return;
        health = Math.min(health + amount, MAX_HEALTH);
    }

    @Override
    public void dress(Armor armor) {
        if (armor == null) return;
        int slot = armor.getPosition() - 1;
        if (slot >= 0 && slot < CLOTHES_COUNT) {
            clothes[slot] = armor;
        }
    }

    @Override
    public boolean putInto(Item item, int slot) {
        if (item == null) return false;
        int index = slot - 1;
        if (index < 0 || index >= ITEMS_COUNT) return false;
        if (!canUse(item)) return false;
        items[index] = item;
        return true;
    }

    @Override
    public boolean useItem(int slot) {
        int index = slot - 1;
        if (index < 0 || index >= ITEMS_COUNT) return false;
        Item item = items[index];
        if (item == null || item.isUsed()) return false;
        if (!canUse(item)) return false;

        int value = item.use();

        if (item instanceof HealthPotion) {
            recoverHealth(value);
        }
        return true;
    }

    protected void applyItemEffect(Item item, int value) {
    }

    protected boolean canUse(Item item) {
        return item instanceof HealthPotion;
    }

    private void loseHealth(int amount) {
        if (amount <= 0) return;
        health = Math.max(0, health - amount);
    }

    @Override
    public String toString() {
        String weaponStr = weapon != null ? weapon.toString() : "no";

        String inventoryStr = "no";
        for (Item item : items) {
            if (item != null) {
                if (inventoryStr.equals("no")) inventoryStr = item.toString();
                else inventoryStr += " | " + item.toString();
            }
        }

        return getClass().getSimpleName()
                + ": " + username
                + ", health: " + health
                + ", weapon: " + weaponStr
                + ", inventory: " + inventoryStr;
    }
}
