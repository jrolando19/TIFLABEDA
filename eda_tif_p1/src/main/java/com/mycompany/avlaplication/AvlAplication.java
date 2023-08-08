package com.mycompany.avlaplication;

import myExceptions.ExceptionNoFound;

public class AvlAplication {

    public static void main(String[] args) throws ExceptionNoFound {
        Avl<Integer> b = new Avl<Integer>();
        b.insert(20);
        b.inOrden();
        b.insert(30);
        b.inOrden();
        System.out.println("root: " + b.getRoot());
        b.insert(40);
        b.inOrden();
        System.out.println("root: " + b.getRoot());
        b.insert(50);
        b.inOrden();
        b.insert(60);
        b.inOrden();
    }
}
