import java.util.ArrayList;

public class Bai8 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("banana");
        words.add("apple");
        words.add("grape");
        words.add("kiwi");
        words.add("orange");
        words.add("pear");
        words.add("pineapple");
        words.add("mango");

        System.out.println("Danh sách trước khi sắp xếp:");
        printList(words);

        sortByLength(words);

        System.out.println("\nDanh sách sau khi sắp xếp:");
        printList(words);
    }

    public static void sortByLength(ArrayList<String> list) {
        int n = list.size();
        int i = 0;

        while (i < n - 1) {
            int j = 0;
            while (j < n - i - 1) {
                String str1 = list.get(j);
                String str2 = list.get(j + 1);

                boolean swap = false;

                if (str1.length() > str2.length()) {
                    swap = true;
                } else if (str1.length() == str2.length() && str1.compareTo(str2) > 0) {
                    swap = true;
                }

                if (swap) {
                    list.set(j, str2);
                    list.set(j + 1, str1);
                }
                j++;
            }
            i++;
        }
    }

    public static void printList(ArrayList<String> list) {
        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }
    }
}
