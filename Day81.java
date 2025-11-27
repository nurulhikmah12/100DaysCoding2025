import java.util.Scanner;

public class AksesElemenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat array
        int[] angka = {5, 10, 15, 20, 25};

        System.out.print("Masukkan indeks yang ingin diakses (0-4): ");
        int index = sc.nextInt();

        // Mengecek apakah indeks valid
        if (index >= 0 && index < angka.length) {
            System.out.println("Elemen pada indeks " + index + " adalah: " + angka[index]);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
}
