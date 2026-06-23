class Solution {

    static void checkString(String s) {
        int v = 0;
        int c = 0;
        String vo = "a,i,o,u,e";
        for(int i=0; i<s.length(); i++){
            char f = s.charAt(i);
            if(f == 'a' || f == 'i' || f == 'o' || f == 'u' || f == 'e'){
                v++;
            } else{
                c++;
            }
        }
        if(v > c){
            System.out.println("Yes");
        } else if(v < c){
            System.out.println("No");
        } else{
            System.out.println("Same");
        }
    }
}