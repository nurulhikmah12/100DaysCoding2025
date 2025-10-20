public class day43 {
    public static void main(String[] args) {
        int batasAtas = 15;

        for (int i = 1; i <= batasAtas; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " adalah kelipatan 3 dan 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " adalah kelipatan 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " adalah kelipatan 5");
            }
        }
    }
}
