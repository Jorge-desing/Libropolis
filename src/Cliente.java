/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Cliente {
    protected String cedula,nombre,telefono;

    public Cliente(String cedula, String telefono, String nombre) {
        this.cedula = cedula;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public Cliente() {
        this.cedula = "";
        this.telefono = "";
        this.nombre = "";
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
