/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import models.Database;
import models.District;
import models.Member;
import models.Province;
import models.Regency;

/**
 *
 * @author Riyan
 */
public class MemberForm extends javax.swing.JFrame {

    List<Member> member = new ArrayList<>();
    List<Province> province = new ArrayList<>();
    List<Regency> regency = new ArrayList<>();
    List<District> district = new ArrayList<>();

    /**
     * Creates new form BackupForm
     */
    public MemberForm() {
        initComponents();

        setKodeMember();

        getProvinces();
        getRegencies();
        getDistricts();

        showProvinces();
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
        jLabel1 = new javax.swing.JLabel();
        TFKodeMember = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFNamaLengkap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DCTanggalLahir = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAAlamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        CBProvinsi = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CBKabKota = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CBKecamatan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        TFNomorTelepon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        RBLakiLaki = new javax.swing.JRadioButton();
        RBPerempuan = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        CBAgama = new javax.swing.JComboBox<>();
        BBaru = new javax.swing.JButton();
        BSimpan1 = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TMember = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Kode Member");

        TFKodeMember.setEnabled(false);

        jLabel2.setText("Nama Lengkap");

        jLabel3.setText("Tanggal Lahir");

        jLabel4.setText("Alamat");

        TAAlamat.setColumns(20);
        TAAlamat.setRows(5);
        jScrollPane1.setViewportView(TAAlamat);

        jLabel5.setText("Provinsi");

        CBProvinsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBProvinsiMouseClicked(evt);
            }
        });

        jLabel6.setText("Kab / Kota");

        CBKabKota.setEnabled(false);
        CBKabKota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBKabKotaMouseClicked(evt);
            }
        });

        jLabel7.setText("Kecamatan");

        CBKecamatan.setEnabled(false);

        jLabel8.setText("Nomor Telepon");

        jLabel9.setText("Jenis Kelamin");

        RBLakiLaki.setText("Laki - laki");

        RBPerempuan.setText("Perempuan");

        jLabel10.setText("Agama");

        CBAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Buddha", "HIndu", "Konghuchu" }));

        BBaru.setText("Baru");

        BSimpan1.setText("Simpan");

        BHapus.setBackground(new java.awt.Color(255, 51, 51));
        BHapus.setForeground(new java.awt.Color(255, 255, 255));
        BHapus.setText("Hapus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFNomorTelepon)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DCTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBProvinsi, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBKabKota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFNamaLengkap)
                            .addComponent(TFKodeMember, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBKecamatan, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBAgama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RBLakiLaki)
                                .addGap(18, 18, 18)
                                .addComponent(RBPerempuan)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BSimpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BBaru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFKodeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(DCTanggalLahir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBProvinsi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CBKabKota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(CBKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(RBPerempuan)
                    .addComponent(RBLakiLaki)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CBAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSimpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Member", "Nama Lengkap", "Jenis Kelamin", "No Telepon"
            }
        ));
        jScrollPane2.setViewportView(TMember);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBProvinsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBProvinsiMouseClicked
        // TODO add your handling code here:
        CBKabKota.setEnabled(true);

        int province_id = Integer.parseInt(CBProvinsi.getSelectedItem().toString().split("-")[0]);

        for (Province item : province) {
            if (item.getId() == province_id) {
                province_id = item.getId();
            }
        }

        showRegencies(province_id);
    }//GEN-LAST:event_CBProvinsiMouseClicked

    private void CBKabKotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBKabKotaMouseClicked
        // TODO add your handling code here:
        CBKecamatan.setEnabled(true);

        int regency_id = Integer.parseInt(CBKabKota.getSelectedItem().toString().split("-")[0]);

        for (Regency item : regency) {
            if (item.getId() == regency_id) {
                regency_id = item.getId();
            }
        }

        showDistricts(regency_id);
    }//GEN-LAST:event_CBKabKotaMouseClicked

    private void setKodeMember() {
        String kodeMember = "UP-";

        DateFormat df = new SimpleDateFormat("yy");
        String currentYear = df.format(Calendar.getInstance().getTime());

        kodeMember += currentYear + "-";

        Connection connection = Database.GetConnection();

        String query = "SELECT * FROM member ORDER BY member_id desc LIMIT 1";

        try {
            PreparedStatement pst = connection.prepareStatement(query);

            ResultSet result = pst.executeQuery();
            
            if(result.next()) {
                String lastKodeMember = result.getString("member_id");
                
                int lastIteration = Integer.parseInt(lastKodeMember.split("-")[2]);
                
                int newIteration = lastIteration + 1;
                
                String formattedIteration = String.format("%03d", newIteration);
                
                kodeMember += formattedIteration;
            } else {
                kodeMember += "001";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        TFKodeMember.setText(kodeMember);
    }

    private void getProvinces() {
        Connection connetion = Database.GetConnection();

        String query = "SELECT * FROM provinces";

        PreparedStatement pst;
        try {
            pst = connetion.prepareStatement(query);

            ResultSet results = pst.executeQuery();

            while (results.next()) {
                province.add(new Province(results.getInt("id"), results.getString("name")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void showProvinces() {
        for (Province item : province) {
            CBProvinsi.addItem(item.getId() + "-" + item.getName());
        }
    }

    private void getRegencies() {
        Connection connetion = Database.GetConnection();

        String query = "SELECT * FROM regencies";

        PreparedStatement pst;
        try {
            pst = connetion.prepareStatement(query);

            ResultSet results = pst.executeQuery();

            while (results.next()) {
                regency.add(new Regency(results.getInt("id"), results.getInt("province_id"), results.getString("name")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void showRegencies(int province_id) {
        CBKabKota.removeAllItems();

        for (Regency item : regency) {
            if (item.getProvince_id() == province_id) {
                CBKabKota.addItem(item.getId() + "-" + item.getName());
            }
        }
    }

    private void getDistricts() {
        Connection connetion = Database.GetConnection();

        String query = "SELECT * FROM districts";

        PreparedStatement pst;
        try {
            pst = connetion.prepareStatement(query);

            ResultSet results = pst.executeQuery();

            while (results.next()) {
                district.add(new District(results.getInt("id"), results.getInt("regency_id"), results.getString("name")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void showDistricts(int regency_id) {
        CBKecamatan.removeAllItems();

        for (District item : district) {
            if (item.getRegency_id() == regency_id) {
                CBKecamatan.addItem(item.getId() + "-" + item.getName());
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
            java.util.logging.Logger.getLogger(MemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBaru;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BSimpan1;
    private javax.swing.JComboBox<String> CBAgama;
    private javax.swing.JComboBox<String> CBKabKota;
    private javax.swing.JComboBox<String> CBKecamatan;
    private javax.swing.JComboBox<String> CBProvinsi;
    private com.toedter.calendar.JDateChooser DCTanggalLahir;
    private javax.swing.JRadioButton RBLakiLaki;
    private javax.swing.JRadioButton RBPerempuan;
    private javax.swing.JTextArea TAAlamat;
    private javax.swing.JTextField TFKodeMember;
    private javax.swing.JTextField TFNamaLengkap;
    private javax.swing.JTextField TFNomorTelepon;
    private javax.swing.JTable TMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
