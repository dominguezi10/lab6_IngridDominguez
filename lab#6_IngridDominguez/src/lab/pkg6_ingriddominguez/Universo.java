/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_ingriddominguez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class Universo {
    private String nombre;
    private ArrayList<SeresVivos> seresVivos = new ArrayList();

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public Universo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SeresVivos> getSeresVivos() {
        return seresVivos;
    }

    public void setSeresVivos(ArrayList<SeresVivos> seresVivos) {
        this.seresVivos = seresVivos;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", seresVivos=" + seresVivos + '}';
    }
    
    
    
    // primer metodo administracion
    public void escribirArchivo() throws IOException {
        File archivo = new File("./"+nombre+".txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (SeresVivos sv : seresVivos) {
                bw.write(sv.getNombre()+"|");
                bw.write(sv.getKi()+"|");
                bw.write(sv.getMaximoAnios()+"|");
                bw.write(sv.getNombrePlaneta()+";");  
            }
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }
    
}// fin de la clase
