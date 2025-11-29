import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 100;

        double priceApple = 9.99;
        double priceBanana = 11.49;
        double priceGrapes = 15.99;
        double priceKiwi = 37.99;
        double priceMango = 39.99;
        double priceOrange = 17.99;
        double pricePlum = 10.98;

        String fruit = sc.nextLine().toLowerCase();
        String day = sc.nextLine().toLowerCase();
        double mass = Double.parseDouble(sc.nextLine().replace(",", "."));

        boolean validFruit = fruit.equals("apple") || fruit.equals("banana") ||
                fruit.equals("grapes") || fruit.equals("kiwi") ||
                fruit.equals("mango") || fruit.equals("orange") ||
                fruit.equals("plum");

        boolean validDay = day.equals("monday") || day.equals("tuesday") ||
                day.equals("wednesday") || day.equals("thursday") ||
                day.equals("friday") || day.equals("saturday") ||
                day.equals("sunday");

        if (!validFruit || !validDay) {
            System.out.println("INVALID");
            return;
        }

        double price = 0;

        if (fruit.equals("apple")) price = priceApple;
        else if (fruit.equals("banana")) price = priceBanana;
        else if (fruit.equals("grapes")) price = priceGrapes;
        else if (fruit.equals("kiwi")) price = priceKiwi;
        else if (fruit.equals("mango")) price = priceMango;
        else if (fruit.equals("orange")) price = priceOrange;
        else if (fruit.equals("plum")) price = pricePlum;

        boolean weekend = day.equals("saturday") || day.equals("sunday");

        double result = price * N * mass;

        if (!weekend) {
            if (fruit.equals("apple") || fruit.equals("plum")) {
                result *= 0.95;
            }
        }

        System.out.printf("%.2f", result);
    }
}