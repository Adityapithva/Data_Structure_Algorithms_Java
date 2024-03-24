package Linked_List_Data_Structure.Singly_Linked_List;
public class DelLast {
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private ListNode head;
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    public static void main(String[] args) {
        DelLast obj = new DelLast();
        obj.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        obj.display();
        System.out.println(obj.deleteLast().data);
        obj.display();
    }
}
