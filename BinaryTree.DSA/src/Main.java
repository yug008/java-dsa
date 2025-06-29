class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}

class BinaryTree{
    Node root;

    public void add(int data){
        root = addRec(root, data);
    }

    public Node addRec(Node root, int data){
        if(root==null){                     //if the binary tree is empty / root node(first node) isn't yet created
            root = new Node(data);
        }
        else if(data<root.data){
            root.left = addRec(root.left,data);
        }
        else if(data>root.data){
            root.right = addRec(root.right,data);
        }

        return root;
    }

    public void inOrder(){          // left->root->right
        inOrderRec(root);
    }

    public void inOrderRec(Node root){          //we need recursion in printing tree as we have to start from the bottomest tree and the process will gradually repeat as we go up the tree
        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder(){          // root->left->right
        preOrderRec(root);
    }

    public void preOrderRec(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder(){               //left->right->root
        postOrderRec(root);
    }

    public void postOrderRec(Node root){
       if(root!=null) {
           postOrderRec(root.left);
           postOrderRec(root.right);
           System.out.print(root.data + " ");
       }
    }

    public void sum(){
       int sum = sumRec(root);
        System.out.println("The sum of binary tree is: " + sum);
    }

    public int sumRec(Node root){
        if(root==null){
            return 0;
        }
        return root.data + sumRec(root.left) + sumRec(root.right);
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();
        obj.add(8);
        obj.add(7);
        obj.add(12);
        obj.add(15);
        obj.add(2);
        obj.add(5);

        obj.inOrder();
        System.out.println();
        obj.preOrder();
        System.out.println();
        obj.postOrder();
        System.out.println();

       obj.sum();


    }
}

/* The recursive method to add elements in a binary tree will have a return type 'Node' / it returns a node
(root node).      ->addRec method
 */