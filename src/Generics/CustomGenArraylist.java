
package Generics;

import java.util.Arrays;

public class CustomGenArraylist<T> {
    private Object[] numbers;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArraylist() {
        this.numbers = new Object[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        numbers[size++] = num;
    }

    public T remove() {
        T removed = (T) (numbers[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) numbers[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        numbers[index] = value;
    }

    private void resize() {
        Object[] temp = new Object[DEFAULT_SIZE * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
    }

    private boolean isFull() {
        return size == numbers.length;
    }

    @Override
    public String toString() {
        return "CustomGenArraylist{" +
                "numbers=" + Arrays.toString(numbers) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArraylist<Integer> customArrayList = new CustomGenArraylist<>();
        customArrayList.add(3);
        customArrayList.add(5);
        customArrayList.add(9);

        System.out.println(customArrayList);
    }
}
