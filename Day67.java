import java.util.Scanner;

public class PolaHorizontal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bintang: ");
        int jumlah = input.nextInt();

        // Menampilkan pola bintang secara horizontal
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("* ");
        }
    }
}
