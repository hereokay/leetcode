class Solution {
    public ListNode swapPairs(ListNode head) {

        // 종료조건
        if (head == null || head.next == null){
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;

        first.next = swapPairs(head.next.next);
        second.next = first;

        return second;
    }
}