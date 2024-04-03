package ru.education.complexity;

/**
 * <a href="https://leetcode.com/problems/search-insert-position/description/">Условие</a>
 *  Время работы O(n)
 *  Сложность по памяти О(n)
 */
public class SearchInsertPosition {

    private static int x(int[] nums, int target) {
        int n = 0;
        int m = nums.length - 1;

        while (n <= m) {
            int x = n + (m - n) / 2;
            int value = nums[x];
            if (value == target) return x;
            else if (value > target) m = x - 1;
            else n = x + 1;
        }
        return n;
    }
}
