package Tree;

public class Tree2 {
    Node root;
    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    public  void  postOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);
            inOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public  void  inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    public  void  preorderTraverseTree(Node focusNode){
        if(focusNode != null){
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.leftChild);


            preorderTraverseTree(focusNode.rightChild);
        }
    }

    public Node findNode(int key){
        Node focusNode = root;
        while (focusNode.key != key){
            if(key < focusNode.key){
                focusNode = focusNode.leftChild;
            }else {
                focusNode = focusNode.rightChild;
            }
            if(focusNode == null){
                return null;
            }
        }
        return focusNode;
    }






    public static void main(String[] args) {


        Tree2 theTree = new Tree2();
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice Pres");
        theTree.addNode(15, "Office Manger");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Sales Manager");
        theTree.addNode(85, "Salesman");
        Node n = theTree.findNode(30);
        System.out.println(theTree.findNode(30));

    }
}
class Node {
    int key;
    String name;
    Node leftChild;
    Node rightChild;

    Node(int key, String name){
        this.key = key;
        this.name = name;
    }
    public String toString(){
        return name + " has a key" + key;
    }

}

