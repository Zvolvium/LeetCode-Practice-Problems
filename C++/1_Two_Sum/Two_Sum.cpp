/*
 *
*/
#include <iostream>
#include <vector>

std::vector<int> twoSum (std::vector<int>& nums, int target){
    std::vector<int> result = {-1, -1};

    for(const int &i : nums){
        for(const int &j : nums){
            if((i + j == target) && (&i != &j)){
                auto it1 = find(nums.begin(), nums.end(), i);
                auto it2 = find(nums.begin(), nums.end(), j);
                if(it1 == it2) it2 = find(++it2, nums.end(), j);

                result[0] = it1 - nums.begin();
                result[1] = it2 - nums.begin();
                return result;
            }
        }
    }
    return result;
}

// TODO: Do follow up tomorrow.
std::vector<int> twoSum_followUp (std::vector<int>& nums, int target){
    std::vector<int> result = {-1, -1};
    return result;
}

int main() {
    std::vector<int> in1 = {2, 7, 11, 15};
    std::vector<int> in2 = {3, 2, 4};
    std::vector<int> in3 = {3, 3};
    std::vector<int> in4 = {11, 5, 6, 8, 3};
    std::vector<int> in5 = {9, 5, 100, 7, 3, 8, 33};
    std::vector<int> r;

    printf("\n-> twoSum\n");
    r = twoSum(in1, 9);
    printf("Result: %d, %d\n", r[0], r[1]);

    r = twoSum(in2, 6);
    printf("Result: %d, %d\n", r[0], r[1]);

    r = twoSum(in3, 6);
    printf("Result: %d, %d\n", r[0], r[1]);

    r = twoSum(in4, 9);
    printf("Result: %d, %d\n", r[0], r[1]);

    r = twoSum(in5, 77);
    printf("Result: %d, %d\n", r[0], r[1]);

    printf("\n-> twoSum_followUp\n");
    r = twoSum_followUp(in1, 9);
    printf("Result: %d, %d\n", r[0], r[1]);

    r = twoSum_followUp(in2, 6);
    printf("Result: %d, %d\n", r[0], r[1]);

    r = twoSum_followUp(in3, 6);
    printf("Result: %d, %d\n", r[0], r[1]);

    r = twoSum_followUp(in4, 9);
    printf("Result: %d, %d\n", r[0], r[1]);

    r = twoSum_followUp(in5, 77);
    printf("Result: %d, %d\n", r[0], r[1]);
    return 0;
}
