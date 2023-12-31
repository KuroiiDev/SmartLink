/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RegisterForm extends javax.swing.JFrame {
    /**
     * Creates new form LoginForm
     */
    public RegisterForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sigUserText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sigPassText = new javax.swing.JPasswordField();
        btnReg = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sigPassText1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0,0,0, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 50)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel3.setText("Username");

        sigUserText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sigUserText.setBorder(null);
        sigUserText.setNextFocusableComponent(sigPassText);

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel4.setText("Password");

        sigPassText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sigPassText.setBorder(null);
        sigPassText.setNextFocusableComponent(sigPassText1);
        sigPassText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sigPassTextKeyTyped(evt);
            }
        });

        btnReg.setBackground(new java.awt.Color(0, 255, 51));
        btnReg.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        btnReg.setText("Register!");
        btnReg.setBorderPainted(false);
        btnReg.setFocusPainted(false);
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0,0,0, 50));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 255, 255));
        jButton3.setText("Sudah Memiliki Akun? Klik Untuk Login");
        jButton3.setBorder(null);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel7.setText("Confirm Password");

        sigPassText1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sigPassText1.setBorder(null);
        sigPassText1.setNextFocusableComponent(sigUserText);
        sigPassText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sigPassText1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sigPassText)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sigUserText)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sigPassText1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sigUserText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sigPassText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sigPassText1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(73, 73, 73))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 600));

        jLabel6.setBackground(new java.awt.Color(0,0,0, 50));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo.png"))); // NOI18N
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 400, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/miku_png.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 400, 400));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bg_1.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        setSize(new java.awt.Dimension(1086, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LoginForm log = new LoginForm("");
        log.setVisible(true);
        close();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        if (sigPassText.getText().length()<5 || sigPassText.getText().length()>10){
            JOptionPane.showMessageDialog(this, "Password Minimal 5 digit, dan maksimal 10 digit!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else if (sigPassText1.getText().equals(sigPassText.getText())){
            if (checkUser()){
                try {
                    Connection conn = (Connection)conf.configDB();
                    String user = sigUserText.getText();
                    String pass = sigPassText.getText();
                    String sql = "INSERT INTO account (username, password) VALUES (?,?)";
                    PreparedStatement p = conn.prepareStatement(sql);
                    p.setString(1, user);
                    p.setString(2, pass);
                    p.executeUpdate();
                    p.close();
                    JOptionPane.showMessageDialog(this, "Akun Anda Telah Dibuat, Silahkan Login", "Success", JOptionPane.INFORMATION_MESSAGE);
                    LoginForm log = new LoginForm(user);
                    log.setVisible(true);
                    close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Terjadi Masalah!!", "Warning", JOptionPane.WARNING_MESSAGE);
                    System.out.println(e.getMessage());
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "Konfirmasi Password Tidak Sesuai!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnRegActionPerformed

    private void sigPassTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sigPassTextKeyTyped
        char c = evt.getKeyChar();
        if(c == ' '){
            evt.consume();
        }
    }//GEN-LAST:event_sigPassTextKeyTyped

    private void sigPassText1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sigPassText1KeyTyped
        char c = evt.getKeyChar();
        if(c == ' '){
            evt.consume();
        }
    }//GEN-LAST:event_sigPassText1KeyTyped
    private void close(){
        WindowEvent closeWin = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        getToolkit().getDefaultToolkit().getSystemEventQueue().postEvent(closeWin);
    }
    private boolean checkUser(){
        try {
            Connection conn = (Connection)conf.configDB();
            String user = sigUserText.getText();
            String sql = "SELECT * FROM account WHERE username='"+user+"'";
            
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (user.equalsIgnoreCase("admin")) {
                JOptionPane.showMessageDialog(this, "Username Terlarang!!", "Warning", JOptionPane.WARNING_MESSAGE);
                return false;
            }else if (rs.next()){
                JOptionPane.showMessageDialog(this, "Username Sudah Terdaftar!!", "Warning", JOptionPane.WARNING_MESSAGE);
                return false;
            }else{
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReg;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField sigPassText;
    private javax.swing.JPasswordField sigPassText1;
    private javax.swing.JTextField sigUserText;
    // End of variables declaration//GEN-END:variables
}
