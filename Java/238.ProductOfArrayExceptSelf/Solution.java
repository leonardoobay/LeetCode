class Solution {

    public int[] productExceptSelf(int[] nums) {

        // int arrLength = nums.length;
          int[] answer = new int [nums.length]; 
        // int posToIgnore = 0;  
        // int prodNumber = 1;
        for (int ignoreIndex =0;ignoreIndex<nums.length;ignoreIndex++){
            int ogIndexValue = nums[ignoreIndex];
            answer[ignoreIndex] = 1;
            nums[ignoreIndex] = 1;
            for (int x : nums){
            answer[ignoreIndex] *=x;
            }
            // prodArray[ignoreIndex] =nums[ignoreIndex];
            nums[ignoreIndex] = ogIndexValue;
        }

        return answer;
    }
}