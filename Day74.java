import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU SEDERHANA =====");
            System.out.println("1. Say Hello");
            System.out.println("2. Tampilkan Waktu");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo! Semoga harimu menyenangkan :)");
                    break;

                case 2:
                    System.out.println("Waktu sekarang: " + java.time.LocalTime.now());
                    break;

                case 3:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);
    }
}
