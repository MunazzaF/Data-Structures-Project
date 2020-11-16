//ordered tree sort algorithm
public class OrderedTreeSort {
    static class Node {//node class
            int key;
            Node right;
            Node left;

            Node(int key) {//node method declared
                this.right = null;
                this.left = null;
                this.key = key;
            }
    }

    public Node root;

    public Node levelOrder( Node root, int i) { //root node in the levelorder algorithm
        if (root== null){
            root= new Node(i);//initialize root
            return root;
        }
        if (i < root.key) {
            root.left = levelOrder( root.left, i);//fill left node
        }
        else if (i > root.key) {
            root.right = levelOrder(root.right, i);//fill right node
        }
        return root;
    }

    public void inOrder (Node root) {//inorder algorithm method
        if (root != null) {//base case
            inOrder(root.left);//recursive function for left nodes
            System.out.print(root.key+ " ");//output keys
            inOrder(root.right);//recursive function for right nodes
        }
    }

   public void tree(int[] arr, int key){
        for (int value : arr) {
            root = levelOrder(root, value);//get the root node value in the tree
        }
    }
}



