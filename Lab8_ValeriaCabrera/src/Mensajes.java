/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Mensajes {
    
    private Personas emisor;
    private Personas receptor;
    private String mens;

    public Mensajes() {
    }

    public Mensajes(Personas emisor, Personas receptor, String mens) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.mens = mens;
    }

    public Personas getEmisor() {
        return emisor;
    }

    public void setEmisor(Personas emisor) {
        this.emisor = emisor;
    }

    public Personas getReceptor() {
        return receptor;
    }

    public void setReceptor(Personas receptor) {
        this.receptor = receptor;
    }

    public String getMens() {
        return mens;
    }

    public void setMens(String mens) {
        this.mens = mens;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "emisor=" + emisor + ", receptor=" + receptor + ", mens=" + mens + '}';
    }
    
    
    
}
