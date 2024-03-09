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

import java.util.HashMap;

public class Two_Sum {

    // Time complexity : O(N^2)
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

    // Time Complexity : O(N)
    private static int[] twoSum_followUp (int[] nums, int target){
        int[] result = {-1, -1};
        HashMap<Integer, Integer> Map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            Map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int key = target - nums[i];
            if(Map.containsKey(key) && (i != Map.get(key))){
                result[0] = i;
                result[1] = Map.get(key);
                return result;
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

        System.out.println("\n-> twoSum");
        r = twoSum(in1, 9);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum(in2, 6);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum(in3, 6);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum(in4, 9);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum(in5, 77);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        System.out.println("\n-> twoSum_followUp");
        r = twoSum_followUp(in1, 9);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum_followUp(in2, 6);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum_followUp(in3, 6);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum_followUp(in4, 9);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));

        r = twoSum_followUp(in5, 77);
        System.out.print(String.format("Result: %d, %d\n", r[0], r[1]));
    }
}
