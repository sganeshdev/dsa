package com.aws.amazon;

class Node1{
    public int data;
    public Node1 left,right;

    public Node1(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree1 {
    Node1 root1;
    public boolean hasPathSum(Node1 node,int sum){
        boolean ans = false;
        int subSum = sum - node.data;
        if(root1 == null){
            return false;
        }
        if(subSum == 0 && node.left == null && node.right == null){
            ans = Boolean.TRUE;
            return true;
        }
        if(node.left != null){
            ans = ans || hasPathSum(node.left,subSum);
        }
        if(node.right != null){
            ans = ans || hasPathSum(node.right,subSum);
        }
        return ans;

    }
    public static void main(String[] args) {
        int sum = 21;
        BinaryTree1 tree = new BinaryTree1();
        tree.root1 = new Node1(10);
        tree.root1.left = new Node1(8);
        tree.root1.right = new Node1(2);
        tree.root1.left.left = new Node1(3);
        tree.root1.left.right = new Node1(5);
        tree.root1.right.left = new Node1(2);
        if(tree.hasPathSum(tree.root1,sum)){
            System.out.println("Leaf path sum..."+sum);
        }else{
            System.out.println("No Leaf path sum..."+sum);
        }

    }
}
