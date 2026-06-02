/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // int len = 0;
        // Node temp = head;
        // while(temp != null){
        //     len++;
        //     temp = temp.next;
        // }
        // int mid = len/2;
        // for(int i=0; i<mid-1; i++){
            
        // }
        
        
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}