package semester2.Lab10_2.armor;

public class Helmet extends BaseArmor {

    private static final int HELMET_POSITION = 3;

    public Helmet(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return HELMET_POSITION;
    }
}
