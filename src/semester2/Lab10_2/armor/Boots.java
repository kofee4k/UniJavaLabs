package semester2.Lab10_2.armor;

public class Boots extends BaseArmor {

    private static final int BOOTS_POSITION = 1;

    public Boots(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return BOOTS_POSITION;
    }
}
