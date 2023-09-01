class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for(int x = 0 ; x < nums.length; x++)
        {
            int complement = target - nums[x];
            if(hMap.containsKey(complement)){
                return new int[] {hMap.get(complement), x};
            }
        hMap.put(nums[x],x);
        }

        return  new int[2];
    }
}