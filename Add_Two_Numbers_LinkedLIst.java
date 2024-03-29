// Add Two Numbers with Linked List #2

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry=0;
        while(l1 != null || l2 != null){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum %= 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }

        if(carry == 1) temp.next = new ListNode(1);
        return ans.next;
    }
}
