package semester2.Lab10_2;

import semester2.Lab10_2.armor.Boots;
import semester2.Lab10_2.armor.Dress;
import semester2.Lab10_2.armor.Helmet;
import semester2.Lab10_2.hero.Knight;
import semester2.Lab10_2.item.Food;
import semester2.Lab10_2.item.HealthPotion;
import semester2.Lab10_2.weapon.Sword;

public class Main {

    public static void main(String[] args) {
        Knight knight = new Knight("Arthur", 100, 50);

        knight.change(new Sword(2.5));

        knight.dress(new Helmet(30));
        knight.dress(new Dress(40));
        knight.dress(new Boots(20));

        knight.putInto(new Food(8), 1);
        knight.putInto(new HealthPotion(10), 2);

        System.out.println("=== Начальное состояние ===");
        System.out.println(knight);

        Knight enemy = new Knight("BlackKnight", 80, 30);

        System.out.println("\n=== Бой ===");
        int round = 1;
        while (!knight.isDied() && !enemy.isDied()) {
            boolean hit = knight.fight(enemy, 2);
            if (!hit) {
                System.out.println("Раунд " + round + ": " + knight.getUsername() + " не может атаковать (нет сил)");
                break;
            }
            System.out.println("Раунд " + round + ": "
                    + knight.getUsername() + " атакует "
                    + enemy.getUsername()
                    + " | здоровье врага: " + (enemy.isDied() ? "мёртв" : "жив"));
            round++;
        }

        System.out.println("\n=== Итог ===");
        System.out.println(knight.getUsername() + " погиб: " + knight.isDied());
        System.out.println(enemy.getUsername() + " погиб: " + enemy.isDied());

        System.out.println("\n=== Используем предметы ===");
        knight.useItem(1);
        knight.useItem(2);
        System.out.println(knight);
    }
}
