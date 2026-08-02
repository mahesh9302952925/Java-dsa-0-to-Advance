class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        int s = 0;
        if(x<2){
            return x;
        }
        while(low<=high){
            int mid  = low+(high - low)/2;
            if(mid==x/mid){
                return mid;
            }else if(mid<x/mid){
                s= mid;
                low  = mid+1;

            }else {
                high = mid-1;
            }
        }
        return s;
    }
}