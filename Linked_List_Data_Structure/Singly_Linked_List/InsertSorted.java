package Linked_List_Data_Structure.Singly_Linked_List;
public class InsertSorted {
    public static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private static ListNode head;
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public ListNode insertSorted(int n){
        ListNode newNode = new ListNode(n);
        if(head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        InsertSorted obj = new InsertSorted();
        InsertSorted.head = new ListNode(1);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(16);
        InsertSorted.head.next = second;
        second.next = third;
        third.next = fourth;
        obj.display();
        obj.insertSorted(11);
        System.out.println();
        obj.display();
        System.out.println();
        obj.insertSorted(5);
        obj.display();
    }
}
