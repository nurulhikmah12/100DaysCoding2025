public class day19 {
  public static void main(String[] args) {
    double angkaD = 99.99;          //tipe data yang menampung nilai yang besar
    int angkaI = (int) angkaD;      //manual double ke int
    byte angkaB = (byte) angkaI;    //manual int ke byte

    System.out.println("Double: "+ angkaD);
    System.out.println("Integer: "+ angkaI);
    System.out.println("Byte: "+ angkaB);
  }
}
