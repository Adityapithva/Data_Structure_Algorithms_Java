package Linked_List_Data_Structure.Singly_Linked_List;
public class InsertPos {
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
    public void insertPos(int position,int value){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }
    public static void main(String[] args) {
        InsertPos obj = new InsertPos();
        obj.insertPos(1, 10);
        obj.insertPos(2, 5);
        obj.insertPos(1, 2);
        obj.insertPos(4, 8);
        obj.insertPos(3, 72);
        obj.display();
    }
}
