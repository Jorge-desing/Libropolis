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
    protected double costo;


    public Libro(String titulo, String autor, String edicion, double costo) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.costo = costo;

    }
     public Libro() {
        titulo="";
        autor="";
        edicion="";
        costo=0;

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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    
    
    
}
