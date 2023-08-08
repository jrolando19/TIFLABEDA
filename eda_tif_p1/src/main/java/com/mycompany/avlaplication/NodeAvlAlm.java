package com.mycompany.avlaplication;

public class NodeAvlAlm<E> {
    private String id;
    private E data;
    private NodeAvlAlm<E> left; 
    private NodeAvlAlm<E> right;
    private int bf;
	    
    public NodeAvlAlm(String id, E data, NodeAvlAlm<E> left, NodeAvlAlm<E> right){
        this.id = id;
        this.data = data;
        this.left = left;
        this.right = right;
        this.bf = 0;
    }

    public int getBf() {
            return bf;
    }

    public void setBf(int bf) {
            this.bf = bf;
    }

    public NodeAvlAlm(String id, E data){ 
            this(id,data,null, null);
    }
    
    public String getId() {
            return this.id;
    }

    public E getData() {
            return this.data;
    }

    public void setData(E data) {
            this.data = data;
    }

    public NodeAvlAlm<E> getLeft() {
            return this.left;
    }

    public void setLeft(NodeAvlAlm<E> left) {
            this.left = left;
    }

    public NodeAvlAlm<E> getRight() {
            return this.right;
    }

    public void setRight(NodeAvlAlm<E> right) {
            this.right = right;
    }

    public String toString() {
            return this.data.toString() + "(" + this.bf + ")";
    }
}
