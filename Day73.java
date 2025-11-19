import java.util.Scanner;

public class PenjumlahanBerhentiNegatif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah = 0;
        int angka;

        System.out.println("Masukkan angka (program berhenti jika memasukkan angka negatif):");

        do {
            angka = sc.nextInt();

            if (angka >= 0) {
                jumlah += angka;
            }

        } while (angka >= 0);

        System.out.println("Total penjumlahan: " + jumlah);
    }
}
