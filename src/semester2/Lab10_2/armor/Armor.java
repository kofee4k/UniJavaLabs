package semester2.Lab10_2.armor;

public interface Armor {

    int MIN_VALUE = 5;
    int MAX_VALUE = 50;

    boolean isBroken();

    int protect(int damage);

    int getPosition();
}
