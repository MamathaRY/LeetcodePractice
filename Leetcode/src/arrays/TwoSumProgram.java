package arrays;

import java.util.*;

public class TwoSumProgram {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			// if other element present in hashtable return result
			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				return result;

			}
			// else put current value and key in map
			map.put(nums[i], i);

		}
		return result;
	}

	public static void main(String args[]) {
		int target = 7;
		int nums[] = { 10, 5, 6, 8, 2, 12 };
		System.out.println("Two sum  :" + Arrays.toString(twoSum(nums, target)));
	}
}
