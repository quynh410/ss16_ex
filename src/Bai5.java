import java.util.ArrayList;

public class Bai5 {
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

        ArrayList<Integer> checknb = new ArrayList<>();

        int index = 0;
        while (index < numbers.size()) {
            int currentNumber = numbers.get(index);
            int count = 0;
            if (!checknb.contains(currentNumber)) {
                int innerIndex = 0;
                while (innerIndex < numbers.size()) {
                    if (numbers.get(innerIndex).equals(currentNumber)) {
                        count++;
                    }
                    innerIndex++;
                }
                System.out.println("Số " + currentNumber + " xuất hiện " + count + " lần.");
                checknb.add(currentNumber);
            }
            index++;
        }
    }
}
