
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class personnel extends javax.swing.JFrame {

    /**
     * Creates new form personnel
     */
    public personnel() {
        initComponents();
        this.setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dash_pnl2 = new javax.swing.JPanel();
        company_btn2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        personal_btn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        indicator3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        profit_btn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        indicator4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        home_btn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        leave_pnl = new javax.swing.JPanel();
        leave_lbl = new javax.swing.JLabel();
        attend_btn = new javax.swing.JPanel();
        attend_lbl = new javax.swing.JLabel();
        logo_pnl = new javax.swing.JPanel();
        img_logo = new javax.swing.JLabel();
        logo_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dash_pnl2.setBackground(new java.awt.Color(233, 233, 233));

        company_btn2.setBackground(new java.awt.Color(233, 233, 233));
        company_btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        company_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                company_btnMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(233, 233, 233));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("Companies");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/company.png"))); // NOI18N

        javax.swing.GroupLayout company_btn2Layout = new javax.swing.GroupLayout(company_btn2);
        company_btn2.setLayout(company_btn2Layout);
        company_btn2Layout.setHorizontalGroup(
            company_btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(company_btn2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        company_btn2Layout.setVerticalGroup(
            company_btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, company_btn2Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(company_btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        personal_btn.setBackground(new java.awt.Color(0, 204, 183));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Personnel");

        indicator3.setBackground(new java.awt.Color(2, 152, 137));
        indicator3.setOpaque(false);

        javax.swing.GroupLayout indicator3Layout = new javax.swing.GroupLayout(indicator3);
        indicator3.setLayout(indicator3Layout);
        indicator3Layout.setHorizontalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        indicator3Layout.setVerticalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/staff.png"))); // NOI18N

        javax.swing.GroupLayout personal_btnLayout = new javax.swing.GroupLayout(personal_btn);
        personal_btn.setLayout(personal_btnLayout);
        personal_btnLayout.setHorizontalGroup(
            personal_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personal_btnLayout.createSequentialGroup()
                .addComponent(indicator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        personal_btnLayout.setVerticalGroup(
            personal_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personal_btnLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(personal_btnLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        profit_btn.setBackground(new java.awt.Color(233, 233, 233));
        profit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profit_btnMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Medicine");

        indicator4.setBackground(new java.awt.Color(2, 152, 137));
        indicator4.setOpaque(false);

        javax.swing.GroupLayout indicator4Layout = new javax.swing.GroupLayout(indicator4);
        indicator4.setLayout(indicator4Layout);
        indicator4Layout.setHorizontalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        indicator4Layout.setVerticalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N

        javax.swing.GroupLayout profit_btnLayout = new javax.swing.GroupLayout(profit_btn);
        profit_btn.setLayout(profit_btnLayout);
        profit_btnLayout.setHorizontalGroup(
            profit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profit_btnLayout.createSequentialGroup()
                .addComponent(indicator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        profit_btnLayout.setVerticalGroup(
            profit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profit_btnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(profit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        home_btn.setBackground(new java.awt.Color(233, 233, 233));
        home_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_btnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Home");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medical-history.png"))); // NOI18N

        javax.swing.GroupLayout home_btnLayout = new javax.swing.GroupLayout(home_btn);
        home_btn.setLayout(home_btnLayout);
        home_btnLayout.setHorizontalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_btnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        home_btnLayout.setVerticalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_btnLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout dash_pnl2Layout = new javax.swing.GroupLayout(dash_pnl2);
        dash_pnl2.setLayout(dash_pnl2Layout);
        dash_pnl2Layout.setHorizontalGroup(
            dash_pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personal_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(company_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dash_pnl2Layout.setVerticalGroup(
            dash_pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_pnl2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(company_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(personal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(profit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        leave_pnl.setBackground(new java.awt.Color(233, 233, 233));
        leave_pnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leave_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leave_pnlMouseClicked(evt);
            }
        });

        leave_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        leave_lbl.setText("Leave");

        javax.swing.GroupLayout leave_pnlLayout = new javax.swing.GroupLayout(leave_pnl);
        leave_pnl.setLayout(leave_pnlLayout);
        leave_pnlLayout.setHorizontalGroup(
            leave_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leave_pnlLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(leave_lbl)
                .addGap(84, 84, 84))
        );
        leave_pnlLayout.setVerticalGroup(
            leave_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leave_pnlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(leave_lbl)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        attend_btn.setBackground(new java.awt.Color(233, 233, 233));
        attend_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attend_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attend_btnMouseClicked(evt);
            }
        });

        attend_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        attend_lbl.setText("Attendance");

        javax.swing.GroupLayout attend_btnLayout = new javax.swing.GroupLayout(attend_btn);
        attend_btn.setLayout(attend_btnLayout);
        attend_btnLayout.setHorizontalGroup(
            attend_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attend_btnLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(attend_lbl)
                .addGap(78, 78, 78))
        );
        attend_btnLayout.setVerticalGroup(
            attend_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attend_btnLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(attend_lbl)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(attend_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302)
                .addComponent(leave_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(588, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(attend_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leave_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(455, 455, 455))
        );

        logo_pnl.setBackground(new java.awt.Color(0, 204, 183));

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/capsules.png"))); // NOI18N

        logo_lbl.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        logo_lbl.setForeground(new java.awt.Color(255, 255, 255));
        logo_lbl.setText("Med Care");

        javax.swing.GroupLayout logo_pnlLayout = new javax.swing.GroupLayout(logo_pnl);
        logo_pnl.setLayout(logo_pnlLayout);
        logo_pnlLayout.setHorizontalGroup(
            logo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(704, 704, 704))
        );
        logo_pnlLayout.setVerticalGroup(
            logo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_pnlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(logo_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo_lbl)
                    .addComponent(img_logo))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dash_pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(logo_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(logo_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dash_pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attend_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attend_btnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new attendance().setVisible(true);
    }//GEN-LAST:event_attend_btnMouseClicked

    private void leave_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leave_pnlMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new leave().setVisible(true);
    }//GEN-LAST:event_leave_pnlMouseClicked

    private void profit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profit_btnMouseClicked
        // TODO add your handling code here:
     this.dispose();
     new profit().setVisible(true);
    }//GEN-LAST:event_profit_btnMouseClicked

    private void company_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_company_btnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new company().setVisible(true);
    }//GEN-LAST:event_company_btnMouseClicked

    private void home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new DashboardForm().setVisible(true);
    }//GEN-LAST:event_home_btnMouseClicked

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
            java.util.logging.Logger.getLogger(personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personnel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel attend_btn;
    private javax.swing.JLabel attend_lbl;
    private javax.swing.JPanel company_btn2;
    private javax.swing.JPanel dash_pnl2;
    private javax.swing.JPanel home_btn;
    private javax.swing.JLabel img_logo;
    private javax.swing.JPanel indicator3;
    private javax.swing.JPanel indicator4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel leave_lbl;
    private javax.swing.JPanel leave_pnl;
    private javax.swing.JLabel logo_lbl;
    private javax.swing.JPanel logo_pnl;
    private javax.swing.JPanel personal_btn;
    private javax.swing.JPanel profit_btn;
    // End of variables declaration//GEN-END:variables
}
