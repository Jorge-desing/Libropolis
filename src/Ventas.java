/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Ventas {
  String nombre,telefono,cedula,titulo,autor,edicion,costo,pago,cantidad,tip,fecha;
  double total,cambio;
  int ia,it;
    

    Ventas(String nombre, String telefono, int ia, int it, String autor, String edicion, String costo, String montototal, String cantidad, double total, String tipo, String fecha, double cambio) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.costo = costo;
        this.pago = pago;
        this.cantidad = cantidad;
        this.total = total;
        this.tip = tip;
        this.fecha = fecha;
        this.cambio = cambio;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCedula() {
        return cedula;
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

    public String getCosto() {
        return costo;
    }

    public String getPago() {
        return pago;
    }

    public String getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public String getTip() {
        return tip;
    }

    public String getFecha() {
        return fecha;
    }

    public double getCambio() {
        return cambio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
  
  
     
    
     
    
}
