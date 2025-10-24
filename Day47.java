import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor hari (1-7): ");
        int hari = sc.nextInt();

        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        if (hari >= 1 && hari <= 7) {
            System.out.println("Hari " + namaHari[hari - 1]);
        } else {
            System.out.println("Nomor hari tidak valid");
        }
    }
}
