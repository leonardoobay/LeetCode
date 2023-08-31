class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean isDupe = false;
        HashMap hm = new HashMap();
        for(int x =0; x< nums.length; x++){
            hm.put(nums[x], x);
        }
        if(hm.size()!= nums.length){
            isDupe = true;
        }

    return isDupe;
        
    }
}