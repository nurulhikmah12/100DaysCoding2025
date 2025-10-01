import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        scanner.close();

        double luas = 3.14 * jariJari * jariJari;

        System.out.println("Luas lingkaran: " + luas);
    }
}
