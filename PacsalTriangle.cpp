class Solution {
   // TC - O(n*n)
   // SC - O(n) 
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> result;
        vector<int> temp1(1,1);
        result.push_back(temp1);
        for(int i =2;i<=numRows;i++){
            vector<int> temp2;
            for(int j = 0;j<i;j++){
                if(j ==0) temp2.push_back(temp1[0]);
                else if(j == i-1) temp2.push_back(temp1[temp1.size()-1]);
                else{
                    temp2.push_back((temp1[j])+temp1[j-1]);
                }
            }
            result.push_back(temp2); 
            temp1 = temp2; 
        }
       return result; 
    }
};