/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public abstract class Articulos {
    
    private String titulo;
    private Color color;
    private String descripcion;
    private String editorial;
    private int tamano;
    private int puntuacion;
    private Personas usuario;

    public Articulos() {
    }

    public Articulos(String titulo, Color color, String descripcion, String editorial, int tamano, int puntuacion, Personas usuario) {
        this.titulo = titulo;
        this.color = color;
        this.descripcion = descripcion;
        this.editorial = editorial;
        this.tamano = tamano;
        this.puntuacion = puntuacion;
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Personas getUsuario() {
        return usuario;
    }

    public void setUsuario(Personas usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Articulos{" + "titulo=" + titulo + ", color=" + color + ", descripcion=" + descripcion + ", editorial=" + editorial + ", tamano=" + tamano + ", puntuacion=" + puntuacion + ", usuario=" + usuario + '}';
    }
    
    abstract int num();    
}
