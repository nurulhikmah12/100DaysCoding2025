public class day14 {
    public static void main(String[] args) {
        String aByte = "100";
        String aShort = "2000";
        String aInt = "30000";
        String aLong = "4000000000";
        String aFloat = "12.34";
        String aDouble = "56.789";
        String aBool = "true";
        String aChar = "A";
        
        // Konversi String ke tipe primitif
        byte nilaiByte = Byte.parseByte(aByte);
        short nilaiShort = Short.parseShort(aShort);
        int nilaiInt = Integer.parseInt(aInt);
        long nilaiLong = Long.parseLong(aLong);
        float nilaiFloat = Float.parseFloat(aFloat);
        double nilaiDouble = Double.parseDouble(aDouble);
        boolean nilaiBool = Boolean.parseBoolean(aBool);
        char nilaiChar = aChar.charAt(0);
        
        
        // Tampilkan hasil
        System.out.println("String ke byte   : " + nilaiByte);
        System.out.println("String ke short  : " + nilaiShort);
        System.out.println("String ke int    : " + nilaiInt);
        System.out.println("String ke long   : " + nilaiLong);
        System.out.println("String ke float  : " + nilaiFloat);
        System.out.println("String ke double : " + nilaiDouble);
        System.out.println("String ke boolean: " + nilaiBool);
        System.out.println("String ke char   : " + nilaiChar);
        
        
    }
    
}
