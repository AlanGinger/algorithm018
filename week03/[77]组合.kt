    import java.util.*


//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
//
// 示例: 
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
// Related Topics 回溯算法 
// 👍 433 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        val array = IntArray(n)
        for (i in 0 until n) {
            array[i] = i + 1
        }
        backTrack(array, result, mutableListOf(), 0, k)
        return result
    }

    private fun backTrack(
        array: IntArray,
        result: MutableList<MutableList<Int>>,
        cur: MutableList<Int>,
        first: Int,
        k: Int
    ) {
        if (cur.size == k) {
            result.add(ArrayList(cur))
            return
        }
        for (i in first until array.size) {
            cur.add(array[i])
            backTrack(array, result, cur, i + 1, k)
            cur.removeAt(cur.size - 1)
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
