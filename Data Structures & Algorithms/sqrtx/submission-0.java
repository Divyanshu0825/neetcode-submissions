class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        int ans = -1;
        if(x == 0 || x == 1){
            return x;
        }

        while(s <= e){
            int mid = s + (e-s)/2;

            if((long) mid*mid == x){
                return mid;
            }else if((long) mid*mid > x){

                e = mid - 1;

            }else{
                
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
}