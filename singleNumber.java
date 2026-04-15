class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int maxx = nums[0];
        
        for(int i = 0; i < n; i++){
            maxx = Math.max(maxx,nums[i]);
        }

        int hash[] = new int[maxx +1];
        for(int i = 0; i < n; i++){
            hash[nums[i]]++;
        }
        for(int i = 0; i < n; i++){
            if(hash[nums[i]] == 1){
                return nums[i];
            }
        }
        return -1;
    }
}