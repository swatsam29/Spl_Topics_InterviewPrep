class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode head = null;
        ListNode tail = null;
        int sum = 0;
        while (a != null || b != null) {
            sum /= 10;

            //adding the values of node at current position in both linked lists a and b
            if (a != null) {
                sum += a.val;
                a = a.next;
            }
            if (b != null) {
                sum += b.val;
                b = b.next;
            }
            ListNode node = new ListNode(sum % 10);//new node-- last digit of sum
            if (head == null) { 
                head = node;
                tail = node;
            } else {//add new node to the tail
                tail.next = node;
                tail = node;
            }
        }
        //if there are still more values- add it to the end of the result
        if (sum / 10 == 1) {
            ListNode node = new ListNode(1);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head; 
    }
}

// Example 1:
// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.

// Example 2:
// Input: l1 = [0], l2 = [0]
// Output: [0]

// Example 3:
// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1] 