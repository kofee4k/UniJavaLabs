package semester2.Lab10_2.hero;

import semester2.Lab10_2.item.Item;

public interface Inventory {

    int ITEMS_COUNT = 5;

    boolean putInto(Item item, int slot);

    boolean useItem(int slot);
}
