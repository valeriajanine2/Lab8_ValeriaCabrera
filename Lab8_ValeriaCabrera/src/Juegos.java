/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Juegos extends Articulos{
    
    private int edicion;
    private String casa;
    private String pais;

    public Juegos(int edicion, String casa, String pais, String titulo, Color color, String descripcion, String editorial, int tamano, int puntuacion, Personas usuario) {
        super(titulo, color, descripcion, editorial, tamano, puntuacion, usuario);
        this.edicion = edicion;
        this.casa = casa;
        this.pais = pais;
    }

    public Juegos() {
        super();
    }

    

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.getTitulo();
    }

    @Override
    int num() {
        return edicion;
    }
    
    
    
}
