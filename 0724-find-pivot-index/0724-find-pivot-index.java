class Solution {
    public static int sum (int [] nums, int low , int high ){
      int sum  = 0; 
      if(low> high){
        return 0;
      } 
      for(int i = low; i<=high ; i++){
        sum = sum + nums[i];
      }
      return sum;
    }
    public int pivotIndex(int[] nums) {
        
        int high= nums.length-1;
        for(int i = 0; i < nums.length; i++){
            int left= sum(nums, 0, i-1);
            int right = sum(nums, i+1, high);
            if(left == right ){
                return i;
            }
        }
        return -1;
    }
}
