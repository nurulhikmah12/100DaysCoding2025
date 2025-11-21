import java.util.Scanner;

public class MethodStringDasar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = sc.nextLine();

        // Menggunakan method String dasar
        System.out.println("Panjang teks (length): " + teks.length());
        System.out.println("Teks huruf besar (toUpperCase): " + teks.toUpperCase());
        System.out.println("Teks huruf kecil (toLowerCase): " + teks.toLowerCase());
    }
}
