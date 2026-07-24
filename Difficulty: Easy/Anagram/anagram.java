class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character,Integer> mp = new HashMap<>();
        if(s1.length() != s2.length()) return false;
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        
        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        
        for(int val : mp.values()){
            if(val%2 ==1) return false;
        }
        return true;
    }
}