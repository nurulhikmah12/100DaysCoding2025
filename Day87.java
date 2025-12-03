import java.util.Scanner;

public class CariElemenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat array
        int[] angka = {10, 20, 30, 40, 50};

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = sc.nextInt();

        boolean ditemukan = false;

        // Mencari elemen dalam array
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                System.out.println("Angka " + cari + " ditemukan pada indeks " + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Angka " + cari + " tidak ditemukan dalam array.");
        }
    }
}
