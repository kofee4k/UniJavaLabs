package semester2.Lab12_1;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(3);

        stack.push(10);
        System.out.println(stack.size());

        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());

        stack.pop();
        System.out.println(stack.size());

        stack.pop();
        stack.pop();
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
    }
}
