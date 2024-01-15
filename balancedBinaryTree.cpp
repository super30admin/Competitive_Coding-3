// Time Complexity : O(n) n is number of nodes in the tree
// Space Complexity : O(n) in case if tree is skewed, O(log n) if the tree is not skewed on one side
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include <iostream>
using namespace std;  

//Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
private:
    int __isBalanced(TreeNode* root, bool &flag)
    {
        if(root==nullptr)
        {
            return 0;
        }
        if(flag)
        {
            int leftHeight = __isBalanced(root->left,flag);
            int rightHeight = __isBalanced(root->right,flag);
            int height = abs(leftHeight-rightHeight);
            if(height>1)
            {
                flag = false;
                return -1;
            }
            return 1 + max(leftHeight,rightHeight);
        }
        return -1;
    }
public:
    bool isBalanced(TreeNode* root) {
        bool flag = true;
        __isBalanced(root,flag);
        return flag;
    }
};