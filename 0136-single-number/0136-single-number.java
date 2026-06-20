class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result=0;
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }
}