package com.mycompany.avlaplication;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import myExceptions.ExceptionNoFound;

public class AvlAlm<E extends Comparable<E>> {
    private NodeAvlAlm<E> root;
    private boolean height;

    public AvlAlm() {
            this.root = null;
    }

    public boolean isEmpty() {
            return this.root == null;
    }

    public void insert(String id, E x) throws ExceptionNoFound {
            this.root = insert(id, x, this.root);	
            this.height = false;
            
    }

    private NodeAvlAlm<E> insert(String id, E x, NodeAvlAlm<E> current) throws ExceptionNoFound{
        NodeAvlAlm<E> res = current;
        //Caso que sea la raiz
        if (current == null) {
            res = new NodeAvlAlm<E>(id, x);
            this.height = true;
        }
        else {
            int resC = current.getData().compareTo(x);
            if (resC == 0)
                throw new ExceptionNoFound("Elemento ya se encuentra en el arbol");
            if (resC < 0) {
                res.setRight(insert(id, x, current.getRight()));
                if (this.height) {
                    switch(res.getBf()) {
                    case -1: res.setBf(0);
                        this.height = false;
                        break;
                    case 0: res.setBf(1);
                        break;
                    case 1: //res.setBf(2);
                        res = balanceToLeft(res);
                        this.height = false;
                        break;
                    }
                }
            }
            else {
                res.setLeft(insert(id, x, current.getLeft()));
                // completar la verificacion de los factores de balanc
                if (this.height) {
                    switch (res.getBf()) {
                        case -1: res=balanceToRight(res);
                            this.height = false;
                            break;
                        case 0: res.setBf(-1);
                            break;
                        case 1: res.setBf(0);
                            //res = balanceToLeft(res);
                            this.height = false;
                            break;
                    }
                }
            }
        }
        return res;	
    }

    private NodeAvlAlm<E> balanceToRight(NodeAvlAlm<E> node){
            NodeAvlAlm<E> son = node.getLeft();
            if (son.getBf() == -1){
                    node.setBf(0);
                    son.setBf(0);
                    node = rotateRSR(node);
            }
            else if (son.getBf() == 1) {
                    NodeAvlAlm<E> gSon = son.getLeft();
                    switch(gSon.getBf()) {
                    case -1: node.setBf(-1); son.setBf(0); break;
                    case 0: node.setBf(0); son.setBf(0); break;
                    case 1: node.setBf(0); son.setBf(1); break;
                    }
                    gSon.setBf(0);

                    node.setLeft(rotateRSL(son));
                    node = rotateRSR(node);
            }
            return node;
    }

    private NodeAvlAlm<E> balanceToLeft(NodeAvlAlm<E> node){
            NodeAvlAlm<E> son = node.getRight();
            if (son.getBf() == 1){
                    node.setBf(0);
                    son.setBf(0);
                    node = rotateRSL(node);
            }
            else if (son.getBf() == -1) {
                    NodeAvlAlm<E> gSon = son.getLeft();
                    switch(gSon.getBf()) {
                    case -1: node.setBf(0); son.setBf(-1); break;
                    case 0: node.setBf(0); son.setBf(0); break;
                    case 1: node.setBf(1); son.setBf(0); break;
                    }
                    gSon.setBf(0);

                    node.setRight(rotateRSR(son));
                    node = rotateRSL(node);
            }
            return node;
    }

    private NodeAvlAlm<E> rotateRSL(NodeAvlAlm<E> node){
            NodeAvlAlm<E> son = node.getRight();
            node.setRight(son.getLeft());
            son.setLeft(node);
            node = son;
            return node;
    }

    private NodeAvlAlm<E> rotateRSR(NodeAvlAlm<E> node){
            NodeAvlAlm<E> son = node.getLeft();
            node.setLeft(son.getRight());
            son.setRight(node);
            node = son;
            return node;
    }

    public E getRoot() {
            return this.root.getData();
    }


    public E search(String id) throws ExceptionNoFound {
        NodeAvlAlm<E> aux = search(id, this.root);
        if (aux == null)
               throw new ExceptionNoFound("Elemento no se encuentra en el arbol");
        return aux.getData();
    }

    private NodeAvlAlm<E> search(String id, NodeAvlAlm<E> current) throws ExceptionNoFound{
            if (current == null) {
                    return null;
            }
            else {
                    int resC = current.getId().compareTo(id);
                    if (resC == 0)
                            return current;
                    if (resC < 0)
                             return search(id, current.getRight());
                    else
                            return search(id, current.getLeft());
            }
    }

    //La eliminación debe ser modificada a efecto de verificar el balanceo del árbol.
    //Esta eliminación es del BST
    public void remove(String id) throws ExceptionNoFound {
        LinkedList<NodeAvlAlm> listaPaso = new LinkedList<NodeAvlAlm>();
            this.root = remove(id, this.root, listaPaso);	
    }

    private NodeAvlAlm<E> remove(String id, NodeAvlAlm<E> current, LinkedList<NodeAvlAlm> listaPaso) throws ExceptionNoFound{
            NodeAvlAlm<E> res = current;
            listaPaso.push(res);
            if (current == null) {
                    throw new ExceptionNoFound("Elemento no se encuentra en el arbol");
            }
            else {
                    int resC = current.getId().compareTo(id);
                    if (resC < 0){
                        res.setRight(remove(id, current.getRight(), listaPaso));
                    }
                    else if (resC > 0)
                            res.setLeft(remove(id, current.getLeft(), listaPaso));
                    else {
                            if (current.getLeft()!= null && current.getRight() != null) {
                                    //case 3: dos hijos
                                    NodeAvlAlm<E> rem = current.getRight();
                                    while (rem!=null){
                                        rem = rem.getLeft();
                                    }
                                    //Lo desenlazamos completamente
                                    rem.setLeft(current.getLeft());
                                    rem.setRight(current.getRight());
                                    current.setLeft(null);
                                    current.setRight(null);
                                    //Iniciamos el analisis de como a afectado
                            }
                            else {
                                    if (isLeaf(current)) 	//case 1: hoja
                                            res = null;
                                    else{ //case 2: solo un hijo
                                            res = current.getLeft() != null ? current.getLeft() : current.getRight();
                                    } 
                            }
                    }
            }
            return res;	
    }

    private boolean isLeaf(NodeAvlAlm<E> current) {
            return current.getLeft() == null && current.getRight() == null;
    }

    public void inOrden() {
            if (isEmpty())
                    System.out.println("Arbol esta vacío ....");
            else{
                    inOrden(this.root);
                    System.out.println();
            }
    }



    private void inOrden(NodeAvlAlm<E> current) {
            if (current.getLeft() != null)
                    inOrden(current.getLeft());
            System.out.println(current);
            if (current.getRight()!= null)
                    inOrden(current.getRight());
    }
    
}
