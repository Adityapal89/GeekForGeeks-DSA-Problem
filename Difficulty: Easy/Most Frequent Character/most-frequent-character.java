class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int maxFreq = -1;
        char ans = s.charAt(0);
        for(int i=0; i<s.length(); i++){
            int count = 1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j) == s.charAt(i)) count++;
                
            }
            if(count > maxFreq){
                maxFreq = count;
                ans = s.charAt(i);
            } else if(count == maxFreq && s.charAt(i)<ans){
                ans = s.charAt(i);
            }
        }
        
        return ans;
        
    }
}