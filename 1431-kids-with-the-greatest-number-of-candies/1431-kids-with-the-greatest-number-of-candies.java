class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum  = 0;
        for(int i  : candies ){
             if(sum<i){
                sum = i;
             }
        }
        List <Boolean> list = new ArrayList<>();
        for(int i: candies){
            if(sum > (i+extraCandies)){
                list.add(false);
            }else {
                list.add(true);
            }
        }
        return list;
    }
}