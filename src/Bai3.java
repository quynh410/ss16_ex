import java.util.ArrayList;

public class Bai3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(25);
        numbers.add(7);
        numbers.add(47);
        numbers.add(18);
        numbers.add(55);
        numbers.add(63);
        numbers.add(5);
        numbers.add(90);
        numbers.add(21);

        int max = numbers.get(0);
        int min = numbers.get(0);
        int index = 1;

        while (index < numbers.size()) {
            int num = numbers.get(index);
            if (num > max) max = num;
            if (num < min) min = num;
            index++;
        }

        System.out.println("Số lớn nhất: " + max);
        System.out.println("Số nhỏ nhất: " + min);
    }
}
