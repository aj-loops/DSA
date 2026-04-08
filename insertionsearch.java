public class insertionsearch {
    public static int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        int res = nums.length;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] >= target){
                res = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int mun[] = {1,2,3,6,7,8};
        int gettar = 5;
        System.out.println("the index will be at :" + searchInsert(mun,gettar));
    }
}

