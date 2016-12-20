/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controller.Controller;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIEL Y ROGER
 */
public class vistaLogin extends javax.swing.JFrame {
    
        Controller login = new Controller();
        int errores = 3;
    /**
     * Creates new form vistaLogin
     */
    public vistaLogin() {
        initComponents();
        this.usuPassIncorrectos.setVisible(false);
        String intentosString = "Intentos restantes: " + String.valueOf(errores) + ".";
        this.intentosJText.setText(intentosString);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tnombre = new javax.swing.JTextField();
        btentrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tpass2 = new javax.swing.JPasswordField();
        usuPassIncorrectos = new javax.swing.JLabel();
        intentosJText = new javax.swing.JLabel();
        intentosJText2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btentrar.setText("Entrar");
        btentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btentrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Password");

        usuPassIncorrectos.setForeground(new java.awt.Color(255, 0, 51));
        usuPassIncorrectos.setText("Usuario o contraseña incorrectos :(");

        intentosJText2.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btentrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intentosJText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(tpass2))))
                        .addContainerGap(221, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuPassIncorrectos)
                            .addComponent(intentosJText2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tpass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(intentosJText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuPassIncorrectos)
                .addGap(15, 15, 15)
                .addComponent(intentosJText2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btentrar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btentrarActionPerformed
        // TODO add your handling code here:
        String usuario = this.tnombre.getText();        
        char clave[]=this.tpass2.getPassword();

        String clavedef = new String(clave);
        
      
        
        if(login.login(usuario, clavedef)==1){
            this.dispose();
           
            //JOptionPane.showMessageDialog(null, "SI");
            
            VistaInicio appinicio = new VistaInicio();

            appinicio.setVisible(true);
            
        }else{
            
            //JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos :(");
            this.usuPassIncorrectos.setVisible(true);
            errores = errores - 1;
            if (errores > 1) {
                String intentosString = "Intentos restantes: " + String.valueOf(errores) + ".";
            this.intentosJText.setText(intentosString);
            }else if(errores == 1){
            String intentosString = "Te queda un intento.";
            String intentosString2 = " ¡EL PROGRAMA SE CERRARÁ SI FALLAS!!.";
            this.intentosJText.setText(intentosString);
            this.intentosJText2.setText(intentosString2);
            }else {
                System.exit(1);
            }
        }
    }//GEN-LAST:event_btentrarActionPerformed

    private void vistaLoginActionPerformed(KeyEvent evt) {
		
		// Si la tecla presionada es el ENTER (KeyCode = 10) enviamos el mensaje
		if (evt.getKeyCode()==10){
                    String usuario = this.tnombre.getText();        
                    char clave[]=this.tpass2.getPassword();

                    String clavedef = new String(clave);



                    if(login.login(usuario, clavedef)==1){
                        this.dispose();

                        //JOptionPane.showMessageDialog(null, "SI");

                        VistaInicio appinicio = new VistaInicio();

                        appinicio.setVisible(true);

                    }else{

                        //JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos :(");
                        this.usuPassIncorrectos.setVisible(true);
                    }
                }
	}
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
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btentrar;
    private javax.swing.JLabel intentosJText;
    private javax.swing.JLabel intentosJText2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tnombre;
    private javax.swing.JPasswordField tpass2;
    private javax.swing.JLabel usuPassIncorrectos;
    // End of variables declaration//GEN-END:variables
}