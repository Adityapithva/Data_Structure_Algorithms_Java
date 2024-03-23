package Linked_List_Data_Structure.Singly_Linked_List;
public class InsertBegin {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String args[]){
        InsertBegin obj = new InsertBegin();
        obj.insertFirst(11);
        obj.insertFirst(8);
        obj.insertFirst(1);
        obj.display();
    }
}

