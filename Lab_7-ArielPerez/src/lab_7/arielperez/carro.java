/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_7.arielperez;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class carro {

    private String nombre;
    private ArrayList<Piezas> lista = new ArrayList();

    public carro() {
    }

    public carro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Piezas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Piezas> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
