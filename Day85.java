public class AngkaMaksimalArray {
    public static void main(String[] args) {

        // Membuat array
        int[] angka = {12, 45, 7, 30, 56, 22};

        // Menganggap elemen pertama sebagai nilai maksimum awal
        int max = angka[0];

        // Mencari nilai terbesar
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        // Menampilkan hasil
        System.out.println("Angka terbesar dalam array adalah: " + max);
    }
}
