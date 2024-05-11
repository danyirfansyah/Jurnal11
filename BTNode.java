public class BTNode<E> {
    private BTNode<E> left, right;
    private E data;

    public BTNode() {
        left = null;
        right = null;
        data = null;
    }

    public BTNode(E item) {
        left = null;
        right = null;
        data = item;
    }

    public void setLeft(BTNode<E> n) {
        left = n;
    }

    public void setRight(BTNode<E> n) {
        right = n;
    }

    public BTNode<E> getLeft() {
        return left;
    }

    public BTNode<E> getRight() {
        return right;
    }

    public void setData(E d) {
        data = d;
    }

    public E getData() {
        return data;
    }
}
