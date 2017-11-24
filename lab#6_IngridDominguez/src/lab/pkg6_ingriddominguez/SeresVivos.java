/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_ingriddominguez;

/**
 *
 * @author 1234
 */
public class SeresVivos {
    private String nombre;
    private int ki;
    private int maximoAnios;
    private String nombrePlaneta;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, int ki, int maximoAnios, String nombrePlaneta) {
        this.nombre = nombre;
        this.ki = ki;
        this.maximoAnios = maximoAnios;
        this.nombrePlaneta = nombrePlaneta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getMaximoAnios() {
        return maximoAnios;
    }

    public void setMaximoAnios(int maximoAnios) {
        this.maximoAnios = maximoAnios;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
