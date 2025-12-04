import java.util.Scanner;
public class SoalLatihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= 0;
      
        if(a>=b){
           c=a+b;
           if(c %3 ==0){
               for (int i = 1; i <= c; i++) {
                   for (int j = 1; j <= i; j++) {
                       System.out.print("* ");
                   }
                   System.out.println();
               }
           }else{
               System.out.println(c);
           }
        }else {
            c = a * b;
            if (c % 2 == 0) {
                for (int i = 1; i <= c; i++) {
                    for (int j = 1; j <= c; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println(c);
            }
        }
    }
}
