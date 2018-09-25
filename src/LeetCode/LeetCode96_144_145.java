package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 树的前中后序遍历
 */
public class LeetCode96_144_145 {


    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        inorderTraversal(root, res);
        return res;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list){
        if(node != null){
            inorderTraversal(node.left, list);
            list.add(node.val);
            inorderTraversal(node.right, list);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        preorderTraversal(root, res);
        return res;
    }

    private void preorderTraversal(TreeNode node, List<Integer> list){
        if(node != null){
            list.add(node.val);
            preorderTraversal(node.left, list);
            preorderTraversal(node.right, list);
        }
    }


    public List<Integer> postorderTraversal(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        postorderTraversal(root, res);
        return res;
    }

    private void postorderTraversal(TreeNode node, List<Integer> list){
        if(node != null){
            postorderTraversal(node.left, list);
            postorderTraversal(node.right, list);
            list.add(node.val);
        }
    }

    //----------------------非递归版

    private class Command{
        String s;   // go, print
        TreeNode node;
        Command(String s, TreeNode node){
            this.s = s;
            this.node = node;
        }
    };

    public List<Integer> inorderTraversal2(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;

        Stack<Command> stack = new Stack<Command>();
        stack.push(new Command("go", root));
        while(!stack.empty()){
            Command command = stack.pop();
            if(command.s.equals("print"))
                res.add(command.node.val);
            else{
                assert command.s.equals("go");
                if(command.node.right != null)
                    stack.push(new Command("go",command.node.right));
                stack.push(new Command("print", command.node));
                if(command.node.left != null)
                    stack.push(new Command("go",command.node.left));
            }
        }
        return res;
    }
}
