//Time Complexity = O(n*2)
//Space Complexity = O(n*2)
public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        int[][] arr = new int[numRows][]; // Create an array with numRows outer elements

        for (int i = 0; i < numRows; i++)
        {
            arr[i] = new int[numRows]; // Initialize each inner array
        }
        IList<IList<int>> result = new List<IList<int>>();
        IList<int> innerList = new List<int>();
        int m = numRows;
        if(numRows<=0)
        {
            return result;
        }
        innerList.Add(1);
        result.Add(innerList);
        if (numRows ==1)
        {
            return result;
        }
        
        for(int i=1; i< m; i++)
        {
            innerList = new List<int>();
            int n = i+1;
            arr[i][0]=1;
            innerList.Add(arr[i][0]);
            arr[i][n-1] = 1;
            
            for(int j = 1;j<n-1;j++)
            {
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                innerList.Add(arr[i][j]);
            }
            innerList.Add(arr[i][n-1]);
            result.Add(innerList);
        }
        return result;
    }
}
