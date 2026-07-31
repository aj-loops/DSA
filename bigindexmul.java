public class bigindexmul {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int val1 = 0;
        int val2 = 0;

        if (n == 2) {
            return (nums[0] - 1) * (nums[1] - 1);
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] >= val1) {
                val2 = val1;
                val1 = nums[i];
            } else if (val2 < nums[i]) {
                val2 = nums[i];
            }
            // if(nums[i] > val2 && val1 != nums[i]){
            // val2 = nums[i];
            // }
        }
        return (val1 - 1) * (val2 - 1);
    }
}