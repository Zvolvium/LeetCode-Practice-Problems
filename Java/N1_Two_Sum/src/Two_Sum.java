/*
    Title: Two Sum

    Difficulty: Easy

    https://leetcode.com/problems/two-sum/description/

    Java Version: JDK-21

    Problem Description:

        Given an array of integers nums and an integer target,
            -> return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution,
            -> and you may not use the same element twice.

        You can return the answer in any order.

        Follow-up:
            Can you come up with an algorithm that is less than O(n^2) time complexity?
*/

public class Two_Sum {

    private static int[] twoSum (int[] nums, int target){
        int[] result = {-1, -1};

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main (String[] args){
        int[] in1 = {2, 7, 11, 15};
        int[] in2 = {3, 2, 4};
        int[] in3 = {3, 3};
        int[] in4 = {11, 5, 6, 8, 3};
        int[] in5 = {9, 5, 100, 7, 3, 8, 33};
        int[] r;

        r = twoSum(in1, 9);
        System.out.println("-> twoSum");
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum(in2, 6);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum(in3, 6);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum(in4, 9);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum(in5, 77);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));
    }
}
