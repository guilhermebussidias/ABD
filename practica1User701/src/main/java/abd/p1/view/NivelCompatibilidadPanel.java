/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abd.p1.view;

/**
 *
 * @author Guilherme
 */
public class NivelCompatibilidadPanel extends javax.swing.JPanel {

    /**
     * Creates new form NivelCompatibilidadPanel
     */
    public NivelCompatibilidadPanel() {
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

        labelCompatibilidad = new javax.swing.JLabel();
        labelPorcentaje = new javax.swing.JLabel();

        labelCompatibilidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCompatibilidad.setText("Tu nivel de compatibilidad es de:");

        labelPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPorcentaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPorcentaje.setText("XX%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCompatibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addComponent(labelPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCompatibilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPorcentaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelCompatibilidad;
    private javax.swing.JLabel labelPorcentaje;
    // End of variables declaration//GEN-END:variables
}
