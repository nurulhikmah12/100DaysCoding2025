import java.util.Scanner;
public class day11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Membaca String
    System.out.println("Masukkan nama:");
    String nama = sc.nextLine();

    //Membaca Integer
    System.out.println("Masukkan umur:");
    int umur = sc.nextInt();

    System.out.println("Halo nama saya "+ nama +", dan umur saya "+ umur +" tahun");
  }
}
