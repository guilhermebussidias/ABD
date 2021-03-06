/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abd.p1.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;

/**
 *
 * @author Guilherme
 */
public class RelevanciaPanel extends javax.swing.JPanel {

    /**
     * Creates new form RelevanciaPanel
     */
    public RelevanciaPanel() {
        initComponents();
        sliderRelevancia.setMaximum(10);
        sliderRelevancia.setMinimum(0);
        //Valores para mostrar regla
        sliderRelevancia.setValue(0); //Empieza en el 0
        sliderRelevancia.setMinorTickSpacing(1);
        sliderRelevancia.setMajorTickSpacing(5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sliderRelevancia = new javax.swing.JSlider();
        labelRelevancia = new javax.swing.JLabel();
        buttonResponder = new javax.swing.JButton();
        buttonInivitarAmigo = new javax.swing.JButton();

        sliderRelevancia.setPaintLabels(true);
        sliderRelevancia.setPaintTicks(true);
        sliderRelevancia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelRelevancia.setText("Relevancia:");

        buttonResponder.setText("Responder");

        buttonInivitarAmigo.setText("Invitar a un amigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRelevancia)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderRelevancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(buttonResponder)
                        .addGap(69, 69, 69)
                        .addComponent(buttonInivitarAmigo)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRelevancia)
                    .addComponent(sliderRelevancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonResponder)
                    .addComponent(buttonInivitarAmigo))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getButtonInivitarAmigo() {
        return buttonInivitarAmigo;
    }

    public JButton getButtonResponder() {
        return buttonResponder;
    }

    public JLabel getLabelRelevancia() {
        return labelRelevancia;
    }

    public JSlider getSliderRelevancia() {
        return sliderRelevancia;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInivitarAmigo;
    private javax.swing.JButton buttonResponder;
    private javax.swing.JLabel labelRelevancia;
    private javax.swing.JSlider sliderRelevancia;
    // End of variables declaration//GEN-END:variables
}
