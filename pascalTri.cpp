// Time Complexity : O(N^2)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<vector<int>> generate(int numRows) {   //numRows=5
        vector<vector<int>> answer;
        if (numRows==0)
            return answer;
        
        vector<int> temp(1,1); //first row    1
        answer.push_back(temp);
         
        if (numRows==1) //sanity check if numRows is 1
            return answer;
        
        vector<int> temp2(2,1); //second row    //1
                                                //1,1
        answer.push_back(temp2);                //1,2,1
        
         if (numRows==2) //sanity check if numRows is 2
            return answer;
        
        for (int i=2;i<numRows;i++) {
            vector<int> temp3;
            temp3.push_back(1);   // 1
            for (int j=1 ; j<i ;j++) {
                temp3.push_back(answer[i-1][j]+answer[i-1][j-1]); //1,2
            }
            temp3.push_back(1); //1,2,1
            answer.push_back(temp3); 
        }
        
        return answer;
    }
};