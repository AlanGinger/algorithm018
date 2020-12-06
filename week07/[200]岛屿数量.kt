//给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。 
//
// 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。 
//
// 此外，你可以假设该网格的四条边均被水包围。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 300 
// grid[i][j] 的值为 '0' 或 '1' 
// 
// Related Topics 深度优先搜索 广度优先搜索 并查集 
// 👍 888 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty() || grid[0].isEmpty()) {
            return 0
        }

        var result = 0

        // 偏移量数组
        val directions =
            arrayOf(intArrayOf(-1, 0), intArrayOf(0, -1), intArrayOf(0, 1), intArrayOf(1, 0))

        // 边界检查
        fun checkBound(row: Int, column: Int): Boolean {
            return (row in grid.indices) and (column in grid[0].indices)
        }

        fun backtrack(row: Int, column: Int) {
            for (direction in directions) {
                val newRow = row + direction[0]
                val newColumn = column + direction[1]
                if (checkBound(newRow, newColumn) && '1' == grid[newRow][newColumn]) {
                    // 选择
                    grid[newRow][newColumn] = '0'
                    // 递归
                    backtrack(newRow, newColumn)
                    // 注意：这里没必要回溯
                }
            }
        }

        for (row in grid.indices) {
            for (column in grid[0].indices) {
                if ('1' == grid[row][column]) {
                    result++
                    backtrack(row, column)
                }
            }
        }

        return result
    }
}
//leetcode submit region end(Prohibit modification and deletion)
