package semester2.Lab10_2;

public class Lab10_2nd {
    public static void main(String[] args) {

        Knight k1 = new Knight("Arthur", 100, 50, 10);
        Knight k2 = new Knight("Lancelot", 100, 50, 10);

        k1.change(new Sword(2, 2));

        k1.fight(k2, 1);

        System.out.println(k1);
        System.out.println(k2);
    }
}
