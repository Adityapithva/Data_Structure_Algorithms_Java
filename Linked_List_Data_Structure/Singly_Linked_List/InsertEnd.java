package Linked_List_Data_Structure.Singly_Linked_List;
public class InsertEnd {
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
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public static void main(String args[]){
        InsertEnd obj = new InsertEnd();
        obj.insertLast(11);
        obj.insertLast(8);
        obj.insertLast(1);
        obj.display();
    }
}
