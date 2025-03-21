import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        HashSet<Integer> primes = new HashSet<>();
        HashSet<Integer> evens = new HashSet<>();
        HashSet<Integer> odds = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập các số nguyên (nhập -1 để kết thúc):");
        int num;

        while (true) {
            num = scanner.nextInt();
            if (num == -1) break;
            numbers.add(num);
        }
        scanner.close();

        int index = 0;
        while (index < numbers.size()) {
            int current = numbers.get(index);

            if (isPrime(current)) {
                primes.add(current);
            } else {
                if (current % 2 == 0) {
                    evens.add(current);
                } else {
                    odds.add(current);
                }
            }
            index++;
        }

        System.out.println("\nSố nguyên tố: " + primes);
        System.out.println("Số chẵn (không phải số nguyên tố): " + evens);
        System.out.println("Số lẻ (không phải số nguyên tố): " + odds);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }
}
