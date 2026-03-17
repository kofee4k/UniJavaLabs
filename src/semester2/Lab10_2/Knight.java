package semester2.Lab10_2;

public class Knight extends Hero {

    private int strength;
    private int forcePower;

    public Knight(String name, int health, int strength, int forcePower) {
        super(name, health);

        if (strength < 0 || forcePower < 0) {
            throw new IllegalArgumentException();
        }

        this.strength = strength;
        this.forcePower = forcePower;
    }

    public void addStrength(int value) {
        strength += value;
    }

    @Override
    public int fight(Player enemy, int distance) {
        if (strength <= 0) return 0;

        int attack = forcePower;

        if (weapon != null && distance <= weapon.getDistance()) {
            attack *= weapon.power;
        } else if (distance > 1) {
            return 0;
        }

        strength -= forcePower;

        return enemy.damage(attack);
    }
}
