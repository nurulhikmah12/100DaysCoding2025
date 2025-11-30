public class JumlahElemenArray {
    public static void main(String[] args) {

        // Membuat array
        int[] angka = {5, 10, 15, 20, 25};

        int jumlah = 0;

        // Menjumlahkan semua elemen array
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }

        // Menampilkan hasil
        System.out.println("Total jumlah elemen array: " + jumlah);
    }
}
