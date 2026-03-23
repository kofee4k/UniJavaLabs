package semester2.Lab10_2.item;

public class Food extends BaseItem {

    public Food(int count) {
        super(count);
    }

    @Override
    public int use() {
        if (isUsed()) {
            return 0;
        }
        markUsed();
        return count;
    }
}
