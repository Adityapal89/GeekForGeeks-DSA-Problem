class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<i; j++){
                swap(mat, i, j);
            }
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < mat[0].length; j++) {
                row.add(mat[i][j]);
            }

            ans.add(row);
        }
        return ans;
        
        
    }
    
    public static void swap(int[][] mat, int i, int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}