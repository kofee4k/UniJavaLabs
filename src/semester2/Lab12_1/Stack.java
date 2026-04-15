public class Stack implements LIFO {

    private Integer[] data;
    private int size;

    public Stack(int capacity) {
        data = new Integer[capacity];
    }

    @Override
    public void push(Integer item) {
        if (size == data.length) {
            Integer[] newData = new Integer[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];   
            }
            data = newData;             
        }
        data[size] = item;
        size++;
    }

    @Override
    public Integer pop() {
        if (size == 0) return null;
        Integer value = data[size - 1];
        data[size - 1] = null;         
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }
}
