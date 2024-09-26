//TC: O(n^2) where n is number of rows
//SC: O(1) extra space. We return an array that takes O(n^2) to compute


class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> result;
        vector<int> temp;
        temp.push_back(1);
        result.push_back(temp);
        
        for(int i=1; i<numRows; i++){
            
            vector<int> newlist;
            vector<int> prevlist = result[i-1];
            
            newlist.push_back(1);
            for(int k=1; k<i;k++){
                newlist.push_back(prevlist[k] + prevlist[k-1]);
            }
            newlist.push_back(1);
            result.push_back(newlist);
            
        }
        
        return result;
        
        
    }
};