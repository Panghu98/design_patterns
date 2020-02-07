package structure_patterns.composite;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 21:12 2020/2/7
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");

        nodeA.add(nodeB);
        System.out.println(nodeA.getChildren());
    }

}
