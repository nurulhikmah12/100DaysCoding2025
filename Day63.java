import java.util.Scanner;

public class KaliBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();
        
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        
        System.out.println("Hasil perkalian bilangan dari 1 hingga " + n + " adalah: " + hasil);
    }
}
