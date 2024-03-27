package Linked_List_Data_Structure.Singly_Linked_List;
public class DetectLoop {
    public static class ListNode{
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
    public boolean containsLoop(){
        ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr){
                return true;
            }
        }
        return false;
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
        // sixth.next = third;
    }
    public static void main(String[] args) {
        DetectLoop obj = new DetectLoop();
        obj.createALoopList();
        System.out.println(obj.containsLoop());
    }
}
