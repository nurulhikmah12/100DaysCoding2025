public class AngkaMinimalArray {
    public static void main(String[] args) {

        // Membuat array
        int[] angka = {12, 45, 7, 30, 56, 22};

        // Menganggap elemen pertama sebagai nilai minimum awal
        int min = angka[0];

        // Mencari nilai terkecil
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }

        // Menampilkan hasil
        System.out.println("Angka terkecil dalam array adalah: " + min);
    }
}
