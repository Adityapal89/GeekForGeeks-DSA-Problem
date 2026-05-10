/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/

class Solution {
    public int modularNode(Node head, int k) {
        // code here
        int res = -1;
        int pos = 1;
        Node temp = head;
        while(temp != null){
            if(pos%k == 0){
                res = temp.data;
            }
            pos++;
            temp = temp.next;
        }
        return res;
    }
}