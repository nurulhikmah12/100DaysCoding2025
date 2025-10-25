import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");

        System.out.print("Pilih operasi (1-4): ");
        int pilihan = sc.nextInt();

        System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println(angka1 + " + " + angka2 + " = " + (angka1 + angka2));
                break;
            case 2:
                System.out.println(angka1 + " - " + angka2 + " = " + (angka1 - angka2));
                break;
            case 3:
                System.out.println(angka1 + " * " + angka2 + " = " + (angka1 * angka2));
                break;
            case 4:
                if (angka2 != 0) {
                    System.out.println(angka1 + " / " + angka2 + " = " + (angka1 / angka2));
                } else {
                    System.out.println("Error: Pembagian dengan nol!");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
