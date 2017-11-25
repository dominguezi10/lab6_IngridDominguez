/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_ingriddominguez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 1234
 */
public class Universo {

    private File archivo;
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

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", seresVivos=" + seresVivos + '}';
    }

    // primer metodo administracion
    public void escribirArchivo() throws IOException {
        File archivo = new File("./" + nombre + ".txt");
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (SeresVivos sv : seresVivos) {
                bw.write(sv.getNombre() + "|");
                bw.write(sv.getKi() + "|");
                bw.write(sv.getMaximoAnios() + "|");
                bw.write(sv.getNombrePlaneta() + ";");
            }
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }

    public void Guardar(int Seleccion, JFileChooser jfc) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        //jfc captura la ruta
        //jfc.setSelectedFile(new File(nombre + ".txt"));
        if (Seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals("Archivo de Texto")) { //captura que filtro tiene
                    String n = jfc.getName();
                    System.out.println(n);
                    //if (n.equals(nombre + ".txt")) {
                    System.out.println(jfc.getSelectedFile().getPath());
                    fichero = new File(jfc.getSelectedFile().getPath() + ".txt");

                    try {
                        fw = new FileWriter(fichero, false);
                        bw = new BufferedWriter(fw);
                        for (SeresVivos sv : seresVivos) {
                            bw.write(sv.getNombre() + "|");
                            bw.write(sv.getKi() + "|");
                            bw.write(sv.getMaximoAnios() + "|");
                            bw.write(sv.getNombrePlaneta() + "|");
                        }
                        bw.flush();

                        System.out.println("lo agrego");
                    } catch (Exception e) {

                    }

                    /*} else {
                        JOptionPane.showMessageDialog(null, "Nombre erronea");
                    }*/
                } else {
                    fichero = jfc.getSelectedFile(); // lo capturo
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (Exception e) {
                }
            }// fin del primer try

        }
    }

    public ArrayList Abrir(String path) throws IOException {
        System.out.println("    ENTRA");
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        archivo = new File(path);
        System.out.println("CREA EL ARCHIVO");
       // Universo universoAhora = new Universo(archivo.getName());
        ArrayList<SeresVivos> seres = new ArrayList();
        System.out.println("aqui estoy");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);
        System.out.println(archivo.getName());
        Scanner sc = null;
        if (archivo.exists()) {
            seresVivos = new ArrayList();
            
            System.out.println("estoy aqui");
            String texto = br.readLine();
            System.out.println(texto);
            String [] datos  = texto.split("\\|");
            
            System.out.println(datos.length);
            for (int i = 0; i < datos.length; i++) {
                seresVivos.add(new SeresVivos(
                        datos[i], Integer.parseInt(datos[i+1]),
                       Integer.parseInt(datos[i+2]), datos[i+3]));
                i = i+3;
                System.out.println(seresVivos.get(seresVivos.size() -1));
            } // fin del for
            
            
            return seresVivos;
        }
        /*try {
                    seresVivos=new ArrayList();
                    sc = new Scanner(archivo);
                    sc.useDelimiter("\\|");
                    System.out.println("entre");
                   
                    while (sc.hasNext()) {
                        System.out.println(sc.next());
                    }
                    sc.close();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
         */

        try {
            br.close();
            fr.close();
        } catch (Exception e) {
        }

        ArrayList <SeresVivos> n = new ArrayList();
        return n ;
    }
}// fin de la clase
