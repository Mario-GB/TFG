/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.swing.ImageIcon;




/**
 *Clase referente a la entidad usada en la base de datos para designar a cada articulo
 *
 * @author PedroFB
 */
public class Articulo {
    ImageIcon[]imagenes;
    String titulo, descripcion,provincia;
  
    int id;
    int vendedor;

    public Articulo(int id,String titulo, String descripcion,String provincia, int vendedor) {
       
        this.id=id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.provincia=provincia;
        this.vendedor = vendedor;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setImagenes(ImageIcon[] imagenes) {
        this.imagenes = imagenes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public int getId() {
        return id;
    }

    public ImageIcon[] getImagenes() {
        return imagenes;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getVendedor() {
        return vendedor;
    }
    
    
}
