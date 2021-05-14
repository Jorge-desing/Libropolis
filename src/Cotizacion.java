/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Cotizacion extends Pedido {

    public Cotizacion(int CantidaLibros, String FechaEntrega, double MontoTotal, boolean Pago) {
        super(CantidaLibros, FechaEntrega, MontoTotal, Pago);
    }

    public Cotizacion() {
        super();
    }

    public int getCantidaLibros() {
        return CantidaLibros;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public double getMontoTotal() {
        return MontoTotal;
    }

    public void setCantidaLibros(int CantidaLibros) {
        this.CantidaLibros = CantidaLibros;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }
    
    
}
