class Solution {
    public boolean check(int[] nums) {
        int cunt = 0;
        int n = nums.length;
        // if(nums[i] > nums[])
        for (int i = 0; i < n; i++)
            if(nums[i] > nums[(i + 1)%n]){
                cunt++; 
                // if (cunt > 1) return false;
            }
        return cunt <= 1;
    }
}