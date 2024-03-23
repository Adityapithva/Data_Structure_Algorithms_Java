package Linked_List_Data_Structure.Singly_Linked_List;
public class DelFirst {
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
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    public static void main(String[] args) {
        DelFirst obj = new DelFirst();
        obj.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        obj.display();
        System.out.println(obj.deleteFirst());
        
        obj.display();
    }
}
