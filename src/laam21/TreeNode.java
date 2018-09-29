/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laam21;

import java.util.LinkedList;

/**
 *
 * @author kien vu
 */
public class TreeNode {

    int data;
    TreeNode leftNode, rightNode;

    public TreeNode(int data) {
        this.data = data;
        leftNode = rightNode = null;
    }

    void insertNode(int value) {
        if (value < data) {
            if (leftNode == null) {
                leftNode = new TreeNode(value);
            } else {
                leftNode.insertNode(value);
            }
        } else {
            if (rightNode == null) {
                rightNode = new TreeNode(value);
            } else {
                rightNode.insertNode(value);
            }
        }
    }

    void printTree() {
        LinkedList<TreeNode> ll = new LinkedList();
        ll.addFirst(this);
        while (!ll.isEmpty()) {
            TreeNode tn = ll.removeFirst();
            System.out.println(tn.data);
            if (leftNode != null) {
                ll.addFirst(tn.leftNode);
            }
            if (rightNode != null) {
                ll.addFirst(tn.rightNode);
            }
        }
    }

    static void searchTree(TreeNode root, int key) {
        boolean search = false;
        if (root.data == key) {
            search = true;
        } else if (root.data > key) {
            searchTree(root.rightNode, key);
        } else {
            searchTree(root.leftNode, key);
        }
        if (search) {
            System.out.println("Tim thay");
        } else {
            System.out.println("Khong tim thay");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.insertNode(15);
        root.insertNode(30);
        root.insertNode(47);
        root.insertNode(69);
        root.insertNode(45);
        root.insertNode(33);
//        searchTree(root, 15);
        root.printTree();
    }
}
