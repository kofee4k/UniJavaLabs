package semester2.Lab10_2;

public class Food extends Item {
    public Food(int count) {
        super(count);
    }

    @Override
    public void use(Hero hero) {
        if (!used && hero instanceof Knight) {
            ((Knight) hero).addStrength(count);
            used = true;
        }
    }
}
