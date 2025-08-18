import java.util.Scanner;

public class rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int c = 1;
//        print(n,c);
        print(n,c);
    }
//    static void print(int n , int i)
//    {
//        if(i>n)
//            return;
//        System.out.print(i+" ");
//        print(n,i+1);
//
//    }
    static void print(int n,int c ) {
        if (c>n)
            return;

        print(n,c+1);
        System.out.print(c + " ");
    }
}
