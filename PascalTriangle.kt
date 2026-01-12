//For Pascal's Triangle problem, The Solution involves by adding the first and last elements of each row as 1. For other elements, we add the two elements directly above it from the previous row to get the current element.
// Time complexity of this solution is O(numRows^2) as we are using nested loops to generate the triangle.
// Space complexity is also O(numRows^2).
class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val pascalList = mutableListOf<MutableList<Int>>()
        var i = 0

        if (numRows == 0) {
            return pascalList
        } else if (numRows == 1) {
            pascalList.add(mutableListOf(1))
        } else {
            pascalList.add(mutableListOf(1))
            while (i < numRows - 1) {
                var j = 0
                val size = pascalList[i].size
                val newRow = mutableListOf<Int>()

                newRow.add(1)
                while (j + 1 != size) {
                    newRow.add(pascalList[i][j] + pascalList[i][j + 1])
                    j++
                }
                newRow.add(1)

                pascalList.add(newRow)
                i++
            }
        }

        return pascalList
    }
}