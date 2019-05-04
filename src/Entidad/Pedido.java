/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicob
 */
public class Pedido {
    private int idPedido;
    private String fecha;
    private float total;
    private String modificado;
    private int idEstado;
    private int idCliente;
    private List<Linea_Pedido> lineapedido;
    

    public Pedido() {
        lineapedido = new ArrayList<>();
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public float getTotal() {
        return total;
    }

    public String getModificado() {
        return modificado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
}
