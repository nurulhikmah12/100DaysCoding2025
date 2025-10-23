import java.util.Scanner;

public class MenuSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Ya");
                break;
            case
