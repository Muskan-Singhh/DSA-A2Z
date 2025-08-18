import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        int s = 0;
        int e = str.length()-1;
        System.out.println(pal(str,s,e));
    }
    static boolean pal(String str,int s,int e)
    {
        if(s>=e)
            return true;
        if(str.charAt(s)!= str.charAt(e))
            return false;
        return pal(str,s+1,e-1);
    }
}
