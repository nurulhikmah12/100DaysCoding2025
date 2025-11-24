import java.util.Scanner;

public class MethodStringLengkap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = sc.nextLine();

        System.out.println("\n=== Hasil Manipulasi String ===");

        // length()
        System.out.println("Panjang teks: " + teks.length());

        // toUpperCase()
        System.out.println("Huruf besar: " + teks.toUpperCase());

        // toLowerCase()
        System.out.println("Huruf kecil: " + teks.toLowerCase());

        // charAt()
        if (teks.length() > 0) {
            System.out.println("Karakter pertama: " + teks.charAt(0));
        }

        // substring()
        if (teks.length() >= 5) {
            System.out.println("Substring (0-5): " + teks.substring(0, 5));
        }

        // contains()
        System.out.println("Mengandung kata 'java'? " + teks.contains("java"));

        // replace()
        System.out.println("Replace huruf 'a' -> '*': " + teks.replace("a", "*"));

        // trim()
        System.out.println("Setelah trim(): '" + teks.trim() + "'");
    }
}
