/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buysale4u.Ventanas.paneles;

import buysale4u.Ventanas.MostrarArticulo;
import buysale4u.control.ControlArticulos;
import entidades.Articulo;
import entidades.ArticuloFinal;
import java.awt.Dialog;
import java.awt.Frame;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Interfaz grafica que muestra los articulos propios ya creados
 *
 * @author PedroFB
 */
public class MisArticulos extends javax.swing.JPanel {

    //lista de articulos finales
    JList<ArticuloFinal> listaArticulos;
    //objeto dialog    
    Dialog galeria;

    /**
     * Contructor
     * @param parent File 
     */
    public MisArticulos(Frame parent) {
        initComponents();
        //creamos un nuevo modelo de lista y lo inicializamos a null
        DefaultListModel modelo = null;
        //inicializamos la lista de articulos finales
        listaArticulos = new JList<>();
        try {
            //introducimos los datos de los articulos de la base de datos en un array de Articulos
            Articulo[] array = ControlArticulos.listar();
            //completamos los articulos con las imagenes correspondientes y los añadimos al modelo 
            ControlArticulos.completarArticulo(listaArticulos, array);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parent, "Error: No se pudo encontrar articulos. \n Conexion fallida");
        }
        //comprobamos que el modelo no sea nulo
        if (modelo == null) {
            JOptionPane.showMessageDialog(parent, "actualmente no se encuentran anuncios de articulos");
        }
        //creamos un manejador de eventos, concretamente el evento seleccionar de la lista
        listaArticulos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //inicializamos un nuevo valor numerico con el indice seleccionado de la lista
                int indice = listaArticulos.getSelectedIndex();
                //cambiamos el valor del articulo seleccionado con el elemento seleccionado de la lista
                ControlArticulos.seleccionado = listaArticulos.getModel().getElementAt(indice);
                //abrimos una nueva interfaz grafica con el constructor de la clase MostrarArticulo
                galeria = new MostrarArticulo((Frame) getParent(), true);
                galeria.setVisible(true);

            }

        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        setLayout(new java.awt.BorderLayout());
        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
