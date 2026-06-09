package pekan9_2511533018;

import pekan8_2511533018.Utils.Utils;
import pekan9_2511533018.helper.StringUtils;

public class Node_2511533018 {
    public int data_3018;
    public Node_2511533018 left_3018;
    public Node_2511533018 right_3018;

    public Node_2511533018(int data_3018) {
        this.data_3018 = data_3018;
        this.left_3018 = null;
        this.right_3018 = null;
    }

    public void setLeft_2511533018(Node_2511533018 node_3018) {
        if (this.left_3018 == null) this.left_3018 = node_3018;
    }

    public void setRight_2511533018(Node_2511533018 node_3018) {
        if (this.right_3018 ==  null) this.right_3018 = node_3018;
    }

    public Node_2511533018 getLeft_2511533018() {
        return this.left_3018;
    }

    public Node_2511533018 getRight_2511533018() {
        return this.right_3018;
    }

    public int getData_2511533018() {
        return this.data_3018;
    }

    public void setData_2511533018(int data_3018) {
        this.data_3018 = data_3018;
    }

    public void printPreOrder_2511533018(Node_2511533018 node_3018) {
        if (node_3018 == null) return;
        Utils.printStatement(node_3018.data_3018 + StringUtils.empty());
        printPreOrder_2511533018(node_3018.left_3018);
        printPreOrder_2511533018(node_3018.right_3018);
    }

    public void printPostOrder_2511533018(Node_2511533018 node_3018) {
        if (node_3018 == null) return;
        printPostOrder_2511533018(node_3018.left_3018);
        printPostOrder_2511533018(node_3018.right_3018);
        Utils.printStatement(node_3018.data_3018 + StringUtils.empty());
    }

    public void printInOrder_2511533018(Node_2511533018 node_3018) {
        if (node_3018 == null) return;
        printInOrder_2511533018(node_3018.left_3018);
        Utils.printStatement(node_3018.data_3018 + StringUtils.empty());
        printInOrder_2511533018(node_3018.right_3018);
    }

    public void print_2511533018() {
        this.print_2511533018("", true, "");
    }

    public void print_2511533018(String prefix_3018, boolean isTail_3018, String sb_3018) {
        if (this.right_3018 != null)
            this.right_3018.print_2511533018(prefix_3018 + (isTail_3018 ? "|   " : "   "), false, sb_3018);

        Utils.printLineStatement(prefix_3018 + (isTail_3018 ? "\\-- " : "/-- ") + this.data_3018);

        if (this.left_3018 != null)
            this.right_3018.print_2511533018(prefix_3018 + (isTail_3018 ? "   " : "|   "), true, sb_3018);

    }
}
