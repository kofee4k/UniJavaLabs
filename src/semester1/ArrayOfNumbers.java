package semester1;

import java.util.Scanner;

public class ArrayOfNumbers {
    public static void main(String[] args){
        boolean check = true;

        Scanner sc = new Scanner(System.in);
        while (check){
            String numbers = sc.nextLine();
            String[] parts = numbers.split(" ");
            int[] arr = new int[parts.length];
            try{
                for (int i = 0; i < parts.length; i++){
                    arr[i] = Integer.parseInt(parts[i]);
                }
                int sum = 0;
                for (int x: arr){
                    sum += x;
                }

                int shift = sum;
                shift = ((shift % arr.length) + arr.length) % arr.length;

                int[] rotated = new int[arr.length];

                for (int j=0; j < arr.length; j++){
                    rotated[(j + shift) % arr.length] = arr[j];
                }
                String rotatedNew = "";
                for (int x: rotated){
                    rotatedNew += x + " ";
                }

                System.out.println(sum + "\n" + arr.length + "\n" + rotatedNew.trim());

                check = false;
            }
            catch (NumberFormatException e){
                System.out.println("Please, try again");
            }
        }
    }
}