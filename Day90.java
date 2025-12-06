public class ContohMethodNonVoid {

    // Method non-void yang mengembalikan nilai berupa integer
    public static int tambah(int a, int b) {
        return a + b;  // Mengembalikan hasil penjumlahan
    }

    public static void main(String[] args) {
        // Memanggil method non-void dan menyimpan hasilnya
        int hasil = tambah(5, 3);

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
