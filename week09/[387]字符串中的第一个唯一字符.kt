//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 哈希表 字符串 
// 👍 299 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun firstUniqChar(s: String): Int {
        if (s.isEmpty()) return -1

        val map = HashMap<Char, Int>(s.length)
        // 构建哈希表：字符及其出现的频率
        for (c in s) {
            if (map[c] == null) map[c] = 0
            map[c] = map[c]!! + 1
        }
        // 找到索引
        for (i in s.indices) {
            if (map[s[i]] == 1) return i
        }
        return -1
    }
}
//leetcode submit region end(Prohibit modification and deletion)
