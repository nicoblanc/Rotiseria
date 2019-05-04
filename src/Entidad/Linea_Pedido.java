/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author nicob
 */
public class Linea_Pedido {
    int idLinea_Pedido;
    int cantidad;
    int precio_vta;
    int idComida;

    public Linea_Pedido() {
    }

    public int getIdLinea_Pedido() {
        return idLinea_Pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio_vta() {
        return precio_vta;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdLinea_Pedido(int idLinea_Pedido) {
        this.idLinea_Pedido = idLinea_Pedido;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_vta(int precio_vta) {
        this.precio_vta = precio_vta;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }
    
    
}
