package leetcode;

/***
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 26. Remove Duplicates from Sorted Array
 *
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class Task26Solution {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 5, 6, 7};
        int b = removeDuplicates(a);
        System.out.println(b);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        } else {
            int i = 0;

            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }

            return ++i;
        }
    }

    public static int removeDuplicates1(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
