import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

   You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
 */
public class solution {
    public static int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        /*
            loop through the given array
            use the compliment 
        */
        for (int i = 0; i < nums.length; ++i) {
            int compliment = target - nums[i];

            if (map.containsKey(compliment)) {
                return new int[] {map.get(compliment), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] arr = twosum(nums, target);

        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}