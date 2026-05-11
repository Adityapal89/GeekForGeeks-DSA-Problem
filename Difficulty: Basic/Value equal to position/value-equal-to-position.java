class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer> st = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == i+1){
                st.add(arr[i]);
            }
        }
        return st;
    }
}
