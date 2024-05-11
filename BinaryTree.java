public class BinaryTree<E> {
    private BTNode<E> root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;   
    }

    public void insert(E data) { 
        root = insert(root, data); 
    }

    private BTNode<E> insert(BTNode<E> node, E data) {   
        if (node == null) {                        
            node = new BTNode<>(data); 
        }
        else {
            if (node.getLeft() == null) {
                node.setLeft(new BTNode<>(data));
            } else {
                node.setRight(new BTNode<>(data));
            }
        }
        return node;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(BTNode<E> r) {
        if (r == null) {
            return 0;
        } else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    public boolean search(E val) {
        return search(root, val);
    }

    private boolean search(BTNode<E> r, E val) {
        if (r == null) {
            return false;
        }
        if (r.getData().equals(val)) {
            return true;
        }
        return search(r.getLeft(), val) || search(r.getRight(), val);
    }

    public void inorder() {             
        inorder(root);             
    }

    private void inorder(BTNode<E> r) {                    
        if (r != null) {                                
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(BTNode<E> r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(BTNode<E> r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}
