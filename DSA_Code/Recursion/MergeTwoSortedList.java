package Recursion;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        // Create nodes for list1
        ListNode list1Node1 = new ListNode(1);
        ListNode list1Node2 = new ListNode(3);
        ListNode list1Node3 = new ListNode(5);

        // Link nodes together for list1
        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;

        // Create nodes for list2
        ListNode list2Node1 = new ListNode(2);
        ListNode list2Node2 = new ListNode(4);
        ListNode list2Node3 = new ListNode(6);

        // Link nodes together for list2
        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;

        // Example of printing the values in list1
        System.out.println("Values in list1:");
        ListNode current = list1Node1;
        while (current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
        System.out.println();

        // Example of printing the values in list2
        System.out.println("Values in list2:");
        current = list2Node1;
        while (current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
        System.out.println();

        // Example of printing the values in mergeList
        System.out.println("Values in mergeList");
        current = mergeTwoLists(list1Node1,list2Node1);
        while (current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Base condition
        if(list1==null) return list2;
        if(list2==null) return list1;
        // Choose smaller value from list1 and list2
        if(list1.val<=list2.val){
            // Recur for remaining elements in list1 and update next pointer
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            // Recur for remaining elements in list2 and update next pointer
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
