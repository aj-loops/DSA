import java.util.Arrays;

// public class Solution {
//     public void nextPermutation(int[] nums) {
//         int k = 0;
//         int n = nums.length;
//         // int temp =0;

//         for (int i = 0; i < n-1; i++){
//             if(nums[i] < nums[j])
//             for (int j = n-1 ; j > 0 ; j--){
//                 if(nums[i] < nums[j]){
//                     nums[i] = nums[i] ^ nums[j];
//                     nums[j] = nums[i] ^ nums[j];
//                     nums[i] = nums[i] ^ nums[j];
//                 }
                    
                
//                 // for(int i = n-1; i <= 0; i--){
//                 //     nums[k] = nums[i];
//                 //     k++;
//                 // }
//                 // nums.sort();
//                 // return nums;
//             }
//         }
//     }
// } nextPermutation {

class nextPermutation {
    public static  void nextpermutation(int[] nums) {
        int n = nums.length;

        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int slop[] = {1,2,4,5,9};
        nextpermutation(slop);
        System.out.println("next permutation "+Arrays.toString(slop));
    }
}

