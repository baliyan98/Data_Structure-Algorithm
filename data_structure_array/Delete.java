public class Delete {
    
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        
        
        int ele = 5;
        int n = arr.length;

        int res[] = Delete.delete_element(arr, ele, n);
        for(int num : res ){
            System.out.print(num + " ");
        }
    }
    public static int[] delete_element(int arr[], int ele, int n){
         int i = 0;
        for ( i = 0; i < n; i ++){
            if ( arr[i] == ele){
                break;
            }
        }if ( i == n-1){
            arr[n-1] = 0;
        }for(int j = i; j < n-1; j++){
            arr[j] = arr[j+1]; 
        }arr[n-1] = 0;
        return arr;
    }

}
