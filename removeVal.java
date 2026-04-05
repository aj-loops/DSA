
import java.util.Arrays;
public class removeVal {
    public static int[] removeElement(int[] nums, int val) {

        int k = 0;
        
        for (int i = 0; i < nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++; 
            }
        }
        System.out.println(k);
        return nums;
    }
    public static void main(String[] args) {
        int []arr1 = {5,5,5,5,2,3,4,3,5};
        int value = 5;
        System.out.println("without value " + Arrays.toString(removeElement(arr1,value)));
    }
}

