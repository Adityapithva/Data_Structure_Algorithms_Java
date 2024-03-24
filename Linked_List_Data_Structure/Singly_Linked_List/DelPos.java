package Linked_List_Data_Structure.Singly_Linked_List;
public class DelPos {
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
    public void deletePos(int position){
        if(position == 1){
            head = head.next;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < count - 1){
                previous = previous.next;
                count++;
            }
            ListNode temp = previous.next;
            previous.next = temp.next;
        }
    }
    public static void main(String[] args) {
        DelPos obj = new DelPos();
        obj.head = new ListNode(3);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(7);
        ListNode fourth = new ListNode(8);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        obj.display();
        obj.deletePos(2);
        obj.display();
    }
}
