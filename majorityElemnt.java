import java.util.HashMap;
import java.util.Map;

public class majorityElemnt {
    public static  int majorityElement(int[] nums) {
        // int n = nums.length;
        // // int hash[] = new int[n];
        // int max = 0;
        // int num = nums[0];

        // for(int i = 0; i < n; i++){
        //     int cnt = 0;
        //     for(int j = i ; j < n; j++){
        //         if(nums[i] == nums[j]){
        //             cnt++;
        //             if(cnt > max){
        //                 num = nums[i]; 
        //                 max = cnt;
        //             }    
        //         }
        //     }
        // }
        // int max = Arrays.stream(hash).max().getAsInt();
        // return num;

        int n = nums.length;
        HashMap<Integer , Integer> map= new HashMap<>();
        // int max = 0;
        // int num = nums[0];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
            // for(int j = i ; j < n; j++){
            //     if(nums[i] == nums[j]){
            //         cnt++;
            //         if(cnt > max){
            //             num = nums[i]; 
            //             max = cnt;
            //         }    
            //     }
            // }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }


        // int max = Arrays.stream(hash).max().getAsInt();
        return -1;
    }
    public static void main(String[] args) {
        int []map = {2,2,2,2,4,4,4,3};
        System.out.println(map);
    }
}
