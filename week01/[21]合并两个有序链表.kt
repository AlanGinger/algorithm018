//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表 
// 👍 1342 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) {
            return l2
        }
        if (l2 == null) {
            return l1
        }
        var newListNode : ListNode? = null
        if (l1.`val` < l2.`val`) {
            newListNode = ListNode(l1.`val`)
            newListNode.next = mergeTwoLists(l2, l1.next)
        } else {
            newListNode = ListNode(l2.`val`)
            newListNode.next = mergeTwoLists(l1, l2.next)
        }
        return newListNode
    }
}
//leetcode submit region end(Prohibit modification and deletion)
