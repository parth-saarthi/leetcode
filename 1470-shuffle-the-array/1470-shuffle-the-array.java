class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array=new int[n*2];
        int a=0;
        int b=0;
        for(int i=0;i<2*n;i=i+2){
            array[i]=nums[a];
            array[i+1]=nums[b+n];
            a++;
            b++;
        }
        return array;
    }
}