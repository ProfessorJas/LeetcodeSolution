import java.util.*;

/**
 * Solution for leetcode 53 'Maximum Subarray'
 * 
 * @author JH
 */
public class solution {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];      // max as the first element of the array
        int cur = nums[0];      // cur is the current element

        for (int i = 1; i < nums.length; ++i) {
            cur = Math.max(cur + nums[i], nums[i]);
            max = Math.max(max, cur);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        int res = maxSubArray(nums);
        System.out.println(res);
    }
}