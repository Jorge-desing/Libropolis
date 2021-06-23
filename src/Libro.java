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


    public Libro(String titulo, String autor, String edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;

    }
     public Libro() {
        titulo="";
        autor="";
        edicion="";

    }

    @Override
    public String toString() {
        return "Libro : " + titulo + " Autor : " + autor + " Edicion : " + edicion +"\n" ;
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

 

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }


    
    
    
}
