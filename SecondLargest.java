

public class SecondLargest {
    
    public static void main(String[] args) {
        
        int[] arr = {8,7,6,12,11,10};
        int n = arr.length;
        System.out.println(SecondLargest.sLargest(arr,n));
    }
    public static int sLargest(int arr[], int n){
        int res = -1;
        int larg = arr[0];
        for(int i = 1; i < n; i++){
            if ( arr[i] > larg){
                res = larg;
                larg = arr[i];
            }else if (arr[i] != larg && arr[i] > res){
                res = arr[i];
            }
        }
        return res;
    }
    
}
