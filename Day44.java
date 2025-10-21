import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double nilai = sc.nextDouble();

        String predikat;
        if (nilai >= 90) {
            predikat = "A";
        } else if (nilai >= 80) {
            predikat = "B";
        } else if (nilai >= 70) {
            predikat = "C";
        } else if (nilai >= 60) {
            predikat = "D";
        } else {
            predikat = "E";
        }

        System.out.println("Predikat nilai: " + predikat);
    }
}
