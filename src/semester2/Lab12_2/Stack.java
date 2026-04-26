package semester2.Lab12_2;

public class Stack implements LIFO {

    private Integer[] data;
    private int size;

    public Stack(int capacity) {
        data = new Integer[capacity];  // создаём массив заданной размерности
    }

    @Override
    public void push(Integer item) {
        if (size == data.length) {       // массив заполнен — расширяем
            Integer[] newData = new Integer[data.length * 2];  // в 2 раза больше
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];    // копируем старые данные
            }
            data = newData;              // заменяем массив
        }
        data[size] = item;
        size++;
    }

    @Override
    public Integer pop() {
        if (size == 0) return null;
        Integer value = data[size - 1];
        data[size - 1] = null;          // чистим ячейку
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }
}