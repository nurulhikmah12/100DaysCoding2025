import java.util.Scanner; 
public class day23 {
  public static void main(String[] args) {
    Scanner nh = new Scanner(System.in);
    System.out.print("Masukkan panjang: ");
    double panjang = nh.nextDouble();
    System.out.print("Masukkan lebar: ");
    double lebar = nh.nextDouble();

    //rumus menghitung luas persegi panjang (panjang * lebar)
    double luas = panjang * lebar; 

    //mencetak 
    System.out.println("Luas persegi panjang: "+ luas);
    
  }
}
