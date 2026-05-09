class Solution {
    public boolean isEven(Node head) {
        // code here
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count %2 == 0){
            return true;
        } else{
            return false;
        }
    }
}