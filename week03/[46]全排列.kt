import java.util.*


//给定一个 没有重复 数字的序列，返回其所有可能的全排列。
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法 
// 👍 983 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun permute(nums: IntArray): MutableList<List<Int?>?> {
        val res: MutableList<List<Int?>?> = ArrayList()

        val output: MutableList<Int?> = ArrayList()
        for (num in nums) {
            output.add(num)
        }

        val n: Int = nums.size
        backtrack(n, output, res, 0)
        return res
    }

    fun backtrack(n: Int, output: List<Int?>?, res: MutableList<List<Int?>?>, first: Int) {
        if (first == n) {
            res.add(ArrayList(output))
        }
        for (i in first until n) {
            Collections.swap(output, first, i)
            backtrack(n, output, res, first + 1)
            Collections.swap(output, first, i)
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
