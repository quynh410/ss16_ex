import java.util.ArrayList;

public class Bai7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);
        numbers.add(50);
        numbers.add(60);

        System.out.println("\nCác phần tử xuất hiện đúng một lần:");
        printUniqueE(numbers);

        System.out.println("\nCác phần tử bị trùng lặp kèm số lần xuất hiện:");
        printDuplicateE(numbers);
    }

    public static void printUniqueE(ArrayList<Integer> list) {
        int index = 0;
        while (index < list.size()) {
            int currentNumber = list.get(index);
            int count = 0;
            int innerIndex = 0;

            while (innerIndex < list.size()) {
                if (list.get(innerIndex).equals(currentNumber)) {
                    count++;
                }
                innerIndex++;
            }

            if (count == 1) {
                System.out.println(currentNumber);
            }
            index++;
        }
    }

    public static void printDuplicateE(ArrayList<Integer> list) {
        ArrayList<Integer> checknb = new ArrayList<>();
        int index = 0;

        while (index < list.size()) {
            int currentNumber = list.get(index);
            int count = 0;
            int innerIndex = 0;

            if (!checknb.contains(currentNumber)) {
                while (innerIndex < list.size()) {
                    if (list.get(innerIndex).equals(currentNumber)) {
                        count++;
                    }
                    innerIndex++;
                }

                if (count > 1) {
                    System.out.println("Số " + currentNumber + " xuất hiện " + count + " lần.");
                }

                checknb.add(currentNumber);
            }
            index++;
        }
    }
}
