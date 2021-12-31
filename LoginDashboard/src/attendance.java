
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class attendance extends javax.swing.JFrame {

    /**
     * Creates new form attendance
     */
    public attendance() {
        initComponents();
        this.setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/med_care", "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
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

        attendance_pnl = new javax.swing.JPanel();
        emp_id_lbl = new javax.swing.JLabel();
        add_emp_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        attend_table = new javax.swing.JTable();
        emp_name_lbl = new javax.swing.JLabel();
        add_emp_name = new javax.swing.JTextField();
        addData = new javax.swing.JToggleButton();
        updateData = new javax.swing.JToggleButton();
        deletData = new javax.swing.JToggleButton();
        back_btn = new javax.swing.JLabel();
        emp_job_lbl = new javax.swing.JLabel();
        add_emp_job = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        attendance_pnl.setBackground(new java.awt.Color(255, 255, 255));

        emp_id_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emp_id_lbl.setText("Id : ");

        add_emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_emp_idActionPerformed(evt);
            }
        });

        attend_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Job", "Time(attendance)"
            }
        ));
        attend_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attend_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(attend_table);
        if (attend_table.getColumnModel().getColumnCount() > 0) {
            attend_table.getColumnModel().getColumn(3).setResizable(false);
        }

        emp_name_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emp_name_lbl.setText("Name : ");

        addData.setBackground(new java.awt.Color(0, 204, 183));
        addData.setText("Add Data");
        addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataActionPerformed(evt);
            }
        });

        updateData.setBackground(new java.awt.Color(0, 204, 183));
        updateData.setText("Update Data");
        updateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDataActionPerformed(evt);
            }
        });

        deletData.setBackground(new java.awt.Color(0, 204, 183));
        deletData.setText("Delet Data");
        deletData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletDataActionPerformed(evt);
            }
        });

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });

        emp_job_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emp_job_lbl.setText("Job : ");

        javax.swing.GroupLayout attendance_pnlLayout = new javax.swing.GroupLayout(attendance_pnl);
        attendance_pnl.setLayout(attendance_pnlLayout);
        attendance_pnlLayout.setHorizontalGroup(
            attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1573, Short.MAX_VALUE)
            .addGroup(attendance_pnlLayout.createSequentialGroup()
                .addGroup(attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attendance_pnlLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(attendance_pnlLayout.createSequentialGroup()
                                .addComponent(emp_job_lbl)
                                .addGap(40, 40, 40)
                                .addComponent(add_emp_job, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendance_pnlLayout.createSequentialGroup()
                                    .addComponent(emp_id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(add_emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendance_pnlLayout.createSequentialGroup()
                                    .addComponent(emp_name_lbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(add_emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(181, 181, 181)
                        .addGroup(attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateData, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletData, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendance_pnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back_btn)))
                .addContainerGap())
        );
        attendance_pnlLayout.setVerticalGroup(
            attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendance_pnlLayout.createSequentialGroup()
                .addGroup(attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attendance_pnlLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emp_id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(attendance_pnlLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back_btn))
                .addGroup(attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attendance_pnlLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emp_name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emp_job_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_emp_job, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(attendance_pnlLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(updateData, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(deletData, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attendance_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attendance_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_emp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_emp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_emp_idActionPerformed

    private void addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        if(add_emp_name.getText().equals("") || add_emp_id.getText().equals("") || add_emp_job.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Plz, Add all data!");
        }
        else{
            String data[] = { add_emp_id.getText(), add_emp_name.getText(),add_emp_job.getText()};
            DefaultTableModel tblModel = (DefaultTableModel)attend_table.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this,"Data Added Successfully!");
            add_emp_id.setText("");
            add_emp_name.setText("");
            add_emp_job.setText("");
            }         
    }//GEN-LAST:event_addDataActionPerformed

    private void updateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDataActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tblModel = (DefaultTableModel)attend_table.getModel();
        if(attend_table.getSelectedRowCount() == 1){
            // if row selected
            String Name = add_emp_name.getText();
            String Id = add_emp_id.getText();
            String Job = add_emp_job.getText(); 
            //set to uptade value in row 
            tblModel.setValueAt(Id,attend_table.getSelectedRow(), 0);
            tblModel.setValueAt(Name,attend_table.getSelectedRow(), 1);
            tblModel.setValueAt(Job,attend_table.getSelectedRow(), 2);
            JOptionPane.showMessageDialog(this,"Data Update Successfully...!");
        }
        else{
            if(attend_table.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty");
            }
            else{
                //if row nt selected || multi roe selected
                JOptionPane.showMessageDialog(this,"Plz, Select Single Row For Update");
            }
        }

    }//GEN-LAST:event_updateDataActionPerformed

    private void deletDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletDataActionPerformed
        // TODO add your handling code here:
        // get table
        DefaultTableModel tblModel = (DefaultTableModel)attend_table.getModel();
        // delet row
        if(attend_table.getSelectedRowCount() == 1){
            //if single row selected
            tblModel.removeRow(attend_table.getSelectedRow());
        }
        else{
            //if row empty
            if(attend_table.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty");
            }
            else{
                //if row nt selected || multi roe selected
                JOptionPane.showMessageDialog(this,"Plz, Select Single Row For Update");
            }
        }

    }//GEN-LAST:event_deletDataActionPerformed

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new personnel().setVisible(true);
    }//GEN-LAST:event_back_btnMouseClicked

    private void attend_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attend_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)attend_table.getModel();
        String tblId =  tblModel.getValueAt(attend_table.getSelectedRow(),0).toString();
        String tblName =  tblModel.getValueAt(attend_table.getSelectedRow(),1).toString();
        String tblJob =  tblModel.getValueAt(attend_table.getSelectedRow(),2).toString();
        add_emp_name.setText(tblName);
        add_emp_id.setText(tblId);
        add_emp_job.setText(tblJob);     
    }//GEN-LAST:event_attend_tableMouseClicked

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
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addData;
    private javax.swing.JTextField add_emp_id;
    private javax.swing.JTextField add_emp_job;
    private javax.swing.JTextField add_emp_name;
    private javax.swing.JTable attend_table;
    private javax.swing.JPanel attendance_pnl;
    private javax.swing.JLabel back_btn;
    private javax.swing.JToggleButton deletData;
    private javax.swing.JLabel emp_id_lbl;
    private javax.swing.JLabel emp_job_lbl;
    private javax.swing.JLabel emp_name_lbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton updateData;
    // End of variables declaration//GEN-END:variables
}
