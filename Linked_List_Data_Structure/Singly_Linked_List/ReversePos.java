package Linked_List_Data_Structure.Singly_Linked_List;
public class ReversePos {
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
    public ListNode getFromEnd(int n){
        if(head == null){
            return null;
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while(count < n){
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    public static void main(String[] args) {
        ReversePos obj = new ReversePos();
        ReversePos.head = new ListNode(3);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(7);
        ListNode fourth = new ListNode(8);
        ReversePos.head.next = second;
        second.next = third;
        third.next = fourth;
        obj.display();
        ListNode temp =obj.getFromEnd(2);
        System.out.println(temp.data);
    }
}
