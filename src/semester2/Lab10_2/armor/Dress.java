package semester2.Lab10_2.armor;

public class Dress extends BaseArmor {

    private static final int DRESS_POSITION = 2;

    public Dress(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return DRESS_POSITION;
    }
}
