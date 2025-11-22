import java.util.Scanner;

public class MethodStringPengecekan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan teks pertama: ");
        String teks1 = sc.nextLine();

        System.out.print("Masukkan teks kedua: ");
        String teks2 = sc.nextLine();

        // Mengecek apakah teks kosong
        if (teks1.isEmpty()) {
            System.out.println("Teks pertama kosong.");
        } else {
            System.out.println("Teks pertama tidak kosong.");
        }

        // Mengecek apakah kedua teks sama persis (case sensitive)
        System.out.println("equals(): " + teks1.equals(teks2));

        // Mengecek apakah kedua teks sama tanpa memperhatikan besar-kecil huruf
        System.out.println("equalsIgnoreCase(): " + teks1.equalsIgnoreCase(teks2));

        // Mengecek apakah teks pertama mengandung teks kedua
        System.out.println("contains(): " + teks1.contains(teks2));
    }
}
