/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listen;

/**
 *
 * @author v990461
 */
public class BinaryTree {

    private BinaryTreeNode root;

    public BinaryTree() {
    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public void printPreorder() {
        // start with root
        printPreorder(root);
    }

    private void printPreorder(BinaryTreeNode tn) {
// base case: empty subtree
        if (tn == null) {
            return;
        }
// visit current node
        System.out.print(tn.getEntry() + " ");
// visit left child
        printPreorder(tn.getLeftChild());
// visit right child
        printPreorder(tn.getRightChild());
    }

    public void printInorder() {
        // start with root
        printInorder(root);
    }

    private void printInorder(BinaryTreeNode tn) {
        if (tn == null) {
            return;
        }
        // visit left child
        printInorder(tn.getLeftChild());
        // visit current node
        System.out.print(tn.getEntry() + " ");
        // visit right child
        printInorder(tn.getRightChild());

    }

    public void printPostorder() {
        // start with root
        printInorder(root);
    }

    private void printPostorder(BinaryTreeNode tn) {
        if (tn == null) {
            return;
        }
        // visit left child
        printPostorder(tn.getLeftChild());
        // visit right child
        printPostorder(tn.getRightChild());
        // visit current node
        System.out.print(tn.getEntry() + " ");
    }
}
