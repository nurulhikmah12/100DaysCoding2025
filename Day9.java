public class day9 {
  public static void main(String[] args) {
    //Deklarasi variabel 
    int umur;
    String namaLengkap;

    //Inisialisasi variabel
    umur = 19; 
    namaLengkap = "Nurul";
    System.out.println("=== Data sebelum update ===");
    System.out.println("Umur saya:"+ umur);
    System.out.println("Nama saya:"+ namaLengkap);

    //Update variabel 
    umur = 20;
    namaLengkap = "Nurul hikmah";

    //Mencetak output
    System.out.println("=== Data sesudah update ==="); 
    System.out.println("Umur saya:"+ umur);
    System.out.println("Nama saya:"+ namaLengkap);
  }
}
