import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        // Mencetak angka 1-N
        System.out.println("Angka 1-" + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        // Mencetak angka N-1
        System.out.println("\n\nAngka " + N + "-1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
