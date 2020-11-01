import java.util.*


//给定一个 N 叉树，返回其节点值的前序遍历。
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 112 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun preorder(root: Node?): List<Int> {
        val stack: LinkedList<Node> = LinkedList<Node>()
        val output = LinkedList<Int>()
        if (root == null) {
            return output
        }
        stack.add(root)
        while (!stack.isEmpty()) {
            val node: Node = stack.pollLast()
            output.add(node.`val`)
            Collections.reverse(node.children)
            for (item in node.children) {
                stack.add(item!!)
            }
        }
        return output
    }
}
//leetcode submit region end(Prohibit modification and deletion)
