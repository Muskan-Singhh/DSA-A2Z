import java.util.*;

public class leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
//      *************************BRUTE-FORCE**********************************
       ArrayList<Integer> lead = new ArrayList<>();
        boolean flag;

       for(int i=0;i<n-1;i++)
       {
           flag = true;
           for(int j=i+1;j<n;j++)
           {

               if(arr[i]<arr[j])
               {
                  flag = false;

                  break;
               }
           }
           if(flag == true)
                lead.add(arr[i]);

       }
        lead.add(arr[n-1]);
        System.out.println(lead);
    }
}
