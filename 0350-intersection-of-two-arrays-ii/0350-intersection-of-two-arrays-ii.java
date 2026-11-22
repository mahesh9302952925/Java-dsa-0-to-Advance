class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     HashMap<Integer, Integer> map = new HashMap<>();
     ArrayList <Integer> list = new ArrayList<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(int i = 0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                 list.add(nums2[i]);
                map.put(nums2[i] , map.get(nums2[i])-1);
            }
        }
        int [] res = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            res[i] = list.get(i);
            
        }
        return res;
    }
}