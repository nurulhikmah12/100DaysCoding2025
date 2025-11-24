import java.util.Scanner;

public class LoginAkun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat akun
        System.out.print("Buat username: ");
        String username = sc.nextLine();

        System.out.print("Buat password: ");
        String password = sc.nextLine();

        System.out.println("\nAkun berhasil dibuat!");
        System.out.println("=== Silakan Login ===");

        String userInput, passInput;

        // Loop login sampai benar
        while (true) {
            System.out.print("\nMasukkan username: ");
            userInput = sc.nextLine();

            System.out.print("Masukkan password: ");
            passInput = sc.nextLine();

            if (userInput.equals(username) && passInput.equals(password)) {
                System.out.println("Login berhasil! Selamat datang, " + username + "!");
                break; // keluar dari loop jika benar
            } else {
                System.out.println("Username atau password salah! Coba lagi.");
            }
        }
    }
}
