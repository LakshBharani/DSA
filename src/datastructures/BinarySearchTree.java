package datastructures;

public class BinarySearchTree {

    Node root;

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            if (newNode.value > temp.value) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (temp.value == value) return true;
            if (temp.value < value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return false;
    }

    static class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }
}
