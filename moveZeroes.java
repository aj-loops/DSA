class moveZeroes {
    public void movezeroes(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int index = 0;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                cnt++;
            }
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = 1; i <= cnt ; i++){
            nums[n-i] = 0;
        }

        
        // for(int i = 1 ; i <= cnt ; i++){
        //     nums[n-i] = 0;
        // }
        // for (int i = 0; i < n - 1; i++ ){
        //     if(nums[i] != 0){

        //         nums[i] = nums[i+1];
        //         nums[i + 1] = 0;
                
        //     }
        // }
        // for(int i = n-1; i > 0 ; i--){
        //     if(nums[i] == 0){
        //         cnt--;
        //     }
        //     if
        // }
        // int n = nums.length;
        // int v = 0 ;
        // for(int i = 0 ; i < n ; i++){
        //     if(nums[i] == 0){
        //         int temp = nums[i];
        //         nums[i] = nums[v];
        //         nums[v] = temp ;
        //     }
        //     v++;
        // }
    }
}