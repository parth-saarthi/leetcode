class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int p=nums2.length;
        int k=0;
        int[] arr=new int[m+p];
        for(int i=0;i<m;i++){
            arr[k++]=nums1[i];
        }
        for(int j=0;j<p;j++){
            arr[k++]=nums2[j];
        }
        int temp=0;
        int n=arr.length;
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){ 
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                 }  
         } 
        
       if (n % 2 == 1){
            return arr[n / 2];
        }
        else{
        return (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        }
        
    }
}