
package reviewBuku;

import java.awt.Color;
import java.awt.Image;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class bookmark extends javax.swing.JFrame {

 
    public bookmark() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTable_Review();
    }
   
    
     public final Connection getConnection(){
        Connection con = null;
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/user_boora","root","");
        return con;
        }catch(SQLException ex){
            Logger.getLogger(bookmark.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Not connected");
            return null;
        }
    }

      public class Function{
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        public ResultSet find(String judul){
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/user_boora","root","");
                 ps = con.prepareStatement("SELECT * FROM `books` WHERE `judul` = ?");
                 ps.setString(1, judul);
                rs = ps.executeQuery();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                Logger.getLogger(bookmark.class.getName()).log(Level.SEVERE, null, ex);
            }
           return rs;
        } 
    }
      
      public ArrayList<review> reviewList()
      {
          ArrayList<review> reviewList = new ArrayList<review>();
          Connection con = getConnection();
          String query = "SELECT * FROM `review`";
          Statement st;
          ResultSet rs;
          
          try
          {
            st = con.createStatement();
            rs = st.executeQuery(query);
            review rv;
            while(rs.next())
            {
                rv = new review(
                        rs.getInt("id_buku"), 
                        rs.getString("judul"), 
                        rs.getInt("tahun_terbit"), 
                        rs.getString("author"), 
                        rs.getString("genre"), 
                        rs.getString("komentar"));
                reviewList.add(rv);
            }
          } catch (SQLException e){
              e.printStackTrace();
          }
          return reviewList;
      } 
      
      // display data ke tabel
      
      public void jTable_Review()
      {
          ArrayList<review> list = reviewList();
          DefaultTableModel model = (DefaultTableModel) tbl_review.getModel();
          Object[] row = new Object[6];
          for(int i=0; i<list.size(); i++)
          {
              row[0] = list.get(i).getIdBuku();
              row[1] = list.get(i).getJudul();
              row[2] = list.get(i).getTahunTerbit();
              row[3] = list.get(i).getAuthor();
              row[4] = list.get(i).getGenre();
              row[5] = list.get(i).getKomentar();
              
              model.addRow(row);
          }
      }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        homepage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_cariJudul = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_thn = new javax.swing.JTextField();
        tf_judul = new javax.swing.JTextField();
        tf_author = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_genre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_komentar = new javax.swing.JTextArea();
        jButton_simpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_review = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        tf_idbuku = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel_homepage = new javax.swing.JPanel();
        jLabel_homepage = new javax.swing.JLabel();
        jPanel_bookmark = new javax.swing.JPanel();
        jLabel_bookmark = new javax.swing.JLabel();
        jPanel_addbook = new javax.swing.JPanel();
        jLabel_addbook = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homepage.setBackground(new java.awt.Color(220, 220, 220));
        homepage.setForeground(new java.awt.Color(220, 220, 220));
        homepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepageMouseClicked(evt);
            }
        });

        jLabel2.setText("Tambahkan review/komentar pada buku yang sudah ditambahkan");

        jButton_search.setText("Cari");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jLabel3.setText("Judul Buku");

        jLabel4.setText("Author");

        jLabel5.setText("Tahun Terbit");

        jLabel6.setText("Genre");

        tf_genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_genreActionPerformed(evt);
            }
        });

        jLabel7.setText("Komentar");

        ta_komentar.setColumns(20);
        ta_komentar.setRows(5);
        ta_komentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta_komentarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ta_komentar);

        jButton_simpan.setText("Simpan");
        jButton_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_simpanMouseClicked(evt);
            }
        });

        tbl_review.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Buku", "Judul", "Tahun Terbit", "Author", "Genre", "Komentar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_review.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_reviewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_review);

        jLabel8.setText("ID Buku");

        javax.swing.GroupLayout homepageLayout = new javax.swing.GroupLayout(homepage);
        homepage.setLayout(homepageLayout);
        homepageLayout.setHorizontalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepageLayout.createSequentialGroup()
                .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepageLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(homepageLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(homepageLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton_search))
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_simpan)
                            .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_thn, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(tf_cariJudul)
                                .addComponent(tf_judul, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(tf_author, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(tf_genre, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addComponent(tf_idbuku)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        homepageLayout.setVerticalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepageLayout.createSequentialGroup()
                .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepageLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_search)
                            .addComponent(tf_cariJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_idbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(homepageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton_simpan)
                .addGap(49, 49, 49))
        );

        jPanel1.setBackground(new java.awt.Color(86, 112, 130));
        jPanel1.setForeground(new java.awt.Color(166, 166, 194));

        jPanel3.setBackground(new java.awt.Color(129, 169, 195));
        jPanel3.setForeground(new java.awt.Color(255, 153, 153));

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
        });

        javax.swing.GroupLayout jPanel_homepageLayout = new javax.swing.GroupLayout(jPanel_homepage);
        jPanel_homepage.setLayout(jPanel_homepageLayout);
        jPanel_homepageLayout.setHorizontalGroup(
            jPanel_homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_homepageLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel_homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_bookmarkMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel_bookmarkLayout = new javax.swing.GroupLayout(jPanel_bookmark);
        jPanel_bookmark.setLayout(jPanel_bookmarkLayout);
        jPanel_bookmarkLayout.setHorizontalGroup(
            jPanel_bookmarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_bookmarkLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel_bookmark, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
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
        });

        javax.swing.GroupLayout jPanel_addbookLayout = new javax.swing.GroupLayout(jPanel_addbook);
        jPanel_addbook.setLayout(jPanel_addbookLayout);
        jPanel_addbookLayout.setHorizontalGroup(
            jPanel_addbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_addbookLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
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

        jLabel1.setFont(new java.awt.Font("Forte", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 196, 196));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesrc/book3.png"))); // NOI18N
        jLabel1.setText("Boora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_homepageMouseClicked

    private void jPanel_homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_homepageMouseEntered
        // TODO add your handling code here:
        jPanel_homepage.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jPanel_homepageMouseEntered

    private void jPanel_homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_homepageMouseExited
        // TODO add your handling code here:
        jPanel_homepage.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jPanel_homepageMouseExited

    private void jPanel_bookmarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_bookmarkMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel_bookmarkMouseClicked

    private void jPanel_bookmarkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_bookmarkMouseEntered
        // TODO add your handling code here:
        jPanel_bookmark.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jPanel_bookmarkMouseEntered

    private void jPanel_bookmarkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_bookmarkMouseExited
        // TODO add your handling code here:
        jPanel_bookmark.setBackground(new Color(129, 169, 195));
    }//GEN-LAST:event_jPanel_bookmarkMouseExited

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

    private void jPanel_addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_addbookMouseClicked
        addBook ab = new addBook();
        ab.setVisible(true);
        ab.pack();
        ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jPanel_addbookMouseClicked

    private void jLabel_addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addbookMouseClicked
        addBook ab = new addBook();
        ab.setVisible(true);
        ab.pack();
        ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_addbookMouseClicked

    private void jLabel_homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_homepageMouseClicked
        mainMenu main = new mainMenu();
        main.setVisible(true);
        main.pack();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_homepageMouseClicked

    private void jPanel_homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_homepageMouseClicked
        mainMenu main = new mainMenu();
        main.setVisible(true);
        main.pack();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jPanel_homepageMouseClicked

    private void jLabel_addbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addbookMouseEntered
        // TODO add your handling code here:
        jPanel_addbook.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jLabel_addbookMouseEntered

    private void jLabel_homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_homepageMouseEntered
        // TODO add your handling code here:
        jPanel_homepage.setBackground(new Color(142, 159, 171));
    }//GEN-LAST:event_jLabel_homepageMouseEntered

    private void jLabel_bookmarkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_bookmarkMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_bookmarkMouseEntered

    private void tf_genreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_genreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_genreActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        Function f = new Function();
        ResultSet rs = null;
        String id_buku = "id_buku";
        String judul = "judul";
        String tahun_terbit = "tahun_terbit";
        String author = "author";
        String genre = "genre";
        
        rs = f.find(tf_cariJudul.getText());
        try{
          if(rs.next()){
            tf_idbuku.setText(rs.getString("id_buku"));
            tf_judul.setText(rs.getString("judul"));
            tf_thn.setText(rs.getString("tahun_terbit"));
            tf_author.setText(rs.getString("author"));
            tf_genre.setText(rs.getString("genre"));
          }else {
              JOptionPane.showMessageDialog(null, "Buku belum terdaftar");
          }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_simpanMouseClicked
        String id_buku = tf_idbuku.getText();
        String judul = tf_judul.getText();
        String tahun_terbit = tf_thn.getText();
        String author = tf_author.getText();
        String genre = tf_genre.getText();
        String komentar = ta_komentar.getText();
        
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO review(id_buku, judul, tahun_terbit, author, genre, komentar)" + "values(?,?,?,?,?,?)");
            ps.setString(1, id_buku);
            ps.setString(2, judul);
            ps.setString(3, tahun_terbit);
            ps.setString(4, author);
            ps.setString(5, genre);
            ps.setString(6, komentar);
            
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tbl_review.getModel();
            model.setRowCount(0);
            jTable_Review();
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null,"Komentar anda berhasil disimpan");
            }else {
                        
                JOptionPane.showMessageDialog(null, "Gagal menyimpan review");
                    }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(bookmark.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_simpanMouseClicked

    private void ta_komentarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta_komentarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ta_komentarMouseClicked

    private void tbl_reviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_reviewMouseClicked
        // TODO add your handling code here:
       int index = tbl_review.getSelectedRow();
       TableModel model = tbl_review.getModel();
       tf_idbuku.setText(model.getValueAt(index, 0).toString());
       tf_judul.setText(model.getValueAt(index, 1).toString());
       tf_thn.setText(model.getValueAt(index, 2).toString());
       tf_author.setText(model.getValueAt(index, 3).toString());
       tf_genre.setText(model.getValueAt(index, 4).toString());
       ta_komentar.setText(model.getValueAt(index, 5).toString());
  
       
    }//GEN-LAST:event_tbl_reviewMouseClicked

   
    
    
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
            java.util.logging.Logger.getLogger(bookmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookmark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homepage;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_addbook;
    private javax.swing.JLabel jLabel_bookmark;
    private javax.swing.JLabel jLabel_homepage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_addbook;
    private javax.swing.JPanel jPanel_bookmark;
    private javax.swing.JPanel jPanel_homepage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextArea ta_komentar;
    private javax.swing.JTable tbl_review;
    private javax.swing.JTextField tf_author;
    private javax.swing.JTextField tf_cariJudul;
    private javax.swing.JTextField tf_genre;
    private javax.swing.JTextField tf_idbuku;
    private javax.swing.JTextField tf_judul;
    private javax.swing.JTextField tf_thn;
    // End of variables declaration//GEN-END:variables
}
