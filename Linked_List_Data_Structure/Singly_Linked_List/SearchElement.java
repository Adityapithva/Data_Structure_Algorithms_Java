package Linked_List_Data_Structure.Singly_Linked_List;
public class SearchElement {
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
    public boolean find(ListNode head,int searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        SearchElement obj = new SearchElement();
        obj.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(11);
        ListNode fourth = new ListNode(1);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        obj.display();
        if(obj.find(second, 1)){
            System.out.println("Search Key found !!!");
        }else{
            System.out.println("Search Key not found !!!");
        }
    }
}
