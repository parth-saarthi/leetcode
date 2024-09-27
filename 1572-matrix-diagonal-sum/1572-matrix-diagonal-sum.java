class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int mid=n/2;
        for(int i=0;i<n;i++){
            sum+=mat[i][i]+mat[i][n-i-1];
        }
        if(n%2==1){
            sum=sum-mat[mid][mid];
        }
        return sum;
    }
}