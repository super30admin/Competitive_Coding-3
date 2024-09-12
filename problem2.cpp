#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <iostream>
#include <map>
#include <queue>
#include <set>
#include <stack>
#include <string>
#include <unordered_set>
#include <unordered_map>
#include <vector>
using namespace std;
vector<vector<int> > pascal(int n){
    vector<vector<int> >ans;
    int i;
    for(i=0;i<n;i++){
        vector<int>v;
        if(i==0){
            v.push_back(1);
            ans.push_back(v);
            continue;
        }
        if(i==1){
            v.push_back(1);
            v.push_back(1);
            ans.push_back(v);
            continue;
        }
        for(int j=0;j<=i;j++){
            if(j==0||j==i){
                v.push_back(1);
            }
            else{
            v.push_back(ans[i-1][j]+ans[i-1][j-1]);
            }
        }
        ans.push_back(v);
    }
    return ans;
}
int main(){
   vector<vector<int> >v = pascal(4);
   for(int i=0;i<v.size();i++){
       for(int j=0;j<v[i].size();j++){
            cout<<v[i][j]<<" ";
       }
       cout<<endl;
   }
}