package com.ruanshengwei.leetcode.AddTwoNumbers2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        while (l1!=null||l2!=null||carry!=0){
            ListNode cur = new ListNode(0);
            int sum = ((l1!=null) ? l1.val:0)+((l2!=null) ? l2.val:0)+carry;
            carry =sum/10;
            sum = sum%10;
            cur.val = sum;
            prev.next =cur;
            prev = cur;

            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }

        return head.next;
    }
}
