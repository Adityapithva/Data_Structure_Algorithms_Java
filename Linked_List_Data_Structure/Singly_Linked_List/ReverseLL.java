package Linked_List_Data_Structure.Singly_Linked_List;
public class ReverseLL {
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private static ListNode head;
    public void display(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public ListNode reverse(ListNode head){
        //1 --> 2 --> 3 --> 4 --> 5
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public static void main(String[] args) {
        ReverseLL obj =new ReverseLL();
        ReverseLL.head = new ListNode(3);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(7);
        ListNode fourth = new ListNode(8);
        ReverseLL.head.next = second;
        second.next = third;
        third.next = fourth;
        obj.display(head);
        System.out.println();
        ListNode reverse = obj.reverse(head);
        obj.display(reverse);
    }
}
