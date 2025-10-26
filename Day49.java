import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        String status = (umur >= 18) ? "Dewasa" : "Belum Dewasa";
        System.out.println("Status: " + status);
    }
}
