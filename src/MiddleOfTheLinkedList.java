/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        ListNode res = middleOfTheLinkedList.middleNode(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        int middle = count / 2 + 1;
        int tmp = count;
        while (tmp > middle) {
            tmp--;
            head = head.next;
        }
        return count % 2 == 0 ? head != null ? head.next : null : head;
    }
}

/*
  Definition for singly-linked list.
  public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 */
