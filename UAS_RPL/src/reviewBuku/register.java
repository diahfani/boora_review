/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewBuku;

/**
 *
 * @author Admin
 */
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.JFrame;
import javax.swing.border.Border;
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_lk);
        bg.add(jRadioButton_pr);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1_nama = new javax.swing.JTextField();
        jTextField1_date = new javax.swing.JTextField();
        jTextField2_username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1_register = new javax.swing.JButton();
        jLabel8_login = new javax.swing.JLabel();
        jRadioButton_pr = new javax.swing.JRadioButton();
        jRadioButton_lk = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(129, 169, 195));

        jLabel_title.setFont(new java.awt.Font("Forte", 1, 60)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(91, 78, 78));
        jLabel_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesrc/book2.png"))); // NOI18N
        jLabel_title.setText("Boora");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(122, 104, 104));
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(122, 104, 104));
        jLabel2.setText("Nama lengkap");

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(122, 104, 104));
        jLabel3.setText("Jenis Kelamin");

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(122, 104, 104));
        jLabel4.setText("Tanggal lahir");

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(122, 104, 104));
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(122, 104, 104));
        jLabel6.setText("Password");

        jTextField1_nama.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1_nama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1_namaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_namaFocusLost(evt);
            }
        });

        jTextField1_date.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1_date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1_dateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_dateFocusLost(evt);
            }
        });
        jTextField1_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_dateKeyTyped(evt);
            }
        });

        jTextField2_username.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2_usernameFocusLost(evt);
            }
        });

        jPasswordField1.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jButton1_register.setBackground(new java.awt.Color(77, 107, 174));
        jButton1_register.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1_register.setForeground(new java.awt.Color(215, 219, 224));
        jButton1_register.setText("Sign up");
        jButton1_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_registerActionPerformed(evt);
            }
        });

        jLabel8_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8_login.setForeground(new java.awt.Color(15, 109, 109));
        jLabel8_login.setText("Sudah punya akun? Sign in disini!");
        jLabel8_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8_loginMouseExited(evt);
            }
        });

        jRadioButton_pr.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton_pr.setText("Perempuan");
        jRadioButton_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_prActionPerformed(evt);
            }
        });

        jRadioButton_lk.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton_lk.setText("Laki-laki");

        jLabel8.setForeground(new java.awt.Color(122, 104, 104));
        jLabel8.setText("Format : YYYY-MM-DD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(26, 26, 26)
                            .addComponent(jRadioButton_pr)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton_lk, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jTextField1_date, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(jTextField2_username, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_title)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel8_login))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton1_register, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel_title)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton_pr)
                    .addComponent(jRadioButton_lk))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8_login)
                .addGap(30, 30, 30)
                .addComponent(jButton1_register, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_namaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_namaFocusGained
       
    }//GEN-LAST:event_jTextField1_namaFocusGained

    private void jTextField1_namaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_namaFocusLost
        
    }//GEN-LAST:event_jTextField1_namaFocusLost

    private void jTextField1_dateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_dateFocusGained
      
    }//GEN-LAST:event_jTextField1_dateFocusGained

    private void jTextField1_dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_dateFocusLost
       
    }//GEN-LAST:event_jTextField1_dateFocusLost

    private void jTextField2_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2_usernameFocusGained
       
    }//GEN-LAST:event_jTextField2_usernameFocusGained

    private void jTextField2_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2_usernameFocusLost
         
    }//GEN-LAST:event_jTextField2_usernameFocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
      
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
       
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jLabel8_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8_loginMouseEntered
        Border label_border = BorderFactory.createMatteBorder(0,0,1,0, Color.DARK_GRAY);
        jLabel8_login.setBorder(label_border);
    }//GEN-LAST:event_jLabel8_loginMouseEntered

    private void jLabel8_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8_loginMouseExited
       Border label_create_border = BorderFactory.createMatteBorder(0,0,1,0, Color.LIGHT_GRAY);
        jLabel8_login.setBorder(null);
    }//GEN-LAST:event_jLabel8_loginMouseExited

    private void jLabel8_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8_loginMouseClicked
        login lg = new login();
        lg.setVisible(true);
        lg.pack();
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel8_loginMouseClicked

    public boolean checkUsername(String username){
        PreparedStatement ps;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `users` WHERE `username` = ?";
        try {
            ps = connectionDatabase.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            if(rs.next()){
                username_exist = true;
                JOptionPane.showMessageDialog(null, "Username ini sudah dipakai","Username gagal",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
       return username_exist;
    } 
    
    public boolean verifyFields(){
        
        String nama_lengkap = jTextField1_nama.getText();
        String username = jTextField2_username.getText();
        String tgl_lahir = jTextField1_date.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        
        if(nama_lengkap.trim().equals("") || username.trim().equals("") || tgl_lahir.trim().equals("") || password.trim().equals(""))
        {
           JOptionPane.showMessageDialog(null, "Ada data yang belum diisi", "Error Register",2);
           return false;
        } else {
            return true;
        }
    }         
    
    
    private void jButton1_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_registerActionPerformed
        String nama_lengkap = jTextField1_nama.getText();
        String username = jTextField2_username.getText();
        String tgl_lahir = jTextField1_date.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        String gender = "Laki-laki";
        
        if(jRadioButton_pr.isSelected()){
            gender="Perempuan";
        }
        
        if(verifyFields())
        {
            if(!checkUsername(username))
            {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `users`(`nama`, `jeniskelamin`, `tgl_lahir`, `username`, `password`) VALUES (?,?,?,?,?)"; 
            
                try {
                    ps = connectionDatabase.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, nama_lengkap);
                    ps.setString(2, gender);
                    ps.setString(3, tgl_lahir);
                    ps.setString(4, username);
                    ps.setString(5, password);
                
                    if(ps.executeUpdate()!=0){
                        JOptionPane.showMessageDialog(null, "Akun Anda sudah dibuat. Silahkan kembali ke halaman Sign in");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Silahkan cek data Anda");
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   
            
        }
       
    }//GEN-LAST:event_jButton1_registerActionPerformed

    private void jTextField1_dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_dateKeyTyped
      
        
    }//GEN-LAST:event_jTextField1_dateKeyTyped

    private void jRadioButton_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_prActionPerformed

   
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8_login;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButton jRadioButton_lk;
    private javax.swing.JRadioButton jRadioButton_pr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1_date;
    private javax.swing.JTextField jTextField1_nama;
    private javax.swing.JTextField jTextField2_username;
    // End of variables declaration//GEN-END:variables
}
