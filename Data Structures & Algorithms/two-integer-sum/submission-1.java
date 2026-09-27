class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < n; i++){
            int complement = target - nums[i];

            if(seen.containsKey(complement)){
                int prevIndex = seen.get(complement);
                return new int[]{prevIndex, i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}
