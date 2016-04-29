/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abd.p1.view;

import abd.p1.controller.UsuarioController;
import abd.p1.dao.UsuarioDAOImpl;
import abd.p1.model.Usuario;
import javax.swing.JOptionPane;


/**
 *
 * @author Guilherme
 */
public class PrincipalJFrame extends javax.swing.JFrame {
	
	private Usuario usr;
	private UsuarioController uCtrl = null;
    
    public PrincipalJFrame(Usuario usr, UsuarioController uCtrl) {
    	initComponents();
    	this.usr = usr;
    	this.uCtrl = uCtrl;
    	//TODO
    }
    
    /**
     * Creates new form Principal
     */
    public PrincipalJFrame() {
    	/*
        UsuarioDAOImpl dao = null;
        Usuario user = new Usuario();
        
        initComponents();
        InicioSesionJDialog diag = new InicioSesionJDialog(this, true);
        diag.setVisible(true);
        jTabbedPane2.setTitleAt(0, "Usuarios");
        jTabbedPane2.setTitleAt(1, "Preguntas");
        
        if (diag.isAceptar()){
            user = dao.findByEmail(diag.getTextFieldCorreo().getText());
                if(user.getNombre() != null){
                    diag.setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(diag,
                    "Usuario no esta registrado.",
                    "Error de usuario",
                    JOptionPane.ERROR_MESSAGE);
                }
        }else if (diag.isNuevoUsuario()){
            diag.setVisible(false);
            user.setNombre(null);
                if(user.getNombre() != null){
                   JOptionPane.showMessageDialog(this,
                   "Usuario ya esta registrado.",
                   "Usuario registrado",
                   JOptionPane.ERROR_MESSAGE);
               }else {
                    
                    EditarPerfil perfil = new EditarPerfil(this,true);
                    perfil.setVisible(true);
               }
        }
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        listaUsuariosPanel2 = new abd.p1.view.ListaUsuariosPanel(usr, uCtrl);
        listaPreguntasPanel2 = new abd.p1.view.ListaPreguntasPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.addTab("Usuarios", listaUsuariosPanel2);
        jTabbedPane2.addTab("Preguntas", listaPreguntasPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane2;
    private abd.p1.view.ListaPreguntasPanel listaPreguntasPanel2;
    private abd.p1.view.ListaUsuariosPanel listaUsuariosPanel2;
    // End of variables declaration//GEN-END:variables
}
