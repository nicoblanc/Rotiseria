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
public class Cliente {
    int idCliente;
    String Cliente;
    String Direccion;
    String Telefono;

    public Cliente(int idCliente, String Cliente, String Direccion, String Telefono) {
        this.idCliente = idCliente;
        this.Cliente = Cliente;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
}
