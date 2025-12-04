public class AksesArrayForEach {
    public static void main(String[] args) {

        // Membuat array
        int[] angka = {5, 10, 15, 20, 25};

        System.out.println("Mengakses elemen array menggunakan for-each:");

        // Menggunakan for-each untuk menampilkan elemen array
        for (int nilai : angka) {
            System.out.println("Nilai: " + nilai);
        }
    }
}
