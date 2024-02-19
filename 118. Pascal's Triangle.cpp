class Solution {
public:
    /*
    Time: O(n*(n+1)/2) = O(n^2)
    Space: O(n*(n+1)/2) = O(n^2)
    */
    vector<vector<int>> generate(int r) {
        vector<vector<int>> v;

        v.push_back({1});

        for(int i=1;i<r;i++){
          v.push_back({});

          //first element
          v[i].push_back(1);

          //fill up intermediate values
          for(int j=0;j<i-1;j++){
            v[i].push_back(v[i-1][j] + v[i-1][j+1]);
          }

          //last element
          v[i].push_back(1);
        }

        return v;
        
    }
};
