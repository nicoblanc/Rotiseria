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
public class Alimento {
    int idalimento;
    String descripcion;
    int stock;

    public Alimento() {
    }

    public int getIdalimento() {
        return idalimento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setIdalimento(int idalimento) {
        this.idalimento = idalimento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
