//QUESTION : Search Single Element in a sorted array

//Problem Statement: Given an array of N integers.
//Every number in the array except one appears twice.
//Find the single number in the array.

//Example 1:
//Input Format: arr[] = {1,1,2,2,3,3,4,5,5,6,6}
//Result: 4
//Explanation: Only the number 4 appears once in the array.

// Example 2:

//Input Format: arr[] = {1,1,3,5,5}
//Result: 3
//Explanation: Only the number 3 appears once in the array.

public class search_appearing_once {
    static int func(int[] arr,int n)
    {
        // EDGE CASES :
        if(n == 1)
            return arr[0];
        if(arr[0] != arr[1])
            return arr[0];
        if(arr[n-1] != arr[n-2])
            return arr[n-1];

        int low = 1 , high = n-2;
        while (low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1])      //mid element is the single element
                return arr[mid];
            if((mid % 2) == 1 && arr[mid] == arr[mid-1] || (mid % 2) == 0 && arr[mid] == arr[mid+1])    // we're in left half
            {

                    low = mid+1;
            }
            else{                                                                       // we're in right half

                    high = mid-1;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5,6,6};
        int n = arr.length;
        int ans = func(arr,n);
        System.out.println(ans);
    }
}
