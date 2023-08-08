package com.mycompany.eda_tif_p1;

public class Almacen implements Comparable<Almacen>{
    public static int num=0;
    private int cod;
    private String nom;
    private String dir;
    //private Avl<Producto> b = new Avl<Producto>();
    
    public Almacen(int cod, String nom, String dir){
        this.cod = cod;
        this.nom = nom;
        this.dir = dir;
    }
    
    public int getCod(){
        return this.cod;
    }
    /*
    public static void main (String args[]){
        Almacen[] alm = new Almacen[10];
        
        System.out.println("Numero de Almacenes: " + Almacen.num);
    }*/
    
    public String getNom(){
        return this.nom;
    }

    @Override
    public int compareTo(Almacen t) {
        return this.nom.compareTo(t.getNom());
    }
    
    public String toString(){
        return cod + " - " + nom + " - " + dir;
    }
}
