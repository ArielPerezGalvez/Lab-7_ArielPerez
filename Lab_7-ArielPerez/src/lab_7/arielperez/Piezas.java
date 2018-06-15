/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_7.arielperez;

import java.util.ArrayList;

public class Piezas {

    Object padre;
    ArrayList<Piezas> hijas = new ArrayList();
    private String nombre;
    private String material;
    private int tiempo;

    public Piezas() {
    }

    public Piezas(Object padre, String nombre, String material, int tiempo) {
        this.padre = padre;
        this.nombre = nombre;
        this.material = material;
        this.tiempo = tiempo;
    }

    public Object getPadre() {
        return padre;
    }

    public void setPadre(Object padre) {
        this.padre = padre;
    }

    public ArrayList<Piezas> getHijas() {
        return hijas;
    }

    public void setHijas(ArrayList<Piezas> hijas) {
        this.hijas = hijas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    

}
