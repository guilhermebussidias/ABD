/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abd.p1.view;

import java.util.Calendar;

import abd.p1.model.Usuario;

/**
 *
 * @author Guilherme
 */
public class UsuarioPanel extends javax.swing.JPanel {
    
    private String nombre = "pepe";
    private int edad = 32;
    private boolean editable = true;
    
    private Usuario usr;

    /**
     * Creates new form ListaUsuariosPanel
     */
    public UsuarioPanel() {
        initComponents();
    }
    
    public void redraw() {
    	PrincipalJFrame f = (PrincipalJFrame)this.getTopLevelAncestor();
    	usr = f.getUser();
        labelNombre.setText(usr.getNombre());
        
        Calendar birthDay = Calendar.getInstance();
        birthDay.setTimeInMillis(usr.getFechaNacimiento().getTime());
        long currentTime = System.currentTimeMillis();
        Calendar now = Calendar.getInstance();
        now.setTimeInMillis(currentTime);
        int years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
        labelEdad.setText(years + "años");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatarPanel1 = new abd.p1.view.AvatarPanel();
        labelNombre = new javax.swing.JLabel();
        buttonNombre = new javax.swing.JButton();
        labelEdad = new javax.swing.JLabel();
        buttonFechaNacimiento = new javax.swing.JButton();
        buttonAvatar = new javax.swing.JButton();

        avatarPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout avatarPanel1Layout = new javax.swing.GroupLayout(avatarPanel1);
        avatarPanel1.setLayout(avatarPanel1Layout);
        avatarPanel1Layout.setHorizontalGroup(
            avatarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        avatarPanel1Layout.setVerticalGroup(
            avatarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        labelNombre.setText("Nombre");

        buttonNombre.setText("Cambiar nombre");
        buttonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNombreActionPerformed(evt);
            }
        });

        labelEdad.setText("Edad");

        buttonFechaNacimiento.setText("Cambiar fecha de nacimiento");
        buttonFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFechaNacimientoActionPerformed(evt);
            }
        });

        buttonAvatar.setText("Cambiar avatar");
        buttonAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAvatarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(labelEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(buttonNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEdad)
                            .addComponent(buttonFechaNacimiento)))
                    .addComponent(avatarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(buttonAvatar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNombreActionPerformed

    private void buttonAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAvatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAvatarActionPerformed

    private void buttonFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFechaNacimientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abd.p1.view.AvatarPanel avatarPanel1;
    private javax.swing.JButton buttonAvatar;
    private javax.swing.JButton buttonFechaNacimiento;
    private javax.swing.JButton buttonNombre;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
        labelNombre.setText(nombre);
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
        labelEdad.setText(edad + "años");
    }

    /**
     * @return the editable
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     * @param editable the editable to set
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
        buttonNombre.setVisible(editable);
        buttonFechaNacimiento.setVisible(editable);
        buttonAvatar.setVisible(editable);
        
        redraw();
    }

    /**
     * @return the NombreLabel
     */
    public javax.swing.JLabel getNombreLabel() {
        return labelNombre;
    }

    /**
     * @param NombreLabel the NombreLabel to set
     */
    public void setNombreLabel(javax.swing.JLabel NombreLabel) {
        this.labelNombre = NombreLabel;
    }
}
