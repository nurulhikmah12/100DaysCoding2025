import java.util.Scanner;
public class latihan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan angka: ");
    int angka = sc.nextInt();

    if(angka % 2 == 0) {
      System.out.println("Angka "+ angka +" adalah genap");
    }else{
      System.out.println("Angka "+ angka +" adalah ganjil");
    }
  }
}
