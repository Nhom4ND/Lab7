/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7bai3;


/**
 *
 * @author Cao Trinh
 */
public class Bai3 extends javax.swing.JFrame {

    /**
     * Creates new form Bai3
     */
    public Bai3() {
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

        jDP = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHeThong = new javax.swing.JMenu();
        jMenuThongTin = new javax.swing.JMenuItem();
        jMenuThoat = new javax.swing.JMenuItem();
        jMenuChucNang = new javax.swing.JMenu();
        jMenuKiemTraIP = new javax.swing.JMenuItem();
        jMenuTimIPCuaTenMien = new javax.swing.JMenuItem();
        jMenuTimTenMienCuaIP = new javax.swing.JMenuItem();
        jMenuTimIpMayCucBo = new javax.swing.JMenuItem();
        jMenuKtraIp = new javax.swing.JMenuItem();
        jMenuKiemTra2TenMien = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDPLayout = new javax.swing.GroupLayout(jDP);
        jDP.setLayout(jDPLayout);
        jDPLayout.setHorizontalGroup(
            jDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        jDPLayout.setVerticalGroup(
            jDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        jMenuHeThong.setText("Hệ thống");

        jMenuThongTin.setText("Thông tin");
        jMenuThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuThongTinActionPerformed(evt);
            }
        });
        jMenuHeThong.add(jMenuThongTin);

        jMenuThoat.setText("Thoát");
        jMenuThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuThoatActionPerformed(evt);
            }
        });
        jMenuHeThong.add(jMenuThoat);

        jMenuBar1.add(jMenuHeThong);

        jMenuChucNang.setText("Chức năng");

        jMenuKiemTraIP.setText("Kiểm tra IP");
        jMenuKiemTraIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKiemTraIPActionPerformed(evt);
            }
        });
        jMenuChucNang.add(jMenuKiemTraIP);

        jMenuTimIPCuaTenMien.setText("Tìm IP của tên miền");
        jMenuTimIPCuaTenMien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTimIPCuaTenMienActionPerformed(evt);
            }
        });
        jMenuChucNang.add(jMenuTimIPCuaTenMien);

        jMenuTimTenMienCuaIP.setText("Tìm tên miền của IP");
        jMenuTimTenMienCuaIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTimTenMienCuaIPActionPerformed(evt);
            }
        });
        jMenuChucNang.add(jMenuTimTenMienCuaIP);

        jMenuTimIpMayCucBo.setText("Tìm IP của máy cục bộ");
        jMenuTimIpMayCucBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTimIpMayCucBoActionPerformed(evt);
            }
        });
        jMenuChucNang.add(jMenuTimIpMayCucBo);

        jMenuKtraIp.setText("Kiểm tra IP");
        jMenuKtraIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKtraIpActionPerformed(evt);
            }
        });
        jMenuChucNang.add(jMenuKtraIp);

        jMenuKiemTra2TenMien.setText("Kiểm tra 2 tên miền");
        jMenuKiemTra2TenMien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKiemTra2TenMienActionPerformed(evt);
            }
        });
        jMenuChucNang.add(jMenuKiemTra2TenMien);

        jMenuBar1.add(jMenuChucNang);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDP)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuKiemTra2TenMienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKiemTra2TenMienActionPerformed
        B6 b6 = new B6();
        jDP.add(b6);
        b6.setVisible(true);
    }//GEN-LAST:event_jMenuKiemTra2TenMienActionPerformed

    private void jMenuKtraIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKtraIpActionPerformed
        B5 b5= new B5();
        jDP.add(b5);
        b5.setVisible(true);
    }//GEN-LAST:event_jMenuKtraIpActionPerformed

    private void jMenuTimIpMayCucBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTimIpMayCucBoActionPerformed
        B4 b4 = new B4();
        jDP.add(b4);
        b4.setVisible(true);
    }//GEN-LAST:event_jMenuTimIpMayCucBoActionPerformed

    private void jMenuTimTenMienCuaIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTimTenMienCuaIPActionPerformed
        B3 b3 = new B3();
        jDP.add(b3);
        b3.setVisible(true);
    }//GEN-LAST:event_jMenuTimTenMienCuaIPActionPerformed

    private void jMenuTimIPCuaTenMienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTimIPCuaTenMienActionPerformed
        B2 b2 = new B2();
        jDP.add(b2);
        b2.setVisible(true);
    }//GEN-LAST:event_jMenuTimIPCuaTenMienActionPerformed

    private void jMenuKiemTraIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKiemTraIPActionPerformed
        B1 b1 = new B1();
        jDP.add(b1);
        b1.setVisible(true);
    }//GEN-LAST:event_jMenuKiemTraIPActionPerformed

    private void jMenuThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuThoatActionPerformed

    private void jMenuThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuThongTinActionPerformed
        TT tt = new TT();
        jDP.add(tt);
        tt.setVisible(true);
    }//GEN-LAST:event_jMenuThongTinActionPerformed

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
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Bai3().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDP;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuChucNang;
    private javax.swing.JMenu jMenuHeThong;
    private javax.swing.JMenuItem jMenuKiemTra2TenMien;
    private javax.swing.JMenuItem jMenuKiemTraIP;
    private javax.swing.JMenuItem jMenuKtraIp;
    private javax.swing.JMenuItem jMenuThoat;
    private javax.swing.JMenuItem jMenuThongTin;
    private javax.swing.JMenuItem jMenuTimIPCuaTenMien;
    private javax.swing.JMenuItem jMenuTimIpMayCucBo;
    private javax.swing.JMenuItem jMenuTimTenMienCuaIP;
    // End of variables declaration//GEN-END:variables
}
