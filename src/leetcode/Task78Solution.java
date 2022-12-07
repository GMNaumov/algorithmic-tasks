package leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 * https://leetcode.com/problems/subsets/description/
 * 78. Subsets
 *
 * Given an integer array nums of unique elements,
 * return all possible subsets (the power set).
 *
 * The solution set must not contain duplicate subsets.
 * Return the solution in any order.
 */
public class Task78Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        handler(nums, subsets, 0, new ArrayList<Integer>());
        return subsets;
    }

    public void handler(int[] nums, List<List<Integer>> output, int index, List<Integer> current) {
        output.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            handler(nums, output, i + 1, current);
            current.remove(current.size() - 1);
        }
    }
}
