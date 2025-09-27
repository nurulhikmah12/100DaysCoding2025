public class Main {
    public static void main(String[] args) {
        int angkaInt = 10;
        double angkaDouble = 10.5;
        boolean a = true;
        char karakter = 'A';

        String nilaiInt = String.valueOf(angkaInt);
        String nilaiDouble = String.valueOf(angkaDouble);
        String nilaiBoolean = String.valueOf(a);
        String nilaiChar = String.valueOf(karakter);

        System.out.println("int menjadi String: " + nilaiInt);
        System.out.println("double menjadi String: " + nilaiDouble);
        System.out.println("boolean menjadi String: " + nilaiBoolean);
        System.out.println("char menjadi String: " + nilaiChar);
    }
}
