public class day36 {
    public static void main(String[] args) {
        int umur = 25;
        boolean memilikiSIM = true;

        if (umur >= 17) {
            if (memilikiSIM) {
                System.out.println("Anda dapat mengemudi");
            } else {
                System.out.println("Anda perlu memiliki SIM terlebih dahulu");
            }
        } else {
            System.out.println("Anda tidak dapat mengemudi");
        }
    }
}
