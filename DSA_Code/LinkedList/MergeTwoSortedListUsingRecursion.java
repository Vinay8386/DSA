package LL;

//21. Merge Two Sorted Lists
public class MergeTwoSortedListUsingRecursion {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

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

