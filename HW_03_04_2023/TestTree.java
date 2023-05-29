package HW_03_04_2023;

public class TestTree {
    public static void main(String[] args) {
        BlackRedTree<String> tree = new BlackRedTree();
        tree.add("a");
        System.out.println("++++++++++++++++ Start ++++++++++++++++++");
        tree.print(tree.root);
        tree.add("b");
        System.out.println("++++++++++++++++++++++++++++++++++");
        tree.print(tree.root);
        tree.add("c");
        System.out.println("++++++++++++++++++++++++++++++++++");
        tree.print(tree.root);
        tree.add("d");
        System.out.println("++++++++++++++++++++++++++++++++++");
        tree.print(tree.root);
        tree.add("e");
        System.out.println("++++++++++++++++++++++++++++++++++");
        tree.print(tree.root);
        tree.add("f");
        System.out.println("++++++++++++++++++++++++++++++++++");
        tree.print(tree.root);
        tree.add("k");
        System.out.println("++++++++++++++++++++++++++++++++++");
        tree.print(tree.root);
        System.out.println("+++++++++++ The end ++++++++++++++");
    }

}