import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai M: ");
        double m = sc.nextDouble();
        
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        
        double hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= m;
        }
        
        System.out.println(m + " pangkat " + n + " adalah: " + hasil);
    }
}
