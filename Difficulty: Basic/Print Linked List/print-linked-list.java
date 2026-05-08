/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        ArrayList<Integer> st = new ArrayList<>();
        while( head != null){
            st.add(head.data);
            head = head.next;
        }
        return st;
    }
}