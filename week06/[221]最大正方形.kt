//在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积。 
//
// 
//
// 示例： 
//
// 
//输入：
//matrix = [["1","0","1","0","0"],
//          ["1","0","1","1","1"],
//          ["1","1","1","1","1"],
//          ["1","0","0","1","0"]]
//
//输出：4 
// Related Topics 动态规划 
// 👍 625 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        var maxSide = 0
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return maxSide
        }
        val rows: Int = matrix.size
        val columns: Int = matrix[0].size
        val dp = Array(rows) { IntArray(columns) }
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1
                    }
                    maxSide = Math.max(maxSide, dp[i][j])
                }
            }
        }
        return maxSide * maxSide
    }
}
//leetcode submit region end(Prohibit modification and deletion)
