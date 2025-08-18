import java.util.ArrayList;

public class reverse_pairs {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1};
        int n = arr.length;
        int c = mergesort(arr,0,n-1);
        System.out.println(c);

//      ******************************BRUTE-FORCE****************************************
//        int c = 0;
//        for(int i=0;i<n-1;i++)
//        {
//            for(int j = i+1;j<n;j++)
//            {
//                if(arr[i] > 2 * arr[j])
//                    c++;
//            }
//        }
//        System.out.println(c);
    }
    static int countpair(int[] arr, int s,int m, int e)
    {
        int right = m+1;
        int c = 0;
        for (int i = s;i<=m;i++)
        {
            while (right <= e && arr[i] > 2*arr[right])
                right++;
            c += right - (m+1);
        }
        return c;
    }
    static int mergesort(int[] arr, int s,int e)
    {
        int c = 0;
        if(s>=e)
            return c;
        int m = (s + e) / 2;
        c += mergesort(arr, s, m);
        c += mergesort(arr, m + 1, e);
        c += countpair(arr,s,m,e);
        merge(arr, s, m, e);
        return c;

    }
    static void merge(int[] arr, int s , int m, int e)
    {
        int left = s;
        int right = m+1;

        ArrayList<Integer> temp = new ArrayList<>();
        while(left <= m && right <= e)
        {
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left] );
                left++;
            }
            else {

                temp.add(arr[right] );
                right++;
            }
        }
        while (left<=m)
        {
            temp.add(arr[left] );
            left++;
        }
        while (right <= e)
        {
            temp.add(arr[right] );
            right++;
        }
        for(int i=s;i<=e;i++)
        {
            arr[i] = temp.get(i-s);
        }

    }
}
