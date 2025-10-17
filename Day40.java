import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();
        System.out.print("Apakah Anda ingin menjumlahkan? (1 untuk Ya, 2 untuk Tidak): ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println(angka1 + " + " + angka2 + " = " + (angka1 + angka2));
        } else {
            System.out.println("Operasi dibatalkan");
        }
    }
}
