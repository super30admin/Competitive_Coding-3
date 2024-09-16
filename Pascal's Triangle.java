/*
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        for i in range(numRows):
            eachRow = []
            for j in range(i+1):
                if j == 0 or j == i:
                    eachRow.append(1)
                else:
                    firstNum = result[i-1][j-1]
                    secondNum = result[i-1][j]
                    eachRow.append(firstNum + secondNum)
            result.append(eachRow)
        
        return result
*/
// time - O(n^2) where n is no of rows given 
// space - O(1) as we are not creating new space
// Logic - I have inside for loop which goes until each i and everytime calculate the number from above column same row and one row before

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i=0; i < numRows; i++){
            List<Integer> eachRow = new ArrayList<>();
            for (int j=0; j <= i; j++){
                if (j ==0 || j == i){
                    eachRow.add(1);
                }
                else{
                    int first = result.get(i-1).get(j-1);
                    int second = result.get(i-1).get(j);
                    eachRow.add(first+second);
                }
            }
            result.add(eachRow);
        }
        
        return result;
    }
}