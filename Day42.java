import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = sc.nextDouble();

        System.out.print("Masukkan pajak (%): ");
        double pajak = sc.nextDouble();

        double gajiBersih = gajiPokok - (gajiPokok * pajak / 100);

        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }
}
