class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        
        for(Integer x: nums1){
            list1.add(x);
        }
        for(int x: nums2){
            if(list1.contains(x)){
                res.add(x);
            }
        }
        int arr [] = new int [ res.size()];
        int i = 0;
        for(int x: res){
            arr[i] = x;
            i++;
        }
        return arr;
         
    }
}