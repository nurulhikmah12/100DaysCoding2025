import java.util.Scanner;

public class PolaPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int n = input.nextInt();

        // Membuat pola persegi n x n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
