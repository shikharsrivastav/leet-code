package tic.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,2};
        Solution solution = new Solution();
        int size = solution.removeDuplicates(nums);
        System.out.println("Size: " + size);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution {
    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        int insertionIndex = 1;
        int currentInt = nums[0];
        for (int i=0; i<nums.length; i++){
            if (nums[i] != currentInt){
                currentInt = nums[i];
                swap(nums, i, insertionIndex++);
            }
        }
        return insertionIndex;
    }
}