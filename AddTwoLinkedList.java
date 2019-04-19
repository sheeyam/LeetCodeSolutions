/*PROBLEM STATEMENT
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode fakeNode = new ListNode(0);
        ListNode finalList = fakeNode;
        
        int carry = 0;  
        
        while (list1 != null || list2 != null){
            int sum = carry;
            
            if(list1 != null) {
                sum += list1.val;
                list1 = list1.next;
            }
            
            if(list2 != null) {
                sum += list2.val;
                list2 = list2.next;
            }
            
            if(sum > 9){
                carry = 1;
                sum = sum - 10;
            } else {
                carry = 0;
            }
            
            finalList.next = new ListNode(sum);
            finalList = finalList.next;
        }
        
        if(carry > 0){
            finalList.next = new ListNode(carry);
        }
        return fakeNode.next;
    }
}
