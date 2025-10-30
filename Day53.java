public class KeywordBreak {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Bilangan 1 sampai 5:");
        while (true) {
            System.out.println(i);
            i++;
            if (i > 5) {
                break;
            }
        }
    }
}
