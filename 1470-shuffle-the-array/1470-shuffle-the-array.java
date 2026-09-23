class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [ ] arr = new int [2*n];
        int f = 0;
        int s = n;
        for(int i = 0; i<n*2; i++){
            arr[i] = nums[f];
            arr[i+1] = nums[s];
            f++;
            s++;
            i++;
        }
        return arr;
    }
}