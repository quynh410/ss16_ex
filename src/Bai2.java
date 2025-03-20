import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(9);
        numbers.add(29);

        System.out.println("Danh sách ban đầu: " + numbers);

        numbers.removeIf(num -> num % 3 == 0);

        System.out.println("Danh sách sau khi xóa các số chia hết cho 3: " + numbers);
    }
}
