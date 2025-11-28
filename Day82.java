import java.util.Scanner;

public class IsiDanTampilArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat array dengan ukuran 5
        int[] angka = new int[5];

        // Mengisi elemen array
        System.out.println("Masukkan 5 angka:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + i + ": ");
            angka[i] = sc.nextInt();
        }

        // Menampilkan isi array
        System.out.println("\nIsi array adalah:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index " + i + " = " + angka[i]);
        }
    }
}
