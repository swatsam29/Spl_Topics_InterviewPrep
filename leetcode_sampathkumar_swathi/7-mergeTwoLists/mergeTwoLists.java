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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // temp-- value 0 
        //current = temp-- for transversing the mergerd list
        ListNode temp = new ListNode(0);
        ListNode current = temp; 

        while(list1 != null && list2 != null){
            //list1 value is less or equal then move to the next node 
            if(list1.val <= list2.val){
                current.next = list1; 
                list1= list1.next;
            }else{
                current.next = list2; //current node to list2
                list2= list2.next;  //moves list2 to the next node

            }
            //move to the merged list
            current= current.next;
        }

        //add the remaining nodes to the merged lists
        current.next= list1 !=null ? list1:list2;

        //return the next node as temp- merged list
        return temp.next;
        
    }
}


// Example 1: 
// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]

// Example 2:
// Input: list1 = [], list2 = []
// Output: []

// Example 3:
// Input: list1 = [], list2 = [0]
// Output: [0]