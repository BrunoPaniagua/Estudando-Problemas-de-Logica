package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		System.out.println(Arrays.toString(twoSum(nums, 13)));

	}

	public static int[] twoSum(int nums[], int target) {

		Map<Integer, Integer> mapeamento = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (mapeamento.containsKey(nums[i])) {
				return new int[]{ mapeamento.get(nums[i]), i };
			}
			mapeamento.put(target - nums[i], i);
		}

		return null;
	}
}
