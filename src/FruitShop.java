import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 12;

        String[] fruits = {"apple", "banana", "grapes", "kiwi", "mango", "orange", "plum"};
        String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        String[] notDiscountDays = {"saturday", "sunday"};
        Map<String, Double> fruitPrices = Map.ofEntries(
                Map.entry("apple", 9.99),
                Map.entry("banana", 11.49),
                Map.entry("grapes", 15.99),
                Map.entry("kiwi", 37.99),
                Map.entry("mango", 39.99),
                Map.entry("orange", 17.99),
                Map.entry("plum", 10.98)
        );

        String pickedFruit = sc.nextLine().toLowerCase();
        boolean foundF = Arrays.asList(fruits).contains(pickedFruit);

        String pickedDay = sc.nextLine().toLowerCase();
        boolean foundD = Arrays.asList(days).contains(pickedDay);

        double mass = Double.parseDouble(sc.nextLine().replace(",", "."));

        if (foundD && foundF){
            boolean foundDD = Arrays.asList(notDiscountDays).contains(pickedDay);

            if (!foundDD){
                if (pickedFruit.equals("apple") || pickedFruit.equals("plum")) {
                    System.out.printf("%.2f", fruitPrices.get(pickedFruit) * N * mass * 0.95);
                }
                else {
                    System.out.printf("%.2f", fruitPrices.get(pickedFruit)*N*mass);
                }
            }
            else {
                System.out.printf("%.2f", fruitPrices.get(pickedFruit)*N*mass);
            }
        }
        else {
            System.out.println("INVALID");
        }
    }
}
