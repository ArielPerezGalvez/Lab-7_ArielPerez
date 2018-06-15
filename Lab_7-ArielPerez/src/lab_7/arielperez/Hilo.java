/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_7.arielperez;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class Hilo extends Thread {

    private JTable tabla;
    ArrayList<Piezas> lista = new ArrayList();
    tabla t = new tabla();
    carro ca;

    public Hilo() {
    }

    public Hilo(carro ca) {
        this.ca = ca;
    }
    

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public ArrayList<Piezas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Piezas> lista) {
        this.lista = lista;
    }

    public tabla getT() {
        return t;
    }

    public void setT(tabla t) {
        this.t = t;
    }

    public carro getCa() {
        return ca;
    }

    public void setCa(carro ca) {
        this.ca = ca;
    }

    @Override
    public void run() {
        t.setVisible(true);
        for (Piezas piezas : ca.getLista()) {
            try {
                Thread.sleep(piezas.getTiempo()*1000);
            } catch (Exception e) {
            }
            Object [] row ={piezas.getNombre(),
            piezas.getMaterial(),
            piezas.getTiempo()};
            DefaultTableModel m = (DefaultTableModel) t.jTable1.getModel();
            m.addRow(row);
            t.jTable1.setModel(m);
            
            
            
        }
    }

}
