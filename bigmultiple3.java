import java.util.Arrays;

public class bigmultiple3 {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if (n == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        // for(int i = n; i > n-2; i--){
        // nums[i]
        // }
        int n1 = nums[0] * nums[1] * nums[n - 1];
        int n2 = nums[n - 3] * nums[n - 1] * nums[n - 2];
        return Math.max(n1, n2);
    }
}