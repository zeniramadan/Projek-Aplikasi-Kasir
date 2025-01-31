/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Data_Item extends javax.swing.JFrame {
   public Statement st;
   public PreparedStatement ps;
   public ResultSet rs;
   Connection conn=Config.Koneksi.koneksiDB();
   
   
    public Data_Item() {
        initComponents();
        showdata();
        reset();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Harga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmb_Kategori = new javax.swing.JComboBox<>();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Reset = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Item = new javax.swing.JTable();
        btn_kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nama Item");

        jLabel2.setText("Kategori");

        txt_Harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_HargaKeyReleased(evt);
            }
        });

        jLabel3.setText("Harga");

        cmb_Kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak ada", "Makanan", "Minuman" }));

        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });

        Btn_Reset.setText("Reset");
        Btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResetActionPerformed(evt);
            }
        });

        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Harga)
                    .addComponent(txt_Nama)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Btn_Hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Simpan))
                    .addComponent(cmb_Kategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Hapus)
                    .addComponent(Btn_Reset)
                    .addComponent(Btn_Simpan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Data Item");

        Tbl_Item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama Item", "Kategori", "Harga"
            }
        ));
        Tbl_Item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_ItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Item);

        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_kembali)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_kembali)
                .addContainerGap(12, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void FormatRupiah(){
        if (!txt_Harga.getText().equals("")) {
            String Replace=txt_Harga.getText().replaceAll("[^\\d]", "");
            double FormatRp=Double.parseDouble(Replace);
            DecimalFormat dcf=new DecimalFormat("#,###,###");
            txt_Harga.setText(dcf.format(FormatRp));
        }
    }
    private void Btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResetActionPerformed
        reset();
    }//GEN-LAST:event_Btn_ResetActionPerformed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        if(txt_Nama.getText().equals("")||txt_Harga.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Data belum lengkap!", "Validasi",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            st=conn.createStatement();
            if (Btn_Simpan.getText()=="Simpan"){
                String find="SELECT * FROM tbl_dataitem WHERE nama_item='"+ txt_Nama.getText() +"' ";
                rs=st.executeQuery(find);
                if(rs.next()) {
                    JOptionPane.showMessageDialog(null,"Item suda ada", "Validasi",JOptionPane.WARNING_MESSAGE);
                }else{
                    String nama=txt_Nama.getText();
                    String kategori=cmb_Kategori.getItemAt(cmb_Kategori.getSelectedIndex());
                    String harga=txt_Harga.getText();
                    String ReplaceHarga=harga.replaceAll(",", "");
                    
                    String sql="INSERT INTO tbl_dataitem (nama_item,kategori,harga) VALUES (?,?,?)";
                    ps=conn.prepareStatement(sql);
                    ps.setString(1, nama);
                    ps.setString(2, kategori);
                    ps.setString(3, ReplaceHarga);
                    
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Item berhasil disimpan", "input Data",JOptionPane.WARNING_MESSAGE);
                    showdata();
                    reset();
                }
            }else{
                int selectedRow=Tbl_Item.getSelectedRow();
                String No=Tbl_Item.getValueAt(selectedRow, 0).toString();
                String nama=txt_Nama.getText();
                String kategori=cmb_Kategori.getItemAt(cmb_Kategori.getSelectedIndex());
                String harga=txt_Harga.getText();
                String ReplaceHarga=harga.replaceAll(",", "");
                
                String sql="UPDATE tbl_dataitem SET nama_item=?, kategori=?, harga=? WHERE No=?";
                ps=conn.prepareStatement(sql);
                ps.setString(1, nama);
                ps.setString(2, kategori);
                ps.setString(3, ReplaceHarga);
                ps.setString(4, No);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item berhasil diupdate", "input Data",JOptionPane.WARNING_MESSAGE);
                showdata();
                reset();
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Tbl_ItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_ItemMouseClicked
        DefaultTableModel model=(DefaultTableModel)Tbl_Item.getModel();
        int selectedRow=Tbl_Item.getSelectedRow();
        
        txt_Nama.setText(model.getValueAt(selectedRow, 1).toString());
        String colKat=model.getValueAt(selectedRow, 2).toString();
        for(int i=0;i<cmb_Kategori.getItemCount();i++){
            if(cmb_Kategori.getItemAt(i).toString().equalsIgnoreCase(colKat)){
                cmb_Kategori.setSelectedIndex(i);
            }
        }
        txt_Harga.setText(model.getValueAt(selectedRow, 3).toString());
        Btn_Simpan.setText("Update");
        FormatRupiah();

    }//GEN-LAST:event_Tbl_ItemMouseClicked

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        try {
            if(txt_Nama.getText().equals("")||txt_Nama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Silahkan pilih data yang mau dihapus", "Validasi", JOptionPane.INFORMATION_MESSAGE);
            }else{
                int konfirmasi=JOptionPane.showConfirmDialog(null, "Anda akan mrnghapus data, ingin melannjutkan?", "Hapus Data", JOptionPane.YES_NO_OPTION);
                if(konfirmasi==0){
                    int selectedRow=Tbl_Item.getSelectedRow();
                    String No=Tbl_Item.getValueAt(selectedRow, 0).toString();
                    String sql="DELETE FROM tbl_dataitem WHERE No=?";
                    ps=conn.prepareStatement(sql);
                    ps.setString(1, No);
                    ps.executeUpdate();
                    showdata();
                    reset();
                }else{
                    reset();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void txt_HargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HargaKeyReleased
        FormatRupiah();
    }//GEN-LAST:event_txt_HargaKeyReleased

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        Beranda beranda = new Beranda();
        beranda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Data_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Reset;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JTable Tbl_Item;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JComboBox<String> cmb_Kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Harga;
    private javax.swing.JTextField txt_Nama;
    // End of variables declaration//GEN-END:variables

    private void showdata() {
        DefaultTableModel model=(DefaultTableModel)Tbl_Item.getModel();
        model.setRowCount(0);
        try {
            String sql="SELECT * FROM tbl_dataitem";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()) {
                int no=rs.getInt("No");
                String nama=rs.getString("nama_item");
                String kategori=rs.getString("kategori");
                int harga=rs.getInt("harga");
                NumberFormat kursIndo=NumberFormat.getIntegerInstance(new Locale("id","ID"));
                Object[] Rowdata={no,nama,kategori,kursIndo.format(harga)};
                model.addRow(Rowdata);
            }
        } catch (Exception e) {
        }
    }

    private void reset() {
        txt_Nama.setText("");
        cmb_Kategori.setSelectedIndex(0);
        txt_Harga.setText("");
        Btn_Simpan.setText("Simpan");
    }

}
