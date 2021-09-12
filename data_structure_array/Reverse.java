public class Reverse {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int[] res = Reverse.reverse(arr,n);

        for(int num : res){
            System.out.print(num + " ");
        }
    }

    public static int[] reverse(int arr[], int n){
        int i = 0 , j = n-1;
        while ( i < j){
           Reverse.swap(arr,i,j);
            i ++;
            j --;
        }return arr;
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
