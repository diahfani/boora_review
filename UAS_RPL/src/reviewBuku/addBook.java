/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewBuku;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Admin
 */
public class addBook extends javax.swing.JFrame {
    
   
    
    public addBook() {
        initComponents();
        this.setLocationRelativeTo(null);
        getConnection();
            
    }
    
    String ImgPath=null;
    
    public final Connection getConnection(){
        Connection con = null;
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/user_boora","root","");
        return con;
        }catch(SQLException ex){
            Logger.getLogger(addBook.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Not connected");
            return null;
        }
    }
    
    public boolean checkInputs(){
        if(jTextField_judul.getText() == null || jTextField_tahun.getText() == null || jTextField_author.getText() == null
           || jTextField_genre.getText() == null || jTextArea_desc.getText() == null )
        {
         return false;   
        }else{
            try{
                Integer.parseInt(jTextField_tahun.getText());
                return true;
            }catch(NumberFormatException ex){
                return false;
            }
        }
    }
    
    //resize cover 
    
    public ImageIcon ResizeImage(String ImgPath, byte[] pic){
        ImageIcon cover = null;
        
        if(ImgPath!=null){
            cover = new ImageIcon(ImgPath);
        } else{
            cover = new ImageIcon(pic);
        }
        
        Image img = cover.getImage();
        Image img2 = img.getScaledInstance(lbl_cover.getWidth(), lbl_cover.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        homepage1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField_judul = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField_tahun = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField_genre = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_desc = new javax.swing.JTextArea();
        jTextField_author = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton_cover = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton_submit = new javax.swing.JButton();
        lbl_cover = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel_bookmark = new javax.swing.JPanel();
        jLabel_bookmark = new javax.swing.JLabel();
        jPanel_homepage = new javax.swing.JPanel();
        jLabel_homepage = new javax.swing.JLabel();
        jPanel_addbook = new javax.swing.JPanel();
        jLabel_addbook = new javax.swing.JLabel();

        jTextField3.setText("jTextField1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel22.setText("jLabel22");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homepage1.setBackground(new java.awt.Color(220, 220, 220));
        homepage1.setForeground(new java.awt.Color(220, 220, 220));
        homepage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepageMouseClicked(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(220, 220, 220));
        jScrollPane2.setForeground(new java.awt.Color(220, 220, 220));

        jPanel4.setBackground(new java.awt.Color(220, 220, 220));
        jPanel4.setMaximumSize(new java.awt.Dimension(455, 655));
        jPanel4.setPreferredSize(new java.awt.Dimension(900, 800));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jLabel14.setText("Tahun Terbit");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jLabel15.setText("Judul Buku");

        jTextField_judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_judulActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jLabel17.setText("Nama Pengarang");

        jTextField_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tahunActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jLabel18.setText("Genre Buku");

        jTextArea_desc.setColumns(20);
        jTextArea_desc.setRows(5);
        jScrollPane6.setViewportView(jTextArea_desc);

        jTextField_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_authorActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jLabel19.setText("Deskripsi Buku");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jLabel23.setText("Cover Buku");

        jButton_cover.setText("Upload Cover");
        jButton_cover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_coverActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jLabel24.setText("Tambah buku yang ingin di review");

        jButton_submit.setText("Submit");
        jButton_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_author, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_cover)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cover, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton_submit)))))
                .addGap(309, 309, 309))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jButton_cover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_cover, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton_submit)
                .addGap(76, 76, 76))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout homepage1Layout = new javax.swing.GroupLayout(homepage1);
        homepage1.setLayout(homepage1Layout);
        homepage1Layout.setHorizontalGroup(
            homepage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        );
        homepage1Layout.setVerticalGroup(
            homepage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepage1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(86, 112, 130));
        jPanel1.setForeground(new java.awt.Color(166, 166, 194));

        jLabel1.setFont(new java.awt.Font("Forte", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 196, 196));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesrc/book3.png"))); // NOI18N
        jLabel1.setText("Boora");

        jPanel3.setBackground(new java.awt.Color(129, 169, 195));
        jPanel3.setForeground(new java.awt.Color(255, 153, 153));

        jPanel_bookmark.setBackground(new java.awt.Color(129, 169, 195));
        jPanel_bookmark.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_bookmark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_bookmarkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_bookmarkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_bookmarkMouseExited(evt);
            }
        });

        jLabel_bookmark.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bookmark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesrc/bookmark2.png"))); // NOI18N
        jLabel_bookmark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_bookmarkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_bookmarkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_bookmarkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_bookmarkLayout = new javax.swing.GroupLayout(jPanel_bookmark);
        jPanel_bookmark.setLayout(jPanel_bookmarkLayout);
        jPanel_bookmarkLayout.setHorizontalGroup(
            jPanel_bookmarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_bookmarkLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel_bookmark, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel_bookmarkLayout.setVerticalGroup(
            jPanel_bookmarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_bookmark, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        jPanel_homepage.setBackground(new java.awt.Color(129, 169, 195));
        jPanel_homepage.setForeground(new java.awt.Color(129, 169, 195));
        jPanel_homepage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_homepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_homepageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_homepageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_homepageMouseExited(evt);
            }
        });

        jLabel_homepage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_homepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesrc/homepage.png"))); // NOI18N
        jLabel_homepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_homepageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_homepageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_homepageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_homepageLayout = new javax.swing.GroupLayout(jPanel_homepage);
        jPanel_homepage.setLayout(jPanel_homepageLayout);
        jPanel_homepageLayout.setHorizontalGroup(
            jPanel_homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_homepageLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel_homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel_homepageLayout.setVerticalGroup(
            jPanel_homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_homepage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_addbook.setBackground(new java.awt.Color(129, 169, 195));
        jPanel_addbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_addbook.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel_addbookFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel_addbookFocusLost(evt);
            }
        });
        jPanel_addbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_addbookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_addbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_addbookMouseExited(evt);
            }
        });

        jLabel_addbook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_addbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesrc/addbook2.png"))); // NOI18N
        jLabel_addbook.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel_addbookFocusGained(evt);
            }
        });
        jLabel_addbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_addbookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_addbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_addbookMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_addbookLayout = new javax.swing.GroupLayout(jPanel_addbook);
        jPanel_addbook.setLayout(jPanel_addbookLayout);
        jPanel_addbookLayout.setHorizontalGroup(
            jPanel_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_addbookLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel_addbookLayout.setVerticalGroup(
            jPanel_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_addbook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_homepage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_bookmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bookmark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_homepage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_addbook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(370, 370, 370))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homepage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homepage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 519, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_submitActionPerformed
        String judul = jTextField_judul.getText();
        String tahun_terbit = jTextField_tahun.getText();
        String author = jTextField_author.getText();
        String genre = jTextField_genre.getText();
        String deskripsi = jTextArea_desc.getText();
        
        if(checkInputs() && ImgPath != null){
           if(!checkBooks(judul)){
            try {
                 Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO books(judul, tahun_terbit, author, genre, deskripsi, cover)" + "values (?,?,?,?,?,?)");
               
                ps.setString(1, judul);
                ps.setString(2, tahun_terbit);
                ps.setString(3, author);
                ps.setString(4, genre);
                ps.setString(5, deskripsi);
                
                InputStream img = new FileInputStream(new File(ImgPath));
                ps.setBlob(6, img);
                ps.executeUpdate();
               
                if(ps.executeUpdate()!=0){
                 JOptionPane.showMessageDialog(null,"Data berhasil disimpan");
                }else {
                        JOptionPane.showMessageDialog(null, "Buku sudah pernah ditambahkan");
                    }
            } catch (HeadlessException | FileNotFoundException | SQLException ex) {
                Logger.getLogger(addBook.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } 
            }
        }
    }//GEN-LAST:event_jButton_submitActionPerformed

        public boolean checkBooks(String judul){
        PreparedStatement ps;
        ResultSet rs;
        boolean books_exist = false;
        
        String query = "SELECT * FROM `books` WHERE `judul` = ?";
        try {
            ps = connectionDatabase.getConnection().prepareStatement(query);
            ps.setString(1, judul);
            rs = ps.executeQuery();
            
            if(rs.next()){
                books_exist = true;
                JOptionPane.showMessageDialog(null, "Buku ini sudah ditambahkan","Tidak bisa menambah buku",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
       return books_exist;
    } 
    
    
      public ArrayList<books> getBooksList()
      {
            ArrayList<books> productList = new ArrayList<books>();
            Connection con = getConnection();
            Statement st;
            ResultSet rs;
            
        try {            
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM `books`");
            books buku;
            
            while(rs.next())
            {
                 buku = new books(rs.getInt("id_buku"), rs.getString("judul"), rs.getInt("tahun_terbit"), rs.getString("author"), rs.getString("genre"), rs.getString("deskripsi"), rs.getBytes("cover"));
                 productList.add(buku);  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(addBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productList;
    }
   
    
     
     
    private void jTextField_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tahunActionPerformed

    private void jTextField_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_authorActionPerformed

    private void jButton_coverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_coverActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile =  file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lbl_cover.setIcon(ResizeImage(path, null));
            ImgPath = path;
        } else {
            JOptionPane.showMessageDialog(null,"Tidak ada file yang dipilih");
        }
       
    }//GEN-LAST:event_jButton_coverActionPerformed

    private void homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_homepageMouseClicked

    private void jLabel_bookmarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_bookmarkMouseClicked
        bookmark bm = new bookmark();
        bm.setVisible(true);
        bm.pack();
        bm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_bookmarkMouseClicked

    private void jPanel_bookmarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_bookmarkMouseClicked
        bookmark bm = new bookmark();
        bm.setVisible(true);
        bm.pack();
        bm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jPanel_bookmarkMouseClicked

    private void jPanel_bookmarkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_bookmarkMouseEntered
        // TODO add your handling code here:
        jPanel_bookmark.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jPanel_bookmarkMouseEntered

    private void jPanel_bookmarkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_bookmarkMouseExited
        // TODO add your handling code here:
        jPanel_bookmark.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jPanel_bookmarkMouseExited

    private void jPanel_homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_homepageMouseEntered
        // TODO add your handling code here:
        jPanel_homepage.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jPanel_homepageMouseEntered

    private void jPanel_homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_homepageMouseExited
        // TODO add your handling code here:
        jPanel_homepage.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jPanel_homepageMouseExited

    private void jLabel_addbookFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_addbookFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_addbookFocusGained

    private void jLabel_addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addbookMouseClicked
        addBook ab = new addBook();
        ab.setVisible(true);
        ab.pack();
        ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_addbookMouseClicked

    private void jPanel_addbookFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel_addbookFocusGained

    }//GEN-LAST:event_jPanel_addbookFocusGained

    private void jPanel_addbookFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel_addbookFocusLost

    }//GEN-LAST:event_jPanel_addbookFocusLost

    private void jPanel_addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_addbookMouseClicked
        addBook ab = new addBook();
        ab.setVisible(true);
        ab.pack();
        ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jPanel_addbookMouseClicked

    private void jPanel_addbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_addbookMouseEntered
        // TODO add your handling code here:
        jPanel_addbook.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jPanel_addbookMouseEntered

    private void jPanel_addbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_addbookMouseExited
        // TODO add your handling code here:
        jPanel_addbook.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jPanel_addbookMouseExited

    private void jLabel_homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_homepageMouseClicked
        // TODO add your handling code here:
        mainMenu mm = new mainMenu();
        mm.setVisible(true);
        mm.pack();
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_homepageMouseClicked

    private void jPanel_homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_homepageMouseClicked
        // TODO add your handling code here:
        mainMenu mm = new mainMenu();
        mm.setVisible(true);
        mm.pack();
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jPanel_homepageMouseClicked

    private void jLabel_homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_homepageMouseEntered
        // TODO add your handling code here:
        jPanel_homepage.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jLabel_homepageMouseEntered

    private void jLabel_homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_homepageMouseExited
        // TODO add your handling code here:
        jPanel_homepage.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jLabel_homepageMouseExited

    private void jLabel_bookmarkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_bookmarkMouseEntered
        // TODO add your handling code here:
        jPanel_bookmark.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jLabel_bookmarkMouseEntered

    private void jLabel_bookmarkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_bookmarkMouseExited
        // TODO add your handling code here:
        jPanel_bookmark.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jLabel_bookmarkMouseExited

    private void jLabel_addbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addbookMouseEntered
        // TODO add your handling code here:
         jPanel_addbook.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jLabel_addbookMouseEntered

    private void jLabel_addbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addbookMouseExited
        // TODO add your handling code here:
         jPanel_addbook.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jLabel_addbookMouseExited

    private void jTextField_judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_judulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_judulActionPerformed

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
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homepage1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_cover;
    private javax.swing.JButton jButton_submit;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel_addbook;
    private javax.swing.JLabel jLabel_bookmark;
    private javax.swing.JLabel jLabel_homepage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_addbook;
    private javax.swing.JPanel jPanel_bookmark;
    private javax.swing.JPanel jPanel_homepage;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea_desc;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField_author;
    private javax.swing.JTextField jTextField_genre;
    private javax.swing.JTextField jTextField_judul;
    private javax.swing.JTextField jTextField_tahun;
    private javax.swing.JLabel lbl_cover;
    // End of variables declaration//GEN-END:variables


}
