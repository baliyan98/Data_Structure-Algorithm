import java.util.*;

class CountDistinctElement{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,2,4,5};
        int n = arr.length;
        System.out.println(countDistinct(arr, n));
    }

    static int countDistinct(int arr[], int n)
    {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < n; i++)
          hs.add(arr[i]);
    
       return hs.size();        
    }
}