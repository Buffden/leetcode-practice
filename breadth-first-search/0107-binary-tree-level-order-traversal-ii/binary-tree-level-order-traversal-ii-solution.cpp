/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
     int height(TreeNode* root)
    {
        if(root==NULL)
            return 0;
        return (max(height(root->left) , height(root->right)))+1;
    }
    void solve(TreeNode* root, int d, vector<vector<int>> &v)
    {
        if(root==NULL)
            return;
        v[d].push_back(root->val);
        solve(root->left,d+1,v);
        solve(root->right,d+1,v);
        return;
    }
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        vector<vector<int>> v(height(root));
        solve(root,0,v);
        reverse(v.begin(),v.end());
        return v;
        
    }
};
