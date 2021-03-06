/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abd.p1.view;

import abd.p1.controller.ControllersFacade;
import abd.p1.controller.UsuarioController;
import abd.p1.model.Usuario;

/**
 *
 * @author Guilherme
 */
public class BusquedaPanel extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Boolean filtrar;
    String filtrarUsuario;

	private Usuario usr;
	private UsuarioController uCtrl;
	
	public BusquedaPanel(Usuario usr, UsuarioController uCtrl) {
        initComponents();
		this.usr = usr;
		this.uCtrl = uCtrl;
	}
    /**
     * Creates new form BusquedaPanel
     */
    public BusquedaPanel() {
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

        checkboxFiltrar = new javax.swing.JCheckBox();
        textFieldFiltrar = new javax.swing.JTextField();
        checkboxAmigos = new javax.swing.JCheckBox();

        checkboxFiltrar.setText("Filtrar por nombre:");
        checkboxFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxFiltrarActionPerformed(evt);
            }
        });

        textFieldFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFiltrarActionPerformed(evt);
            }
        });

        checkboxAmigos.setText("Mostrar sólo amigos");
        checkboxAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxAmigosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkboxFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkboxAmigos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxFiltrar)
                    .addComponent(textFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkboxAmigos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxFiltrarActionPerformed
       filtrar = true;
    }//GEN-LAST:event_checkboxFiltrarActionPerformed

    private void textFieldFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFiltrarActionPerformed
        filtrarUsuario = textFieldFiltrar.getText().trim();
        if (!filtrarUsuario.equals("") && checkboxFiltrar.isSelected()) {
        	PrincipalJFrame f = (PrincipalJFrame)this.getTopLevelAncestor();
        	Usuario usr = f.getUser();
            ControllersFacade.getInstance().listUsers(usr, filtrarUsuario, checkboxAmigos.isSelected());
        }
    }//GEN-LAST:event_textFieldFiltrarActionPerformed

    private void checkboxAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxAmigosActionPerformed
    	
    }//GEN-LAST:event_checkboxAmigosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkboxAmigos;
    private javax.swing.JCheckBox checkboxFiltrar;
    private javax.swing.JTextField textFieldFiltrar;
    // End of variables declaration//GEN-END:variables
}
