package Module_12;
class NodeA {
    int data;
    NodeA left, right;

    NodeA(int data) {
        this.data = data;
    }
}

public class PreorderTraversal {
    NodeA root;

    void preorder(NodeA node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void main(String[] args) {
        PreorderTraversal t = new PreorderTraversal();
        t.root = new NodeA(1);
        t.root.left = new NodeA(2);
        t.root.right = new NodeA(3);

        t.preorder(t.root);
    }
}


