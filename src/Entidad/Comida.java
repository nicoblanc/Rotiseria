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
public class Comida {
    private int idComida;
    private String descripcion;
    private float precio;
    private int stock;
    private String idCategoria;
    private List<Alimento> alimento;
    private List<Categoria> categoria;

    public Comida() {
        alimento = new ArrayList<>();
        categoria = new ArrayList<>();
    }

    public int getIdComida() {
        return idComida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
    
    
}
