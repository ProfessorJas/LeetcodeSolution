public class solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            int digit = sum % 10;

            res.next = new ListNode(digit);
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            int digit = sum % 10;

            res.next = new ListNode(digit);
            res = res.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            int digit = sum % 10;

            res.next = new ListNode(digit);
            res = res.next;
            l2 = l2.next;
        }

        if (carry != 0) {
            res.next = new ListNode(1);
            res = res.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}