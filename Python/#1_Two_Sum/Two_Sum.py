"""
    Title: Two Sum

    Difficulty: Easy

    https://leetcode.com/problems/two-sum/description/

    Python Version: 3.12

    Problem Description:

        Given an array of integers nums and an integer target,
            -> return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution,
            -> and you may not use the same element twice.

        You can return the answer in any order.

        Follow-up:
            Can you come up with an algorithm that is less than O(n^2) time complexity?
"""


# Time complexity : O(N * N-1) = O(N^2)
def twoSum(nums=[0], target=0):
    for num in nums:
        for i in range(nums.index(num) + 1, len(nums)):
            if num + nums[i] == target:
                return [nums.index(num), i]
    return []


# Time complexity: O(N + N) = O(2N) = O(N)
# TODO: Come back to after rest - Time of writing - 23:33
def twoSum_followUp(nums=[0], target=0):
    for i in range(len(nums) - 1):
        if nums[i] + nums[i + 1] == target:
            return [i, i + 1]

    for num in nums:
        if num + nums[nums.index(num) - 2] == target:
            return [nums.index(num), nums.index(num) - 2]
    return []


if __name__ == '__main__':
    print('-> twoSum')
    print(f'Result: {twoSum([2, 7, 11, 15], 9)}')
    print(f'Result: {twoSum([3, 2, 4], 6)}')
    print(f'Result: {twoSum([3, 3], 6)}')
    print(f'Result: {twoSum([11, 5, 6, 8, 3], 9)}')
    print(f'Result: {twoSum([9, 5, 100, 7, 3, 8, 33], 77)}')

    print('\n-> twoSum_followUp')
    print(f'Result: {twoSum_followUp([2, 7, 11, 15], 9)}')
    print(f'Result: {twoSum_followUp([3, 2, 4], 6)}')
    print(f'Result: {twoSum_followUp([3, 3], 6)}')
    print(f'Result: {twoSum_followUp([11, 5, 6, 8, 3], 9)}')
    print(f'Result: {twoSum_followUp([9, 5, 100, 7, 3, 8, 33], 77)}')
