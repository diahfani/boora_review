/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewBuku;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class mainMenu extends javax.swing.JFrame {

    public mainMenu() {
        initComponents();
        getConnection();
        this.setLocationRelativeTo(null); 
        jTable();
        
        
        
        
    }
    public final Connection getConnection(){
        Connection con = null;
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/user_boora","root","");
        return con;
        }catch(SQLException ex){
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Not connected");
            return null;
        }
    }
    
     public void jTable(){
       addBook ab = new addBook();
       ArrayList<books> list = ab.getBooksList();
       String[] columnName = {"ID Buku", "Judul Buku", "Tahun Terbit", "Author", "Genre", "Deskripsi", "Foto"};
       Object[][] rows = new Object[list.size()][7];
       for (int i = 0; i < list.size(); i++){
           rows[i][0] = list.get(i).getIdBuku();
           rows[i][1] = list.get(i).getJudul();
           rows[i][2] = list.get(i).getTahunTerbit();
           rows[i][3] = list.get(i).getAuthor();
           rows[i][4] = list.get(i).getGenre();
           rows[i][5] = list.get(i).getDeskripsi();
           
           
           
           if(list.get(i).getCover() != null){
               
           ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getCover()).getImage().getScaledInstance(150,120,Image.SCALE_SMOOTH));
           rows[i][6] = image;
           } else{
               rows[i][6] = null;
           }
       }
       theModel model = new theModel(rows, columnName);
       tbl_books.setModel(model);
       tbl_books.setRowHeight(120);
       tbl_books.getColumnModel().getColumn(6).setPreferredWidth(150);
       
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel_homepage = new javax.swing.JPanel();
        jLabel_homepage = new javax.swing.JLabel();
        jPanel_bookmark = new javax.swing.JPanel();
        jLabel_bookmark = new javax.swing.JLabel();
        jPanel_addbook = new javax.swing.JPanel();
        jLabel_addbook = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        homepage = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_books = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(86, 112, 130));
        jPanel1.setForeground(new java.awt.Color(166, 166, 194));

        jPanel3.setBackground(new java.awt.Color(129, 169, 195));
        jPanel3.setForeground(new java.awt.Color(255, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(639, 74));

        jPanel_homepage.setBackground(new java.awt.Color(129, 169, 195));
        jPanel_homepage.setForeground(new java.awt.Color(129, 169, 195));
        jPanel_homepage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_homepage.addMouseListener(new java.awt.event.MouseAdapter() {
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
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel_homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel_homepageLayout.setVerticalGroup(
            jPanel_homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_homepage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel_bookmark, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel_bookmarkLayout.setVerticalGroup(
            jPanel_bookmarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_bookmark, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
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
                .addGap(68, 68, 68)
                .addComponent(jLabel_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
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
                .addGap(0, 0, 0)
                .addComponent(jPanel_homepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_bookmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bookmark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_homepage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_addbook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Forte", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 196, 196));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesrc/book3.png"))); // NOI18N
        jLabel1.setText("Boora");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        homepage.setBackground(new java.awt.Color(220, 220, 220));
        homepage.setForeground(new java.awt.Color(220, 220, 220));
        homepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepageMouseClicked(evt);
            }
        });

        tbl_books.setAutoCreateRowSorter(true);
        tbl_books.setBackground(new java.awt.Color(220, 220, 220));
        tbl_books.setForeground(new java.awt.Color(102, 102, 102));
        tbl_books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Buku", "Judul", "Tahun Terbit", "Author", "Genre", "Deskripsi", "Cover"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_books.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_books.setFocusable(false);
        tbl_books.setGridColor(new java.awt.Color(220, 220, 220));
        tbl_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_booksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_books);

        javax.swing.GroupLayout homepageLayout = new javax.swing.GroupLayout(homepage);
        homepage.setLayout(homepageLayout);
        homepageLayout.setHorizontalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        homepageLayout.setVerticalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homepage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(homepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_addbookFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_addbookFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_addbookFocusGained

    
    
    private void jPanel_addbookFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel_addbookFocusGained

    }//GEN-LAST:event_jPanel_addbookFocusGained

    private void jPanel_addbookFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel_addbookFocusLost
       
    }//GEN-LAST:event_jPanel_addbookFocusLost

    private void jPanel_addbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_addbookMouseEntered
        // TODO add your handling code here:
        jPanel_addbook.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jPanel_addbookMouseEntered

    private void jPanel_addbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_addbookMouseExited
        // TODO add your handling code here:
        jPanel_addbook.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jPanel_addbookMouseExited

    private void jPanel_homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_homepageMouseEntered
        // TODO add your handling code here:
        jPanel_homepage.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jPanel_homepageMouseEntered

    private void jPanel_homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_homepageMouseExited
        // TODO add your handling code here:
        jPanel_homepage.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jPanel_homepageMouseExited

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

    private void jLabel_addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addbookMouseClicked
        addBook ab = new addBook();
        ab.setVisible(true);
        ab.pack();
        ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_addbookMouseClicked

    private void jPanel_addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_addbookMouseClicked
        addBook ab = new addBook();
        ab.setVisible(true);
        ab.pack();
        ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jPanel_addbookMouseClicked

    private void jLabel_addbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addbookMouseEntered
        // TODO add your handling code here:
        jPanel_addbook.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jLabel_addbookMouseEntered

    private void jLabel_addbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addbookMouseExited
        // TODO add your handling code here:
        jPanel_addbook.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jLabel_addbookMouseExited

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

    private void tbl_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_booksMouseClicked
        // TODO add your handling code here:
        int index = tbl_books.getSelectedRow();
        TableModel model = tbl_books.getModel();
        
        
    }//GEN-LAST:event_tbl_booksMouseClicked

   
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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_addbook;
    private javax.swing.JLabel jLabel_bookmark;
    private javax.swing.JLabel jLabel_homepage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_addbook;
    private javax.swing.JPanel jPanel_bookmark;
    private javax.swing.JPanel jPanel_homepage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_books;
    // End of variables declaration//GEN-END:variables

}
