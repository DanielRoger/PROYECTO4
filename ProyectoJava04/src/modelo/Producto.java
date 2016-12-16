/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author daniel y roger
 */
public class Producto {
    
    private int prod_id;
    private String prod_nom;
    private double prod_foto;
    private double prod_preu;
    private int serie_id;

    public Producto(int prod_id, String prod_nom, double prod_foto, int serie_id) {
        this.prod_id = prod_id;
        this.prod_nom = prod_nom;
        this.prod_foto = prod_foto;
        this.serie_id = serie_id;
    }

    public Producto() {
    }

    public int getProd_id() {
        return prod_id;
    }

    public String getProd_nom() {
        return prod_nom;
    }

    public double getProd_foto() {
        return prod_foto;
    }

    public int getSerie_id() {
        return serie_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public void setProd_nom(String prod_nom) {
        this.prod_nom = prod_nom;
    }

    public void setProd_foto(double prod_foto) {
        this.prod_foto = prod_foto;
    }

    public void setSerie_id(int serie_id) {
        this.serie_id = serie_id;
    }
    
    
    
}
