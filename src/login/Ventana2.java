/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Alumno
 */
public class Ventana2 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana2
     */
    public Ventana2() {
        initComponents();
    }
    // agragar imagenes segundo metodo 
    String ruta = "";
    URL url = null;
    ImageIcon icon = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JPanel();
        lblOpcion = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOpcion.setText("Seleccione la opccion ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "WhatsAppp", "Instagram ", "Snaph", "Facebook", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnMostrarLayout = new javax.swing.GroupLayout(btnMostrar);
        btnMostrar.setLayout(btnMostrarLayout);
        btnMostrarLayout.setHorizontalGroup(
            btnMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnMostrarLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(btnMostrarLayout.createSequentialGroup()
                        .addComponent(lblOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 61, Short.MAX_VALUE))))
        );
        btnMostrarLayout.setVerticalGroup(
            btnMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        lblOpcion.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int op = jComboBox1.getSelectedIndex();
       

        switch (op) {
            case 0:
               
                JOptionPane.showMessageDialog(null, "numero 1", "opcion selecionada", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/was.png"));
                // lblOpcion.setText("Seleccionó la opcion 1");
                // primer metodo
                lblOpcion.setIcon(new ImageIcon("src/img/was.png"));
                lblOpcion.setText(null);
                
                break;
            case 1:JOptionPane.showMessageDialog(null, "numero 1", "opcion selecionada", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/insta.png"));
                // lblOpcion.setText("Seleccionó la opcion 2");
                lblOpcion.setIcon(new ImageIcon("src/img/insta.png"));
                lblOpcion.setText(null);
           
                break;
            case 2:
                
                JOptionPane.showMessageDialog(null, "numero 1", "opcion selecionada", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/es.png"));
                // lblOpcion.setText("Seleccionó la opcion 3");
                lblOpcion.setIcon(new ImageIcon("src/img/es.png"));
                lblOpcion.setText(null);
                 
                break;
            // segunda manera
            case 3:
                
                ruta = "/img/face.png";
                url = this.getClass().getResource(ruta);
                icon = new ImageIcon(url);
                lblOpcion.setIcon(icon);
                lblOpcion.setText(null);
                 
                break;

        }// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    public void mostrarImagen(String urlImagen, int opcion) {
        url = this.getClass().getResource(urlImagen);
        icon = new ImageIcon(url);
        lblOpcion.setIcon(icon);
        lblOpcion.setText("opcion: " + opcion );
    }
  // gat  
/*public void mostrarImagen(String urlImagen) {
        ruta = urlImagen;
        url = this.getClass().getResource(ruta);
        icon = new ImageIcon(url);
        lblOpcion.setIcon(icon);
        lblOpcion.setText(null);
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnMostrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblOpcion;
    // End of variables declaration//GEN-END:variables
}
