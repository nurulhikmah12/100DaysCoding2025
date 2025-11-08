import java.util.Scanner;

public class JumlahBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }
        
        System.out.println("Jumlah bilangan dari 1 hingga " + n + " adalah: " + jumlah);
    }
}
