// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
    func generate(_ numRows: Int) -> [[Int]] {
        if numRows == 1 {
            return [[1]]
        }
        var output = [[Int]]()
        output.append([1])
        var numberOfRows = 0
        while numberOfRows < numRows - 1 {
            var array = [Int]()
            var previousArray = output[numberOfRows]
            array.append(1)
            for i in 0..<previousArray.count {
                var element : Int
                if i + 1 < previousArray.count {
                 element = previousArray[i] + previousArray[i+1]
                 array.append(element)
                } 
            }
            array.append(1)
            output.append(array)
            numberOfRows += 1
        }
        return output
    }