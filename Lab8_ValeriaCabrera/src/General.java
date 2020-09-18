/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Usuario
 */
public class General extends Personas {
    
    private String ocupacion;
    private String horario;
    private int semanas;
    private double sueldo;

    public General() {
        super();
    }

    public General(String ocupacion, String horario, int semanas, double sueldo, int id, String nombre, int edad, String sexo, String estado, double altura, double peso) {
        super(id, nombre, edad, sexo, estado, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanas = semanas;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    @Override
    String rol() {
        return ocupacion;
    }
    
    
    
    
    
}
