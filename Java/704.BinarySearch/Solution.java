class Solution {
    public int search(int[] nums, int target) {
        int targetIndex = -1;
        int p = 0;
        int r = nums.length -1;
        int midpoint =  (p+r) / 2;

        while (p <= r)
        {
            if (nums[midpoint] == target ){
                targetIndex = midpoint;
                return midpoint;
            }
            else if(nums[midpoint] > target){
                r = midpoint-1;
                midpoint = (p+r)/ 2;
            }
            else if(nums[midpoint] < target){
                p = midpoint+1;
                midpoint = (p+r)/ 2;
            }

        }
        return  targetIndex;
        
    }
}