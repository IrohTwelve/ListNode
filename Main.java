
public class Main {

    public static void main(String[] args) {

        int[] defaultListOne = {2, 4, 3};
        int[] defaultListTwo = {5, 6, 4};

        ListNode listNodeOne = createList(defaultListOne);
        ListNode listNodeTwo = createList(defaultListTwo);

        addTwoNumbers(listNodeOne, listNodeTwo);
    }

    public static ListNode createList(int defaultInput[]) {

        ListNode head = new ListNode(defaultInput[0]);
        ListNode count = head;

        for (int i = 0; i < defaultInput.length; i++) {
            count.next = new ListNode(defaultInput[i]);
            count = count.next;
        }

        count.next = null;
        return head;
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int ostatok = 0;
        ListNode head = new ListNode(0);
        ListNode result = head;

        while (l1 != null || l2 != null || ostatok > 0) {
            int val3 = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + ostatok;

            result.next = new ListNode(val3 % 10);
            ostatok = val3 / 10;
            l1 = (l1 == null ? l1 : l1.next);
            l2 = (l2 == null ? l2 : l2.next);
            result = result.next;
        }
        return head.next;
    }
}

