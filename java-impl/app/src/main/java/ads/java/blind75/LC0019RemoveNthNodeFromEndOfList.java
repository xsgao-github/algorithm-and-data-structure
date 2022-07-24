package ads.java.blind75;

import ads.java.leetcode.ListNode;

public class LC0019RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
             return head;
         }
         
         ListNode fast=head,slow=head;
         
         while(n!=0){
             fast=fast.next;
             n--;
         }
         
         if(fast==null){
             head=head.next;
             return head;
         }
         
         while(fast.next!=null){
             slow=slow.next;
             fast=fast.next;
         }
         
         slow.next=slow.next.next;       
         return head;
     }
}
