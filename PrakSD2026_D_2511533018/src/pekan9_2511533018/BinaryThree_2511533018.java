package pekan9_2511533018;

public class BinaryThree_2511533018 {
    private Node_2511533018 root_3018;
    private Node_2511533018 currentNode_3018;

    public BinaryThree_2511533018() {
        this.root_3018 = null;
    }

    public boolean search_2511533018(int data_3018) {
        assert this.root_3018 != null : "Root NULL.";
        return search_2511533018(root_3018, data_3018);
    }

    private boolean search_2511533018(Node_2511533018 node_3018, int data_3018) {
        if (node_3018.getData_2511533018() == data_3018) return true;

        if (node_3018.getLeft_2511533018() != null)
            return search_2511533018(node_3018.getLeft_2511533018(), data_3018);

        if (node_3018.getRight_2511533018() != null)
            return search_2511533018(node_3018.getRight_2511533018(), data_3018);

        return false;
    }

    public void printInOrder_2511533018() {
        assert this.root_3018 != null : "Root NULL.";
        this.root_3018.printInOrder_2511533018(root_3018);
    }

    public void printPreOrder_2511533018() {
        assert this.root_3018 != null : "Root NULL.";
        this.root_3018.printPreOrder_2511533018(root_3018);
    }

    public void printPostOrder_2511533018() {
        assert this.root_3018 != null : "Root NULL.";
        this.root_3018.printPostOrder_2511533018(root_3018);
    }

    public Node_2511533018 getRoot_2511533018() {
        return this.root_3018;
    }

    public boolean isEmpty_2511533018() {
        return this.root_3018 == null;
    }

    public int countNodes_2511533018() {
        return this.countNodes_2511533018(root_3018);
    }

    private int countNodes_2511533018(Node_2511533018 node_3018) {
        int count_3018 = 1;
        if (node_3018 == null) {
            return 0;
        } else {
            count_3018 += countNodes_2511533018(node_3018.getLeft_2511533018());
            count_3018 += countNodes_2511533018(node_3018.getRight_2511533018());
            return count_3018;
        }
    }

    public void print_2511533018() {
        assert this.root_3018 != null : "Root NULL.";
        this.root_3018.print_2511533018();
    }

    public Node_2511533018 getCurrent_2511533018() {
        return this.currentNode_3018;
    }

    public void setCurrent_2511533018(Node_2511533018 node_3018) {
        this.currentNode_3018 = node_3018;
    }

    public void setRoot_2511533018(Node_2511533018 root_3018) {
        this.root_3018 = root_3018;
    }
}
