// Time Complexity :O(n^2) where n in the number of rows 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
        vector<int> vec;
        if(numRows  == 1){
            vec.push_back(1);
            ans.push_back(vec);
            return ans;
        }
        else if(numRows == 2){
            vec.push_back(1);
            ans.push_back(vec);
            vec.clear();
            vec.push_back(1);
            vec.push_back(1);
            ans.push_back(vec);
            return ans;
        }
        else {
            vec.push_back(1);
            ans.push_back(vec);
            vec.clear();
            vec.push_back(1);
            vec.push_back(1);
            ans.push_back(vec);
            for(int curr = 3; curr <= numRows; curr++){
                vec.clear();
                vec.push_back(1);
                for(int currIndex = 1; currIndex < curr-1; currIndex++){
                    vec.push_back(ans[curr-2][currIndex-1] + ans[curr-2][currIndex]);
                }
                vec.push_back(1);
                ans.push_back(vec);
            }
            return ans;
        }
    }
};