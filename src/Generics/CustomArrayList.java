package Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] numbers;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
    this.numbers = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        numbers[size++] = num;
    }

    public int remove() {
        int removed = numbers[--size];
        return removed;
    }

    public int get(int index) {
        return numbers[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        numbers[index] = value;
    }

    private void resize() {
        int[] temp = new int[DEFAULT_SIZE * 2];
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
        return "CustomArrayList{" +
                "numbers=" + Arrays.toString(numbers) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(3);
        customArrayList.add(5);
        customArrayList.add(9);

        System.out.println(customArrayList);
    }
}
