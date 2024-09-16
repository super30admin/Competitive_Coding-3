//Time Complexity- O(numRow^2)
//Space Complexity- O(1)

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> ans;
        if(numRows==0){
            return ans;
        }
        ans.push_back({1});
        
        if(numRows==1){
            return ans;
        }
        ans.push_back({1,1});
        if(numRows==2){
            return ans;
        }
        
        vector<int> curr=ans[1];
        for(int i=3;i<=numRows;i++){
            vector<int> temp(i,1);
            for(int j=1;j<i-1;j++){
                temp[j]=curr[j-1]+curr[j];
            }
            ans.push_back(temp);
            curr=temp;
        }
        return ans;
    }
};