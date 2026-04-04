import java.util.Arrays;
public class removeDuplicates {
    public static int[] removeDuplicate(int[] nums) {

        int n = nums.length; 
        // if (n == 0) return 0;

        int k = 1;
        
        for (int i = 1; i < n ; i++){
            if (nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        // return k;

        int []res = new int[k];

        for (int i = 0; i < k; i++){
            res[i] = nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int []number = {0,1,1,2,3}; 
        System.out.println("new list without twin : " + Arrays.toString(removeDuplicate(number)));
    }
}

