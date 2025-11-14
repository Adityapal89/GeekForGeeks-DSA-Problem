
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        int st = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            while(sum > target && st <= i){
                sum -= arr[st];
                st++;
            }
            if(sum == target){
                res.add(st+1);
                res.add(i+1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}
