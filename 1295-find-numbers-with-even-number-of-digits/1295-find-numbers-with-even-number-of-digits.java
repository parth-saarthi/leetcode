class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                sum=sum+1;
                nums[i]=nums[i]/10;
            }
            if(sum%2==0){
            result++;
        }
        }
        return result;
    }
}