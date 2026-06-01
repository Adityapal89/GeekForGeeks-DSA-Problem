/*node class of the linked list
class Node
{
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
    public int GetNth(Node head, int index) {
        Node temp = head;
        if(temp == null) return -1;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(index > len) return -1;
        for(int i=1; i<index; i++){
            head = head.next;
        }
        return head.data;
    }
}