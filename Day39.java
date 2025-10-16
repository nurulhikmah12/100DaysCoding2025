import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Makanan");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Minuman");
        } else if (pilihan == 3) {
            System.out.println("Anda keluar");
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}
