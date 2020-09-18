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
public class Figuras extends Articulos {
    
    private String desc;
    private String instrucciones;
    private String garantía;

    public Figuras() {
        super();
    }

    public Figuras(String desc, String instrucciones, String garantía, String titulo, Color color, String descripcion, String editorial, int tamano, int puntuacion, Personas usuario) {
        super(titulo, color, descripcion, editorial, tamano, puntuacion, usuario);
        this.desc = desc;
        this.instrucciones = instrucciones;
        this.garantía = garantía;
    }

    

    public String getDesc() {
        return desc;
    }

    public void setDesc(String descripcion) {
        this.desc = descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getGarantía() {
        return garantía;
    }

    public void setGarantía(String garantía) {
        this.garantía = garantía;
    }

    @Override
    public String toString() {
        return super.getTitulo();
    }

    @Override
    int num() {
        return super.getPuntuacion();
    }
    
    
    
}
