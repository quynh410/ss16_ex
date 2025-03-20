import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Nguyễn Văn A");
        students.add("Trần Thị B");
        students.add("Lê Văn C");
        students.add("Phạm Thị D");
        students.add("Hoàng Văn E");

        System.out.println("Duyệt bằng vòng lặp for:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("\nDuyệt bằng vòng lặp foreach:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("\nDuyệt bằng Iterator:");
        for (var iterator = students.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }


    }
}
