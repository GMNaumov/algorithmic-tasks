package leetcode;

/***
 * https://leetcode.com/problems/sort-colors/
 * 75. Sort Colors
 *
 * Given an array nums with n objects colored red, white, or blue,
 * sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color
 * red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 */
public class Task75Solution {
    public static void main(String[] args) {
        int[] a = new int[]{2, 0, 2, 1, 1, 0};
    }

    public static void sortColors(int[] nums) {
        int i;
        int cnt[] = {0, 0, 0};

        for (i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }

        for (i = 0; i < cnt[0]; i++) {
            nums[i] = 0;
        }

        for (i = cnt[0]; i < cnt[0] + cnt[1]; i++) {
            nums[i] = 1;
        }

        for (i = cnt[0] + cnt[1]; i < cnt[0] + cnt[1] + cnt[2]; i++) {
            nums[i] = 2;
        }
    }

    /***
     * We traverse the array and use two variables:
     *
     * 1) zeroIndex to indicate the index where we should put 0
     * 2) twoIndex to indicate the index where we should put 2
     * If current element a[i] is 0, we swap a[i] and a[zeroIndex],
     * if a[i] is 2, we swap a[i] and a[twoIndex],
     * if a[i] is one, we do nothing and continue to process next element.
     *
     * @param nums
     */
    public static void sortColors2(int[] nums) {
        int zIndex = 0;
        int tIndex = nums.length - 1;
        int i = 0;

        while (i <= tIndex) {
            if (nums[i] == 0) {
                swap(nums, zIndex++, i++);
            } else if (nums[i] == 2) {
                swap(nums, tIndex--, i);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
