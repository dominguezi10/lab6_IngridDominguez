/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_ingriddominguez;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 1234
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Universo = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreUniverso = new javax.swing.JTextField();
        btn_agregarU = new javax.swing.JButton();
        jd_SerVivo = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nombreSV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        js_anios = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        js_ki = new javax.swing.JSpinner();
        btn_guardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tf_planeta = new javax.swing.JTextField();
        jd_modificar = new javax.swing.JDialog();
        jcb_modificar = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_nombreSVM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        js_kiM = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        js_aniosM = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        tf_planetaM = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jd_Eliminar = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcb_Eliminar = new javax.swing.JComboBox<>();
        btn_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Archivo = new javax.swing.JMenu();
        jmi_Abrir = new javax.swing.JMenuItem();
        jmi_guardar = new javax.swing.JMenuItem();
        jm_Crear = new javax.swing.JMenu();
        jmi_Universo = new javax.swing.JMenuItem();
        jmi_SerVivo = new javax.swing.JMenuItem();
        jm_Modificar = new javax.swing.JMenu();
        jmi_Modificar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Crear Universo");

        jLabel3.setText("Nombre Universo");

        tf_nombreUniverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreUniversoActionPerformed(evt);
            }
        });

        btn_agregarU.setText("Agregar");
        btn_agregarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarUMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_UniversoLayout = new javax.swing.GroupLayout(jd_Universo.getContentPane());
        jd_Universo.getContentPane().setLayout(jd_UniversoLayout);
        jd_UniversoLayout.setHorizontalGroup(
            jd_UniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_UniversoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_UniversoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(tf_nombreUniverso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_UniversoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agregarU, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jd_UniversoLayout.setVerticalGroup(
            jd_UniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_UniversoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_UniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreUniverso, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(btn_agregarU, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_SerVivo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Crear Ser Vivo");
        jd_SerVivo.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 19, 179, 37));

        jLabel5.setText("Nombre Raza");
        jd_SerVivo.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 99, 30));
        jd_SerVivo.getContentPane().add(tf_nombreSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 67, 199, 30));

        jLabel6.setText("Numero de ki");
        jd_SerVivo.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 30));

        js_anios.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jd_SerVivo.getContentPane().add(js_anios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 60, 30));

        jLabel7.setText("Maximo de Años");
        jd_SerVivo.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 164, 90, 30));

        js_ki.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jd_SerVivo.getContentPane().add(js_ki, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 60, 30));

        btn_guardar.setText("Guardar");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jd_SerVivo.getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 90, 30));

        jLabel8.setText("Planeta");
        jd_SerVivo.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));
        jd_SerVivo.getContentPane().add(tf_planeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 190, 30));

        jd_modificar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcb_modificar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_modificarItemStateChanged(evt);
            }
        });
        jcb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_modificarActionPerformed(evt);
            }
        });
        jd_modificar.getContentPane().add(jcb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 193, 34));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Modificar Ser Vivo");
        jd_modificar.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 240, 30));

        jLabel10.setText("Ser Vivo");
        jd_modificar.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 90, 30));

        jLabel11.setText("Nombre");
        jd_modificar.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 99, 30));
        jd_modificar.getContentPane().add(tf_nombreSVM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 199, 30));

        jLabel12.setText("Numero de ki");
        jd_modificar.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 80, 30));

        js_kiM.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jd_modificar.getContentPane().add(js_kiM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 60, 30));

        jLabel13.setText("Maximo de Años");
        jd_modificar.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 90, 30));

        js_aniosM.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jd_modificar.getContentPane().add(js_aniosM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 60, 30));

        jLabel14.setText("Planeta");
        jd_modificar.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 90, 30));
        jd_modificar.getContentPane().add(tf_planetaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 190, 30));

        jButton1.setText("Modificar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jd_modificar.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 110, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Eliminar");

        jLabel16.setText("Ser Vivo");

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_EliminarLayout = new javax.swing.GroupLayout(jd_Eliminar.getContentPane());
        jd_Eliminar.getContentPane().setLayout(jd_EliminarLayout);
        jd_EliminarLayout.setHorizontalGroup(
            jd_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EliminarLayout.createSequentialGroup()
                .addGroup(jd_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_EliminarLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_EliminarLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jcb_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_EliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jd_EliminarLayout.setVerticalGroup(
            jd_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 104, 298, 105));

        jm_Archivo.setText("Archivo");

        jmi_Abrir.setText("Abrir");
        jmi_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AbrirActionPerformed(evt);
            }
        });
        jm_Archivo.add(jmi_Abrir);

        jmi_guardar.setText("Guardar");
        jmi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarActionPerformed(evt);
            }
        });
        jm_Archivo.add(jmi_guardar);

        jMenuBar1.add(jm_Archivo);

        jm_Crear.setText("Crear");

        jmi_Universo.setText("Universo");
        jmi_Universo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_UniversoActionPerformed(evt);
            }
        });
        jm_Crear.add(jmi_Universo);

        jmi_SerVivo.setText("Ser Vivo");
        jmi_SerVivo.setEnabled(false);
        jmi_SerVivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_SerVivoActionPerformed(evt);
            }
        });
        jm_Crear.add(jmi_SerVivo);

        jMenuBar1.add(jm_Crear);

        jm_Modificar.setText("Modificar");
        jm_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_ModificarActionPerformed(evt);
            }
        });

        jmi_Modificar.setText("Modificar Ser Vivo");
        jmi_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ModificarActionPerformed(evt);
            }
        });
        jm_Modificar.add(jmi_Modificar);

        jmi_eliminar.setText("Eliminar Ser Vivo");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        jm_Modificar.add(jmi_eliminar);

        jMenuBar1.add(jm_Modificar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_UniversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_UniversoActionPerformed
        // TODO add your handling code here:

        this.jd_Universo.setModal(true);
        jd_Universo.pack();
        jd_Universo.setLocationRelativeTo(this);
        jd_Universo.setVisible(true);


    }//GEN-LAST:event_jmi_UniversoActionPerformed

    private void tf_nombreUniversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreUniversoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreUniversoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_agregarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarUMouseClicked
        // TODO add your handling code here:
        String nombre = tf_nombreUniverso.getText();
        universo = new Universo(nombre);

        tf_nombreUniverso.setText("");
        jmi_Universo.setEnabled(false);
        jmi_SerVivo.setEnabled(true);
        System.out.println(universo);

        jd_Universo.dispose();
    }//GEN-LAST:event_btn_agregarUMouseClicked

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        // TODO add your handling code here:
        try {
            String nombre = tf_nombreSV.getText();
            int ki = (Integer) js_ki.getValue();
            int anios = (Integer) js_anios.getValue();
            String planeta = tf_planeta.getText();

            if (((nombre.length() != 0 && ki > 0) && anios > 0) && (planeta.length() != 0)) {

                universo.getSeresVivos().add(new SeresVivos(nombre, ki, anios, planeta));
                System.out.println(universo.getSeresVivos());

                DefaultComboBoxModel modelo = (DefaultComboBoxModel) jcb_modificar.getModel();
                modelo.addElement(universo.getSeresVivos().get(universo.getSeresVivos().size() - 1));
                jcb_modificar.setModel(modelo);
                jcb_Eliminar.setModel(modelo);

                tf_nombreSV.setText("");
                js_ki.setValue(0);
                js_anios.setValue(0);
                tf_planeta.setText("");

                JOptionPane.showMessageDialog(this, "Ser vivo agregado con exito");
            } else {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, sus datos no se guardaron");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void jmi_SerVivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_SerVivoActionPerformed
        // TODO add your handling code here:
        this.jd_SerVivo.setModal(true);
        jd_SerVivo.pack();
        jd_SerVivo.setLocationRelativeTo(this);
        jd_SerVivo.setVisible(true);
    }//GEN-LAST:event_jmi_SerVivoActionPerformed

    private void jcb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_modificarActionPerformed

    private void jcb_modificarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_modificarItemStateChanged
        // TODO add your handling code here:
        seleccionado = (SeresVivos) jcb_modificar.getSelectedItem();

        // int pos = jcb_modificar.getSelectedIndex();
        tf_nombreSVM.setText(seleccionado.getNombre());
        js_aniosM.setValue(seleccionado.getMaximoAnios());
        js_kiM.setValue(seleccionado.getKi());
        tf_planetaM.setText(seleccionado.getNombrePlaneta());

    }//GEN-LAST:event_jcb_modificarItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

        try {
            int pos = jcb_modificar.getSelectedIndex();

            ((SeresVivos) jcb_modificar.getSelectedItem()).setNombre(tf_nombreSVM.getText());
            ((SeresVivos) jcb_modificar.getSelectedItem()).setMaximoAnios((Integer) js_aniosM.getValue());
            ((SeresVivos) jcb_modificar.getSelectedItem()).setKi((Integer) js_kiM.getValue());
            ((SeresVivos) jcb_modificar.getSelectedItem()).setNombrePlaneta(tf_planetaM.getText());

            universo.getSeresVivos().get(pos).setKi((Integer) js_kiM.getValue());
            universo.getSeresVivos().get(pos).setNombre(tf_nombreSVM.getText());
            universo.getSeresVivos().get(pos).setMaximoAnios((Integer) js_aniosM.getValue());
            universo.getSeresVivos().get(pos).setNombrePlaneta(tf_planetaM.getText());

            JOptionPane.showMessageDialog(this, "Modificado con exito!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error");
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void jm_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_ModificarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jm_ModificarActionPerformed

    private void jmi_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ModificarActionPerformed
        // TODO add your handling code here:
        this.jd_modificar.setModal(true);
        jd_modificar.pack();
        jd_modificar.setLocationRelativeTo(this);
        jd_modificar.setVisible(true);
    }//GEN-LAST:event_jmi_ModificarActionPerformed

    private void jmi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarActionPerformed
        //esto
        /*try {
            // TODO add your handling code here:
            universo.escribirArchivo();
            System.out.println("Se creo el archivooooo !!!!!!!!!!!!!!!");
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        // no me funciona guarda las rutas 
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
            jfc.addChoosableFileFilter(filtro);

            int Seleccion = jfc.showSaveDialog(this);

            universo.Guardar(Seleccion, jfc);
            JOptionPane.showMessageDialog(this, "salio!");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jmi_guardarActionPerformed

    private void btn_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EliminarMouseClicked
        // TODO add your handling code here:
        int pos = jcb_Eliminar.getSelectedIndex();

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) jcb_modificar.getModel();
        modelo.removeElementAt(pos);
        jcb_modificar.setModel(modelo);
        jcb_Eliminar.setModel(modelo);
        universo.getSeresVivos().remove(pos);
        JOptionPane.showMessageDialog(this, "Elemento Eliminado Exitosamente!");
    }//GEN-LAST:event_btn_EliminarMouseClicked

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        // TODO add your handling code here:
        this.jd_Eliminar.setModal(true);
        jd_Eliminar.pack();
        jd_Eliminar.setLocationRelativeTo(this);
        jd_Eliminar.setVisible(true);
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AbrirActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("Archivo de texto", "txt");
            FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Imagenes", "jpg", "png", "bmp");

            jfc.setFileFilter(filtro1);// lo agrega
            jfc.addChoosableFileFilter(filtro2); // lo va añadiendo a la cola
            int seleccion = jfc.showOpenDialog(this);

            
            Universo tem  = universo.Abrir(seleccion, jfc);
            if(tem.getNombre().equals("-1")){
               
            }else{
                universo = universo.Abrir(seleccion, jfc);
                
                System.out.println(universo);
            }
            System.out.println("salio?");
            
            System.out.println(universo);
            
            
            
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jmi_AbrirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_agregarU;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox<String> jcb_Eliminar;
    private javax.swing.JComboBox<String> jcb_modificar;
    private javax.swing.JDialog jd_Eliminar;
    private javax.swing.JDialog jd_SerVivo;
    private javax.swing.JDialog jd_Universo;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JMenu jm_Archivo;
    private javax.swing.JMenu jm_Crear;
    private javax.swing.JMenu jm_Modificar;
    private javax.swing.JMenuItem jmi_Abrir;
    private javax.swing.JMenuItem jmi_Modificar;
    private javax.swing.JMenuItem jmi_SerVivo;
    private javax.swing.JMenuItem jmi_Universo;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_guardar;
    private javax.swing.JSpinner js_anios;
    private javax.swing.JSpinner js_aniosM;
    private javax.swing.JSpinner js_ki;
    private javax.swing.JSpinner js_kiM;
    private javax.swing.JTextField tf_nombreSV;
    private javax.swing.JTextField tf_nombreSVM;
    private javax.swing.JTextField tf_nombreUniverso;
    private javax.swing.JTextField tf_planeta;
    private javax.swing.JTextField tf_planetaM;
    // End of variables declaration//GEN-END:variables

    Universo universo;
    SeresVivos seleccionado;
}
