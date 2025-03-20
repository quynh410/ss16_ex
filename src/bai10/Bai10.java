package bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai10   {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập danh sách sinh viên (ít nhất 5 sinh viên):");
        int count = 0;
        while (count < 5) {
            System.out.print("Nhập mã sinh viên: ");
            String id = scanner.nextLine();

            System.out.print("Nhập họ và tên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập điểm GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // Xóa bộ nhớ đệm

            students.add(new Student(id, name, gpa));
            count++;
        }

        int choice;
        do {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Tìm kiếm sinh viên theo tên");
            System.out.println("3. Hiển thị danh sách sau khi phân loại GPA");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ nhớ đệm

            if (choice == 1) {
                System.out.println("\nDanh sách sinh viên:");
                for (Student student : students) {
                    System.out.println(student);
                }
            } else if (choice == 2) {
                System.out.print("Nhập tên sinh viên cần tìm: ");
                String searchName = scanner.nextLine();
                boolean found = false;
                for (Student student : students) {
                    if (student.getName().toLowerCase().contains(searchName.toLowerCase())) {
                        System.out.println(student);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Không tìm thấy sinh viên có tên: " + searchName);
                }
            } else if (choice == 3) {
                ArrayList<Student> excellent = new ArrayList<>();
                ArrayList<Student> good = new ArrayList<>();
                ArrayList<Student> average = new ArrayList<>();
                ArrayList<Student> weak = new ArrayList<>();

                for (Student student : students) {
                    if (student.getGpa() >= 8.5) {
                        excellent.add(student);
                    } else if (student.getGpa() >= 7.0) {
                        good.add(student);
                    } else if (student.getGpa() >= 5.5) {
                        average.add(student);
                    } else {
                        weak.add(student);
                    }
                }

                System.out.println("\nSinh viên loại Xuất sắc:");
                for (Student student : excellent) {
                    System.out.println(student);
                }

                System.out.println("\nSinh viên loại Giỏi:");
                for (Student student : good) {
                    System.out.println(student);
                }

                System.out.println("\nSinh viên loại Khá:");
                for (Student student : average) {
                    System.out.println(student);
                }

                System.out.println("\nSinh viên loại Trung bình/Yếu:");
                for (Student student : weak) {
                    System.out.println(student);
                }
            } else if (choice == 0) {
                System.out.println("Chương trình kết thúc.");
            } else {
                System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        } while (choice != 0);
    }
}

