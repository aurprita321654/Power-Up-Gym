/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class editstaff extends javax.swing.JFrame {

    /**
     * Creates new form editstaff
     */
    public editstaff() {
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

        jLabel6 = new javax.swing.JLabel();
        leavedate = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        post = new javax.swing.JLabel();
        workhour = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        salarytxt = new javax.swing.JTextField();
        leavetxt = new javax.swing.JTextField();
        worktxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        whourtxt = new javax.swing.JTextField();
        mantxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Manager ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 432, 128, 34));

        leavedate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        leavedate.setText("Leave date");
        getContentPane().add(leavedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 235, 128, 36));

        salary.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        salary.setText("Salary");
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 175, 128, 29));

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 117, 128, 28));

        post.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        post.setForeground(new java.awt.Color(255, 255, 255));
        post.setText("Work post");
        getContentPane().add(post, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 305, 128, 32));

        workhour.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        workhour.setForeground(new java.awt.Color(240, 240, 240));
        workhour.setText("Daily work hour");
        getContentPane().add(workhour, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 373, 128, 30));

        back.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, -1, -1));

        save.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 529, -1, -1));

        reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 529, -1, -1));
        getContentPane().add(salarytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 174, 185, 31));

        leavetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leavetxtActionPerformed(evt);
            }
        });
        getContentPane().add(leavetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 238, 185, 31));

        worktxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worktxtActionPerformed(evt);
            }
        });
        getContentPane().add(worktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 304, 185, 34));

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 117, 185, 28));
        getContentPane().add(whourtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 372, 185, 32));
        getContentPane().add(mantxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 434, 185, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter the Staff ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 58, 137, 31));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 58, 185, 31));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/s.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 590));

        setSize(new java.awt.Dimension(916, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new home().toFront();
        new home().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_backActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        id.setText("");
        nametxt.setText("");
        salarytxt.setText("");
        leavetxt.setText("");
        worktxt.setText("");
        whourtxt.setText("");
        mantxt.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void worktxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worktxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worktxtActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = ConnectMSSQL.getCon();
            String value = id.getText();
            String query = "UPDATE Staff SET StaffName=?,Staff_salary=?,Staff_leave_date=?,Staff_work_as=?,Staff_work_hour=?,ManagerID=? where StaffId=" + value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nametxt.getText());
            pst.setString(2, salarytxt.getText());
            pst.setString(3, leavetxt.getText());
            pst.setString(4, worktxt.getText());
            pst.setString(5, whourtxt.getText());
            pst.setString(6, mantxt.getText());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void leavetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leavetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leavetxtActionPerformed

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
            java.util.logging.Logger.getLogger(editstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editstaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel leavedate;
    private javax.swing.JTextField leavetxt;
    private javax.swing.JTextField mantxt;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel post;
    private javax.swing.JButton reset;
    private javax.swing.JLabel salary;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JButton save;
    private javax.swing.JTextField whourtxt;
    private javax.swing.JLabel workhour;
    private javax.swing.JTextField worktxt;
    // End of variables declaration//GEN-END:variables
}