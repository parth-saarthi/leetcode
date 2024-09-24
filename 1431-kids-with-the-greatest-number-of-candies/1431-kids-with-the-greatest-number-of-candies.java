class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li=new ArrayList<>();
               int max=0;
        for(int j=0;j<candies.length;j++){
            if(candies[j]>max)
                max=candies[j];
        }
        for(int i =0;i<candies.length;i++){
            int a=extraCandies+candies[i];
            if(a>=max){
                li.add(true);
            }
            else{
                li.add(false);
            }
        }
        return li;
    }
}
  