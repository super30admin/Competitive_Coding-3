// TIME: O(N^2) where N = no of rows
// SPACE: O(1)
// SUCCESS on LeetCode

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int firstNum = answer.get(i-1).get(j-1);
                    int secondNum = answer.get(i-1).get(j);
                    
                    int num = firstNum + secondNum;
                    row.add(num);
                }
                
            }
            answer.add(row);
        }
        return answer;
    }
}
