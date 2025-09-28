public class day21 {
  public static void main(String[] args) {
    int x = 10;
    double y = 20.5;

    System.out.println("Sebelum ditukar: ");
    System.out.println("Nilai x = "+ x);
    System.out.println("Nilai y = "+ y);

    //Menggunakan variabel sementara bertipe double
    double temp = x;      //x dipromosikan otomatis ke double
    x = (int) y;          //y dikonversi ke int saat masuk ke x          
    y = temp;             //temp (double) masuk ke y 

     System.out.println("\nSetelah ditukar: ");
     System.out.println("Nilai x = "+ x);
     System.out.println("Nilai y = "+ y);
  }
}
