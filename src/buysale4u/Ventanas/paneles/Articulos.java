/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buysale4u.Ventanas.paneles;

import buysale4u.control.ControlArticulos;
import entidades.Articulo;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author PedroFB
 */
public class Articulos extends javax.swing.JPanel {

    JList<Articulo>listaArticulos;
    /**
     * Creates new form Articulos
     */
    public Articulos() {
        initComponents();
        
        ControlArticulos.listar(listaArticulos);
        scrollLista.add(listaArticulos);
        listaArticulos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int indice= listaArticulos.getSelectedIndex();
                ControlArticulos.seleccionado=listaArticulos.getModel().getElementAt(indice);
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
        java.awt.GridBagConstraints gridBagConstraints;

        scrollLista = new javax.swing.JScrollPane();
        detalles = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.ipady = 603;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(scrollLista, gridBagConstraints);

        detalles.setLayout(new java.awt.GridBagLayout());

        titulo.setText("jLabel1");
        detalles.add(titulo, new java.awt.GridBagConstraints());

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        detalles.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 625;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        add(detalles, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descripcion;
    private javax.swing.JPanel detalles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
