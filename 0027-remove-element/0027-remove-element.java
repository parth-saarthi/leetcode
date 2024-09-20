// class Solution {
//     public int[] removeElement(int[] nums, int val) {
  
//         int[] arr=new int[nums.length];
//         int k=0;
//         int n=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=val){
//                 arr[k++]=nums[i];
//                 n++;
//             }
//         }
//         return n;
//         return arr;
//     }
// }
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}