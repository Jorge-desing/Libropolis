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
    protected int cedula;
    protected String nombre,numero;

    public Cliente(int cedula, String numero, String nombre) {
        this.cedula = cedula;
        this.numero = numero;
        this.nombre = nombre;
    }

    public Cliente() {
        this.cedula = 5;
        this.numero = "";
        this.nombre = "";
    }


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
