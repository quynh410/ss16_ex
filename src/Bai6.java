import java.util.ArrayList;

public class Bai6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);


        System.out.println("Danh sách ban đầu: " + numbers);
        numbers = removeDp(numbers);

        System.out.println("Danh sách sau khi loại bỏ trùng lặp: " + numbers);
    }

    public static ArrayList<Integer> removeDp(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        int index = 0;
        while (index < list.size()) {
            int currentNumber = list.get(index);
            if (!uniqueList.contains(currentNumber)) {
                uniqueList.add(currentNumber);
            }
            index++;
        }
        return uniqueList;
    }
}
