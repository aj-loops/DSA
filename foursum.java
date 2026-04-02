import java.util.*;

class areelist 
{
    public static List<List<Integer>> fourSum(int[] nums, int target) 
    {

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        // if (n == 4)
        // {
        //     if (nums[0] + nums[1] + nums[2] + nums[3] != target)
        //     {
                
        //         return res;
        //     }
        //     else
        //     { 
        //         res.add(Arrays.asList(nums[0] , nums[1] , nums[2] , nums[3]));
        //         return res;
        //     }   
        // }
        for (int i = 0 ; i < n - 3 ; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])continue;
            
            for (int j = i + 1 ; j < n - 2 ; j++)
            {

                if(j > i + 1 && nums[j] == nums[j-1])continue;
                
                int l = j + 1;
                int r = n - 1;

                while (l < r)
                {
                    long sum = (long)nums[i] + nums[l] + nums[r] + nums [j];
                    if (sum == target)
                    {
                        res.add(Arrays.asList(nums[i] , nums[j] , nums[l] , nums [r]));
                        l++;
                        r--;

                        while(l < r && nums[l] == nums[l - 1])l++;
                        while(l < r && nums[r] == nums[r + 1])r--;
                    }else if (sum < target)
                    {
                        l++;
                    }else 
                    {
                        r--;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num1 = {2,3,1,-2,-3,-1};
        int targe1 = 0;
        System.out.println("sum of this num is"+ fourSum(num1,targe1) +"\" huh looks like target\"");
    }
}