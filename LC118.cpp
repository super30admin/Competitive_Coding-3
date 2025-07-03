// Time Complexity O(n^2)
// Space complexity O(1)
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> results;
        for (int i=1; i<=numRows; i++) {
            results.push_back(vector<int>(i, 1));
            for (int j = 1; j <= i-2; j++) {
                results[i-1][j] = results[i-2][j-1] + results[i-2][j];
            }
        }
        return results;
    }
};