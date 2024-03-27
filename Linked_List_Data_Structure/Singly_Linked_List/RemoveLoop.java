package Linked_List_Data_Structure.Singly_Linked_List;
public class RemoveLoop {
    private static ListNode head;
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
    public void createALoopList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
    public void startNode(){
        ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr){
                removeLoop(slowptr);
                return;
            }
        }
    }
    private void removeLoop(ListNode slowptr){
        ListNode temp = head;
        while(temp.next != slowptr.next){
            temp = temp.next;
            slowptr = slowptr.next;
        }
        slowptr.next = null;
    }
    public static void main(String[] args) {
        RemoveLoop obj = new RemoveLoop();
        obj.createALoopList();
        obj.startNode();
        obj.display();
    }
}
