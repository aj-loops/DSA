public class majorityElemnt {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // int hash[] = new int[n];
        int max = 0;
        int num = nums[0];

        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = i ; j < n; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                    if(cnt > max){
                        num = nums[i]; 
                        max = cnt;
                    }    
                }
            }
        }
        // int max = Arrays.stream(hash).max().getAsInt();
        return num;
    }
}
