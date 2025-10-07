public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z = 10;

        System.out.println("x <= y: " + (x <= y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= z: " + (x <= z));
        System.out.println("z <= x: " + (z <= x));
        System.out.println("z >= y: " + (z >= y));
        System.out.println("y >= z: " + (y >= z));
    }
}
