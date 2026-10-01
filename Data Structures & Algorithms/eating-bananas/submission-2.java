class Solution {
    static boolean isValid(int[] piles, int h, int mid){
        long hours = 0;
        for(int i = 0; i < piles.length; i++){
            hours += (piles[i] + mid - 1)/mid;
            if(hours > h){
                return false; 
            }
        } 
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(pile, high);
        }

        int answer = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(isValid(piles, h, mid)){
                answer = mid;
                high = mid - 1;
            }else{
                low = mid + 1; 
            }
        }
        return answer;
    }
}
