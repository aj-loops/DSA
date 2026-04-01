import java.util.Arrays;
public class sumthreeclosest{

    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];
        if (closest >= target || n == 3) {
            return closest;
        }

        int large = nums[n - 1] + nums[n - 2] + nums[n - 3];
        if (large <= target) {
            return large;
        }

        for (int i = 0; i <= n - 1; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args){
        int []nums1 = {1,2,3,5,6};
        int target1 = 2;
        System.out.println("output 1 is "+ threeSumClosest(nums1,target1));
    }
}    