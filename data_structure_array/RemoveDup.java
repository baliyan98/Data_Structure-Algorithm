import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDup {
    
    public static void main(String[] args) {
       
        ArrayList<Integer> list  = new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5,5,6));
        int n = list.size();
        int res = RemoveDup.duplicate(list, n);
        for(int i = 0; i < res; i++){
            System.out.print(list.get(i) + " ");
        }
        

    }
    public static int duplicate(ArrayList<Integer> list , int n){

        int res = 1;
        for(int i = 1; i < n; i++){
            if(list.get(i) != list.get(res-1)){
                list.set(res, list.get(i));
                res ++;
            }
        }
        return res;
    }
}
