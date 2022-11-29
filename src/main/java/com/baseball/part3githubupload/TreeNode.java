package com.baseball.part3githubupload;

//public class TreeNode<E extends Comparable<E>> {
//    //instance TreeNode attributes
//    protected E element;
//    //left and right subtree pointers
//    protected TreeNode<E> leftNode;
//    protected TreeNode<E> rightNode;
//
//    //initializing element
//    public TreeNode(E element) {
//        super();
//        //setting element
//        this.element = element;
//    }
//}
//    private int data;
//    private TreeNode leftChild;
//    private TreeNode rightChild;
////----------------------------------------------------------------------
//    public TreeNode(int data){
//        this.data = data;
//    }
////----------------------------------------------------------------------
//    //O(logn)
//    public void insert(int value){
//        if(value == data){
//            return;
//        }
//        if (value < data){
//            if (leftChild == null){
//                leftChild = new TreeNode(value);
//            }
//            else{
//                leftChild.insert(value);
//            }
//        }
//        else {
//            if (rightChild == null){
//                rightChild = new TreeNode(value);
//            }
//            else{
//                rightChild.insert(value);
//            }
//        }
//    }  // insert
////----------------------------------------------------------------------
//
//    // get
//    public TreeNode get(int value){
//        if (value == data){
//            return this;
//        }
//        if (value < data){
//            if (leftChild != null){
//                return leftChild.get(value);
//            }
//        }
//        else{
//            if (rightChild != null){
//                return rightChild.get(value);
//            }
//        }
//
//        return null;
//    }
////----------------------------------------------------------------------
//    // min
//    public int min(){
//        if (leftChild == null){
//            return data;
//        }
//        else{
//            return leftChild.min();
//        }
//    }
////----------------------------------------------------------------------
//    // max
//    public int max(){
//        if (rightChild == null){
//            return data;
//        }
//        else{
//            return rightChild.max();
//        }
//    }
////----------------------------------------------------------------------
//
//    // O(1)
//    public void traverseInOrder(){
//        if (leftChild != null){
//            leftChild.traverseInOrder();
//        }
//        System.out.print(data + ", " );
//        if (rightChild != null){
//            rightChild.traverseInOrder();
//        }
//    } // transverse inorder
//
////----------------------------------------------------------------------
//    //PreOrderTransversal
//    public void traversePreOrder() {
//
//        System.out.print(data + ", ");
//
//        if (leftChild != null) {
//            leftChild.traversePreOrder();
//        }
//
//        if (rightChild != null) {
//            rightChild.traversePreOrder();
//        }
//    } // transverse inorder
//
//
////----------------------------------------------------------------------
//
//    public void traversePostOrder() {
//
//        if (leftChild != null) {
//            leftChild.traversePostOrder();
//        }
//
//        if (rightChild != null) {
//            rightChild.traversePostOrder();
//        }
//
//        System.out.print(data + ", ");
//
//    } // transverse inorder
////----------------------------------------------------------------------
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public TreeNode getLeftChild() {
//        return leftChild;
//    }
//
//    public void setLeftChild(TreeNode leftChild) {
//        this.leftChild = leftChild;
//    }
//
//    public TreeNode getRightChild() {
//        return rightChild;
//    }
//
//    public void setRightChild(TreeNode rightChild) {
//        this.rightChild = rightChild;
//    }
////----------------------------------------------------------------------
//    public String toString() {
//        return "Data = " + data;
//    }
////----------------------------------------------------------------------
//
//
////    public String toString(){
////
////    }
//} // TreeNode Class
