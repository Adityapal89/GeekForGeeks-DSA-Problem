class Solution {
    public Node insertInMiddle(Node head, int x) {
        
        Node newNode = new Node(x);

        if(head == null){
            return newNode;
        }

        int count = 0;
        Node temp = head;

        while(temp.next != null){
            count++;
            temp = temp.next;
        }

        int mid = count / 2;

        Node curr = head;

        for(int i = 0; i < mid; i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}