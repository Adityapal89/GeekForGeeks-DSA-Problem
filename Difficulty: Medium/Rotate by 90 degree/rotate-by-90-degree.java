class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length; 
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            int left = 0;
            int right = n-1;
            while(left < right){
                int temp = mat[left][i];
                mat[left][i] = mat[right][i];
                mat[right][i] = temp;

                left++;
                right--;
            }
        }
    }
}