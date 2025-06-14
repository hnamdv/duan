/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.entity.NguoiDungDAO;
import DAO.entity.NhanVienDAO;
import DAO.impl.NguoiDungDAOImpl;
import DAO.impl.NhanVienimpl;
import ENTITY.NguoiDung;
import ENTITY.NhanVien;
import UI.Controller.XAuth;
import UI.Controller.doimatkhauctr;
import UTIL.XDialog;

/**
 *
 * @author Admin
 */
public class doimatkhau extends javax.swing.JFrame implements doimatkhauctr{

    /**
     * Creates new form doimatkhau
     */
    public doimatkhau() {
        initComponents();
    }
    NguoiDungDAO dao = new NguoiDungDAOImpl();
@Override
public void open() {
this.setLocationRelativeTo(null);
}
@Override
public void close() {
this.dispose();
}

@Override
public void save() {
    try {
        int maNhanVien = Integer.parseInt(txtUsername.getText().trim());
        String matKhauCu = new String(pass.getPassword()).trim();
        String matKhauMoi = new String(pass2.getPassword()).trim();
        String xacNhanMK = new String(pass3.getPassword()).trim();

        if (!matKhauMoi.equals(xacNhanMK)) {
            XDialog.alert("Xác nhận mật khẩu mới không khớp!");
            return;
        }

        NhanVienDAO dao = new NhanVienimpl();
        NhanVien nv = dao.findById(maNhanVien);

        if (nv == null) {
            XDialog.alert("Mã nhân viên không tồn tại!");
            return;
        }

        if (!matKhauCu.equals(nv.getMatKhau())) {
            XDialog.alert("Mật khẩu cũ không đúng!");
            return;
        }

        boolean success = dao.doiMatKhau(maNhanVien, matKhauMoi);
        if (success) {
            XDialog.alert("Đổi mật khẩu thành công!");
        } else {
            XDialog.alert("Không thể đổi mật khẩu!");
        }

    } catch (NumberFormatException e) {
        XDialog.alert("Mã nhân viên phải là số!");
    } catch (Exception e) {
        e.printStackTrace();
        XDialog.alert("Có lỗi xảy ra khi đổi mật khẩu!");
    }

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        pass3 = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 230, -1));

        jButton3.setText("Xác nhận");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 100, 37));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(906, 64, 37, -1));

        pass2.setText("jPasswordField1");
        getContentPane().add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        pass3.setText("jPasswordField2");
        getContentPane().add(pass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        pass.setText("jPasswordField3");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        cb1.setText("jCheckBox1");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 20, -1));

        cb2.setText("jCheckBox2");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 20, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\duan\\src\\img\\doimkk.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
   save();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
           char echo = cb1.isSelected() ? 0 : '•';
        pass.setEchoChar(echo);
       pass2.setEchoChar(echo);
        pass3.setEchoChar(echo);
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
              char echo = cb1.isSelected() ? 0 : '•';
        pass.setEchoChar(echo);
       pass2.setEchoChar(echo);
        pass3.setEchoChar(echo);
    }//GEN-LAST:event_cb2ActionPerformed

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
            java.util.logging.Logger.getLogger(doimatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doimatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doimatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doimatkhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doimatkhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JPasswordField pass3;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
