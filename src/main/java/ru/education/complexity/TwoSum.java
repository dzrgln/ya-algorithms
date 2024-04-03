package ru.education.complexity;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">Условие</a>
 *  Время работы O(n)
 *  Сложность по памяти О(n)
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int a = target - nums[i];
            if (numMap.containsKey(a)) {
                return new int[]{numMap.get(a), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
