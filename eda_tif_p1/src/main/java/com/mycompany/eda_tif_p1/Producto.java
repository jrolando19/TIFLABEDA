package com.mycompany.eda_tif_p1;

public class Producto implements Comparable<Producto>{
    //public static ArrayList<String> nomProductos = new ArrayList<String>();
    public static int num=0;
    private int cod;
    private String des;
    private int stock;
    
    public Producto(int cod, String des, int stock){
        this.cod = ++num;
        this.des = des;
        this.stock = stock;
    }
    
    public int getCod(){
        return this.cod;
    }
    
    public String getDes(){
        return this.des;
    }

    @Override
    public int compareTo(Producto t) {
        return this.des.compareTo(t.getDes());
    }
}
