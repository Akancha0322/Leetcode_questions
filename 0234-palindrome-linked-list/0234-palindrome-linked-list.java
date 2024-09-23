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
class Solution {
    public boolean isPalindrome(ListNode head) {
        //base case
        if(head == null || head.next == null){
            return true;
        }

        //define slow and fast position
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse the last half the list
        ListNode left = head;
        ListNode right = reverse(slow);

        //check if it palindrome
        while(right != null){
            if(left.val == right.val){
                left = left.next;
                right = right.next;
            }else{
                return false;
            }
        }
         
        return true;
    }

    private ListNode reverse(ListNode head){
        //base case
        if(head == null || head.next == null){
            return head;
        }

        //reverse
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}    