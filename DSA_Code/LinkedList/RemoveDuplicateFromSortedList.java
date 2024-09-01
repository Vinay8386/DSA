package LL;

//83. Remove Duplicates from Sorted List
public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}


