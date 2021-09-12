public class Insert {
    
    public static void main(String[] args) {
        
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        
        int pos = 3;
        int ele = 6;
        int n = arr.length;

        int res[] = Insert.insert_element(arr, pos, ele, n);
        for(int num : res ){
            System.out.print(num + " ");
        }
    }

    public static int[] insert_element(int arr[] , int pos, int ele , int n){
        if(pos == n-1){
            arr[pos] = ele;
            return arr;
        }
        for (int i = n-1; i > pos; i--){
            arr[i] = arr[i-1];
        }arr[pos] = ele;
        return arr;
    }

}
