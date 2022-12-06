package leetcode;

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
}
