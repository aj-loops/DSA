public class singleNum {
    public int singleNumber(int[] nums) {
        // int n = nums.length;
        // HashMap<Integer, Integer> map= new HashMap<>(); 
        // int cnt = 0;
        // int el = 0;
        int result = 0;

        for(int num : nums){
            result ^= num;

        }
        return result;
    }
}
