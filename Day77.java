import java.util.Scanner;

public class MethodStringManipulasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = sc.nextLine();

        // Menggunakan substring()
        System.out.println("Substring (0-5): " + teks.substring(0, 5));

        // Menggunakan replace()
        System.out.println("Replace 'a' dengan '*': " + teks.replace("a", "*"));

        // Menggunakan trim()
        System.out.println("Setelah trim(): '" + teks.trim() + "'");
    }
}
