public class rearrangeBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        int neg = 1;
        int pos = 0;
        
        for(int i = 0; i < n; i++){

            if(nums[i] > 0){
                temp[pos] = nums[i];
                pos += 2;
            }
            else{
                temp[neg] = nums[i];
                neg += 2;
            }
        }
        return temp;
    }
}