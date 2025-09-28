public class day21 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        System.out.println("Sebelum ditukar: ");
        System.out.println("Nilai x = "+ x);
        System.out.println("Nilai y = "+ y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("\nSetelah ditukar: ");
        System.out.println("Nilai x = "+ x);
        System.out.println("Nilai y = "+ y);
    }
}
