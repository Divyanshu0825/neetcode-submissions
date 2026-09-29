class Solution {
    static boolean isValid(int[] nums, int k, int mid){
        int student = 1;
        int pages = 0;

        for(int i = 0; i < nums.length; i++){
            if(pages + nums[i] <= mid){
                pages += nums[i];
            }else{
                student++;
                pages = nums[i];
            }
            if(student > k){
                return false;
            }
        }
        return true;
    }


    public int splitArray(int[] nums, int k) {
        if(nums.length < k){
            return -1;
        }
        int maxVal = 0; 
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            maxVal = Math.max(maxVal, nums[i]);
        }
        int high = sum;
        int low = maxVal;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(isValid(nums, k, mid)){
                ans = mid;
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }
        }
             return ans;

    }


}
