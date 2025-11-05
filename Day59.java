import java.util.Scanner;

public class CetakGanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        System.out.println("Angka ganjil dari 1 hingga " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nAngka genap dari 1 hingga " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
