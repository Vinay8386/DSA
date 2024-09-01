package LL;

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
        //create a new listNode object with a value of 0 and assigns it to the variable mergeList
        ListNode mergeList=new ListNode(0);
        //creates a new reference variable currentValue and assigns it to point to the same ListNode object that mergeList is pointing to.
        ListNode currentValue=mergeList;

        //check if any list is null or not
        while(list1!=null && list2!=null){ //none of the list is null
            //check a smaller element from both list and put it n merge list
            if(list1.val<=list2.val){
                currentValue.next=list1;
                list1=list1.next;
            }else{
                currentValue.next=list2;
                list2=list2.next;
            }
            currentValue=currentValue.next;
        }
        if(list1!=null){ //Second list is null
            currentValue.next=list1;
        }
        if(list2!=null){ //First list is null
            currentValue.next=list2;
        }
        return mergeList.next;
    }
}

