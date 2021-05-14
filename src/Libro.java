/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Libro {
    protected String titulo,autor,edicion;
    protected int precio;

    public Libro(String titulo, String autor, String edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.precio = precio;
    }
     public Libro() {
        titulo="";
        autor="";
        edicion="";
        precio=0;
    }

   

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

   
    
    
    
}
