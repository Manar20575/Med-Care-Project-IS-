
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public class DashboardForm extends javax.swing.JFrame {
    public DashboardForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
                       
    }
    DateTimeFormatter t =  DateTimeFormatter.ofPattern("yyyy-MM-dd,HH:mm:ss");
           LocalDateTime now = LocalDateTime.now();  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *         
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_pnl = new javax.swing.JPanel();
        med_name_lbl = new javax.swing.JLabel();
        med_name_input = new javax.swing.JTextField();
        med_quantity_lbl = new javax.swing.JLabel();
        med_quantity_input = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill_table = new javax.swing.JTable();
        add_med_btn = new javax.swing.JButton();
        update_med_btn = new javax.swing.JButton();
        delete_med_btn = new javax.swing.JButton();
        delete_med_btn1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        add_med_btn1 = new javax.swing.JButton();
        dash_pnl = new javax.swing.JPanel();
        company_btn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        indicator2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        personal_btn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        indicator3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        profit_btn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        indicator4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        logo_pnl = new javax.swing.JPanel();
        img_logo = new javax.swing.JLabel();
        logo_lbl = new javax.swing.JLabel();
        home_btn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        indicator1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_pnl.setBackground(new java.awt.Color(255, 255, 255));

        med_name_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        med_name_lbl.setText("Name : ");

        med_quantity_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        med_quantity_lbl.setText("Quantity : ");

        bill_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Qua", "Date"
            }
        ));
        jScrollPane1.setViewportView(bill_table);

        add_med_btn.setText("Print");
        add_med_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_med_btnMouseClicked(evt);
            }
        });
        add_med_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_med_btnActionPerformed(evt);
            }
        });

        update_med_btn.setText("Clear");
        update_med_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_med_btnMouseClicked(evt);
            }
        });

        delete_med_btn.setText("Delete");
        delete_med_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_med_btnMouseClicked(evt);
            }
        });
        delete_med_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_med_btnActionPerformed(evt);
            }
        });

        delete_med_btn1.setText("Update");
        delete_med_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_med_btn1MouseClicked(evt);
            }
        });
        delete_med_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_med_btn1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Bill");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        add_med_btn1.setText("Add");
        add_med_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_med_btn1MouseClicked(evt);
            }
        });
        add_med_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_med_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_pnlLayout = new javax.swing.GroupLayout(main_pnl);
        main_pnl.setLayout(main_pnlLayout);
        main_pnlLayout.setHorizontalGroup(
            main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_pnlLayout.createSequentialGroup()
                .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_pnlLayout.createSequentialGroup()
                        .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_pnlLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(med_name_lbl)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_pnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(med_quantity_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(med_quantity_input, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(med_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(152, 152, 152)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_pnlLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_pnlLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(main_pnlLayout.createSequentialGroup()
                                .addComponent(add_med_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(delete_med_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(138, 138, 138)
                        .addComponent(delete_med_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(update_med_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_pnlLayout.createSequentialGroup()
                        .addGap(562, 562, 562)
                        .addComponent(add_med_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(914, Short.MAX_VALUE))
        );
        main_pnlLayout.setVerticalGroup(
            main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_pnlLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(main_pnlLayout.createSequentialGroup()
                        .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(med_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(med_name_lbl))
                        .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_pnlLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(med_quantity_input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(main_pnlLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(med_quantity_lbl))))
                    .addGroup(main_pnlLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_med_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_med_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_med_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_med_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_med_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        dash_pnl.setBackground(new java.awt.Color(233, 233, 233));

        company_btn.setBackground(new java.awt.Color(233, 233, 233));
        company_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        company_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                company_btnMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(233, 233, 233));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("   Companies");

        indicator2.setBackground(new java.awt.Color(2, 152, 137));
        indicator2.setOpaque(false);

        javax.swing.GroupLayout indicator2Layout = new javax.swing.GroupLayout(indicator2);
        indicator2.setLayout(indicator2Layout);
        indicator2Layout.setHorizontalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        indicator2Layout.setVerticalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout company_btnLayout = new javax.swing.GroupLayout(company_btn);
        company_btn.setLayout(company_btnLayout);
        company_btnLayout.setHorizontalGroup(
            company_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(company_btnLayout.createSequentialGroup()
                .addComponent(indicator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        company_btnLayout.setVerticalGroup(
            company_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(company_btnLayout.createSequentialGroup()
                .addGroup(company_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(company_btnLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(company_btnLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        personal_btn.setBackground(new java.awt.Color(233, 233, 233));
        personal_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personal_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personal_btnMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout personal_btnLayout = new javax.swing.GroupLayout(personal_btn);
        personal_btn.setLayout(personal_btnLayout);
        personal_btnLayout.setHorizontalGroup(
            personal_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personal_btnLayout.createSequentialGroup()
                .addComponent(indicator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        personal_btnLayout.setVerticalGroup(
            personal_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personal_btnLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(personal_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout profit_btnLayout = new javax.swing.GroupLayout(profit_btn);
        profit_btn.setLayout(profit_btnLayout);
        profit_btnLayout.setHorizontalGroup(
            profit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profit_btnLayout.createSequentialGroup()
                .addComponent(indicator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profit_btnLayout.setVerticalGroup(
            profit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profit_btnLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(profit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        logo_pnl.setBackground(new java.awt.Color(0, 204, 183));

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
                .addContainerGap())
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

        home_btn.setBackground(new java.awt.Color(0, 204, 183));
        home_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Home");

        indicator1.setBackground(new java.awt.Color(2, 152, 137));
        indicator1.setOpaque(false);

        javax.swing.GroupLayout indicator1Layout = new javax.swing.GroupLayout(indicator1);
        indicator1.setLayout(indicator1Layout);
        indicator1Layout.setHorizontalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        indicator1Layout.setVerticalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout home_btnLayout = new javax.swing.GroupLayout(home_btn);
        home_btn.setLayout(home_btnLayout);
        home_btnLayout.setHorizontalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_btnLayout.createSequentialGroup()
                .addComponent(indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        home_btnLayout.setVerticalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_btnLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout dash_pnlLayout = new javax.swing.GroupLayout(dash_pnl);
        dash_pnl.setLayout(dash_pnlLayout);
        dash_pnlLayout.setHorizontalGroup(
            dash_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personal_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(company_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dash_pnlLayout.setVerticalGroup(
            dash_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_pnlLayout.createSequentialGroup()
                .addComponent(logo_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(company_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(personal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(profit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dash_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(dash_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void company_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_company_btnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new company().setVisible(true);
    }//GEN-LAST:event_company_btnMouseClicked

    private void personal_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personal_btnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new personnel().setVisible(true);
    }//GEN-LAST:event_personal_btnMouseClicked

    private void profit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profit_btnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new profit().setVisible(true);
    }//GEN-LAST:event_profit_btnMouseClicked

    private void add_med_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_med_btnMouseClicked
        // TODO add your handling code here:
        
        if(med_name_input.getText().equals("") || med_quantity_input.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Plz, Add all data!");
        }
        else{
            String DateBill = t.format(now); 
            DefaultTableModel tblModel = (DefaultTableModel)bill_table.getModel();
            String data[] = { med_name_input.getText(),med_quantity_input.getText(),DateBill};
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this,"Data Added Successfully!");
            med_name_input.setText("");
            med_quantity_input.setText("");
   
        }
    }//GEN-LAST:event_add_med_btnMouseClicked

    private void add_med_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_med_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_med_btnActionPerformed

    private void update_med_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_med_btnMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel)bill_table.getModel();
        if(bill_table.getSelectedRowCount() == 1){
            // if row selected
            String Name = med_name_input.getText();
            String Qua = med_quantity_input.getText();
            String DateBill = t.format(now);            //set to uptade value in row
            tblModel.setValueAt(Name,bill_table.getSelectedRow(), 0);
            tblModel.setValueAt(Qua,bill_table.getSelectedRow(), 1);
            tblModel.setValueAt(DateBill,bill_table.getSelectedRow(), 2);
        }
        else{
            if(bill_table.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty");
            }
            else{
                //if row nt selected || multi roe selected
                JOptionPane.showMessageDialog(this,"Plz, Select Single Row For Update");
            }
        }
    }//GEN-LAST:event_update_med_btnMouseClicked

    private void delete_med_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_med_btnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)bill_table.getModel();
        // delet row
        if(bill_table.getSelectedRowCount() == 1){
            //if single row selected
            tblModel.removeRow(bill_table.getSelectedRow());
        }
        else{
            //if row empty
            if(bill_table.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty");
            }
            else{
                //if row nt selected || multi roe selected
                JOptionPane.showMessageDialog(this,"Plz, Select Single Row For Update");
            }
        }
    }//GEN-LAST:event_delete_med_btnMouseClicked

    private void delete_med_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_med_btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_med_btn1MouseClicked

    private void delete_med_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_med_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_med_btn1ActionPerformed

    private void delete_med_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_med_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_med_btnActionPerformed

    private void add_med_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_med_btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_add_med_btn1MouseClicked

    private void add_med_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_med_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_med_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_med_btn;
    private javax.swing.JButton add_med_btn1;
    private javax.swing.JTable bill_table;
    private javax.swing.JPanel company_btn;
    private javax.swing.JPanel dash_pnl;
    private javax.swing.JButton delete_med_btn;
    private javax.swing.JButton delete_med_btn1;
    private javax.swing.JPanel home_btn;
    private javax.swing.JLabel img_logo;
    private javax.swing.JPanel indicator1;
    private javax.swing.JPanel indicator2;
    private javax.swing.JPanel indicator3;
    private javax.swing.JPanel indicator4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logo_lbl;
    private javax.swing.JPanel logo_pnl;
    private javax.swing.JPanel main_pnl;
    private javax.swing.JTextField med_name_input;
    private javax.swing.JLabel med_name_lbl;
    private javax.swing.JTextField med_quantity_input;
    private javax.swing.JLabel med_quantity_lbl;
    private javax.swing.JPanel personal_btn;
    private javax.swing.JPanel profit_btn;
    private javax.swing.JButton update_med_btn;
    // End of variables declaration//GEN-END:variables
}
