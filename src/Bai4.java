import java.util.ArrayList;

public class Bai4 {
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

        int sum = 0;
        int index = 0;

        while (index < numbers.size()) {
            sum += numbers.get(index);
            index++;
        }

        System.out.println("Tổng của tất cả phần tử: " + sum);
    }
}
