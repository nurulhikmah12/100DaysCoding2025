public class Array1DSederhana {
    public static void main(String[] args) {

        // Membuat array 1D berisi 5 angka
        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("Isi Array 1D:");

        // Menampilkan isi array menggunakan perulangan for
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index " + i + " = " + angka[i]);
        }
    }
}
