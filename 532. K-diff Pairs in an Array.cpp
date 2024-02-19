class Solution {
public:
    /*
    Time: O(nlogn) for sorting
    Space: O(1)

    Two Pointers Approach:
    Start from i = 0th and j =  1st index.

    if their difference is smaller than k, increment j 
    if their difference is greater than k, increment i (if i and j becomes equal, increment j too) 
    if difference = k, increment both and avoid duplicates
    */
    int findPairs(vector<int>& a, int k) { 
      int i = 0, j = 1, ans = 0, n = a.size();
      sort(a.begin(), a.end());

      while(j<n){
        int diff = a[j] - a[i];
        if(diff == k){
          //cout<<i<<" "<<j<<endl;
          ans++;
          j++; i++;
          while(j<n && a[j]==a[j-1])  j++; //avoid duplicates
          while(i<j-1 && a[i]==a[i-1])  i++; //avoid duplicates
        }
        else if(diff < k){
          j++;
        }
        else{
          i++;
          if(i==j)  j++; //condition i != j
        }
      }

      return ans;
    }
};
