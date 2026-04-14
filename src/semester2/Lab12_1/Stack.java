package semester2.Lab12_1;

public class Stack implements LIFO {
    private static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    @Override
    public void push(Integer item) {
        Node node = new Node(item);
        node.next = top;
        top = node;
        size++;
    }

    @Override
    public Integer pop() {
        if (top == null) return null;
        Integer value = top.data;
        top = top.next;
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }
}