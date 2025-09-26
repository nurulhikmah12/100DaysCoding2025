public class day19 {
  public static void main(String[] args) {
    double angkaDouble = 99.99;          //tipe data yang menampung nilai yang besar
    int angkaInteger = (int) angkaDouble;      //manual double ke int
    byte angkaByte = (byte) angkaInteger;    //manual int ke byte

    System.out.println("Double: "+ angkaDouble);
    System.out.println("Integer: "+ angkaInteger);
    System.out.println("Byte: "+ angkaByte);
  }
}
