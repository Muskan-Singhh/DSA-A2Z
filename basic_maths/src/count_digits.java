import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = (int) (Math.log10(n)+1);
//        while(n>0)
//        {
//            d ++;
//            n=n/10;
//        }
       System.out.println(d);
    }
}
