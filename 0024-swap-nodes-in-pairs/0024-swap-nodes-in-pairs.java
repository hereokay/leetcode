

class Solution {

    public ListNode swapPairs(ListNode head){

        ListNode current = head;

        ListNode prev = new ListNode(0);
        prev.next = current;

        ListNode archive = prev;
        while (current != null && current.next != null) {
            ListNode first = current;
            ListNode second = current.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            // 다음 라운드 준비
            prev = first;
            current = current.next;
        }
        return archive.next;
    }
}