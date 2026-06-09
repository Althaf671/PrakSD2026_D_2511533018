package pekan9_2511533018;

import pekan8_2511533018.Utils.Utils;

public class BinaryThreeDriver_2511533018 {
    public static void main(String[] args) {
        //-- membuat pohon
        BinaryThree_2511533018 tree_3018 = new BinaryThree_2511533018();
        Utils.printLineStatement("Jumlah simpul awal pohon: ");
        Utils.printLineStatement(tree_3018.countNodes_2511533018());

        //-- menjadikan simpul 1 sebagai root
        Node_2511533018 root_3018 = new Node_2511533018(1);
        tree_3018.setRoot_2511533018(root_3018);
        Utils.printLineStatement("Jumlah simpul jika hanya ada root: ");
        Utils.printLineStatement(tree_3018.countNodes_2511533018());

        //-- tambah nodes baru
        Node_2511533018 node2_3018 = new Node_2511533018(2);
        Node_2511533018 node3_3018 = new Node_2511533018(3);
        Node_2511533018 node4_3018 = new Node_2511533018(4);
        Node_2511533018 node5_3018 = new Node_2511533018(5);
        Node_2511533018 node6_3018 = new Node_2511533018(6);
        Node_2511533018 node7_3018 = new Node_2511533018(7);
        Node_2511533018 node8_3018 = new Node_2511533018(8);
        Node_2511533018 node9_3018 = new Node_2511533018(9);

        root_3018.setLeft_2511533018(node2_3018);
        node2_3018.setLeft_2511533018(node4_3018);
        node2_3018.setRight_2511533018(node5_3018);
        node4_3018.setRight_2511533018(node8_3018);

        root_3018.setRight_2511533018(node3_3018);
        node3_3018.setLeft_2511533018(node6_3018);
        node3_3018.setRight_2511533018(node7_3018);
        node6_3018.setLeft_2511533018(node9_3018);

        //-- set root
        tree_3018.setCurrent_2511533018(tree_3018.getRoot_2511533018());
        Utils.printLineStatement("Menampilkan simpul terakhir: ");
        Utils.printLineStatement(tree_3018.getCurrent_2511533018().getData_2511533018());

        Utils.printLineStatement("Jumlah simpul; setelah simpul 7 ditambahkan: ");
        Utils.printLineStatement(tree_3018.countNodes_2511533018());

        Utils.printLineStatement("In Order: ");
        tree_3018.printInOrder_2511533018();

        Utils.printLineStatement("\nPre Order: ");
        tree_3018.printPreOrder_2511533018();

        Utils.printLineStatement("\nPost Order: ");
        tree_3018.printPostOrder_2511533018();

        Utils.printLineStatement("\nMenampilkan simpul dalam bentuk pohon: ");
        tree_3018.print_2511533018();
    }
}
