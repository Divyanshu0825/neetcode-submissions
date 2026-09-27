class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < n; i++){
            int complement = target - nums[i];

            if(seen.containsKey(complement)){
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}
