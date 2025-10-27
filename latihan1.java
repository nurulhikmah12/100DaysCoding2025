import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gajiPokok = 4500000;
        double bonusKehadiran = 200000;
        double potonganKeterlambatan = 10000;
        double pajakPenghasilan = 0.05;
        System.out.print("Masukkan jumlah keterlambatan: ");
        int keterlambatan = scanner.nextInt();

        // Menghitung potongan
        double potongan = (keterlambatan > 5) ? (keterlambatan * potonganKeterlambatan) : 0;

        //Menghitung bonus
        double bonus = (keterlambatan == 0) ? bonusKehadiran : 0;

        // Menghitung gaji kotor
        double gajiKotor = gajiPokok - potongan + bonus;

        // Menghitung pajak
        double pajak = gajiKotor * pajakPenghasilan;

        // Menghitung gaji bersih
        double gajiBersih = gajiKotor - pajak;

        System.out.println("Gaji Kotor: Rp " + gajiKotor);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }
}
