package medium;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode l3  = new ListNode(0);//creating a dummy start point which is not shown in output
    ListNode copy = l3; // pointer to current node;
    int carry = 0;// carry over needs to be moved to next node;
    while(l1 != null || l2 != null){
        int l1Value = (l1 == null) ? 0 : l1.val;
        int l2Value = (l2 == null) ? 0: l2.val;
        int add = l1Value + l2Value + carry;
        carry = add/10;
        add = add%10; 
        ListNode next = new ListNode(add);
        copy.next = next;
        copy = next;// moving the pointer to new copy
        if(l1!=null){
            l1 = l1.next;
           
        }
        if (l2!=null) {
            l2 = l2.next;
        }
    }
    if (carry>0){
        copy.next = new ListNode(carry);
    }
    return l3.next;
    }
}