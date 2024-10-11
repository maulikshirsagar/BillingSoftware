/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MTS_COMPUTER;





// import java.util.Vector;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.sql.*;
//import javax.util.vector;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;
//import java.beans.Statement;

/**
 *
 * @author HP
 */
public class sale extends javax.swing.JPanel {

   public static String barcode_c = "0";
   public static String cus_id = "0";
   
    public sale() {
        initComponents();
        data_load();
        
    }
    
    public void data_load(){
        // load customer 
        custo_table_panel.setVisible(false);
        customer_name_table.setTableHeader(null);
        
        produ_table_panel.setVisible(false);
        product_name_table.setTableHeader(null);
    
    //load last invoice number
        try {
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM extra WHERE exid =1");
            
            
            if (rs.next()) {
                
                inid.setText(rs.getString("val"));
            }
        } catch (Exception e) {
            System.out.println("Invoice No Error : "+e);
        }
        // pluses new invoice
        
        int i = Integer.valueOf(inid.getText());
        i++;
        inid.setText(String.valueOf(i));
    
    }
    
    public void pro_tot_cal(){
    
            //product calculation
            Double qt = Double.valueOf(p_qty.getText());
            Double price = Double.valueOf(u_price.getText());
            Double tot;
            tot=qt*price;
            tot_price.setText(String.valueOf(tot));
            
    }
   
    public void cart_total(){
    
    int numofrow =jTable1.getRowCount();
    
    double total =0;
    for(int i=0;i<numofrow;i++){
        
    double value = Double.valueOf(jTable1.getValueAt(i, 5).toString());
    total += value;
              
    
    }
    bill_tot.setText(Double.toString(total));
        
 
    
    // total qty count
    
    int numofrows =jTable1.getRowCount();
    
    double totals =0;
    for(int i=0;i<numofrows;i++){
        
    double values = Double.valueOf(jTable1.getValueAt(i, 3).toString());
    totals += values;
              
    
    }
    tot_qty.setText(Double.toString(totals));
    
    }  
    
    
    
    public void tot(){
        Double paid = Double.valueOf(paid_amt.getText());
        Double tot = Double.valueOf(bill_tot.getText());
        Double due;
        due= paid-tot;
        balance.setText(String.valueOf(due));
    
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inid = new javax.swing.JLabel();
        u_price = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tot_price = new javax.swing.JLabel();
        br_code = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        p_qty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        customer_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        product_name = new javax.swing.JTextField();
        custo_table_panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customer_name_table = new javax.swing.JTable();
        produ_table_panel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        product_name_table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlable7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        paid_amt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bill_tot = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tot_qty = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("INVOICE NO :");

        inid.setFont(new java.awt.Font("ZapfEllipt BT", 1, 18)); // NOI18N
        inid.setForeground(new java.awt.Color(213, 0, 0));
        inid.setText("01");

        u_price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        u_price.setText("00.00");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Unit Price:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Total Price:");

        tot_price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tot_price.setText("00.00");

        br_code.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        br_code.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inid)
                .addGap(476, 476, 476)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(u_price, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tot_price, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(br_code, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(u_price)
                        .addComponent(jLabel13)
                        .addComponent(tot_price)
                        .addComponent(br_code))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(inid)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Qty:");

        p_qty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        p_qty.setText("0");
        p_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_qtyActionPerformed(evt);
            }
        });
        p_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p_qtyKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer:");

        customer_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customer_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customer_nameFocusGained(evt);
            }
        });
        customer_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customer_nameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Product:");

        product_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        product_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                product_nameKeyReleased(evt);
            }
        });

        custo_table_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        customer_name_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customer_name_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Id", ""
            }
        ));
        customer_name_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customer_name_table.setRowHeight(25);
        customer_name_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_name_tableMouseClicked(evt);
            }
        });
        customer_name_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customer_name_tableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(customer_name_table);
        if (customer_name_table.getColumnModel().getColumnCount() > 0) {
            customer_name_table.getColumnModel().getColumn(0).setMinWidth(0);
            customer_name_table.getColumnModel().getColumn(0).setPreferredWidth(0);
            customer_name_table.getColumnModel().getColumn(0).setMaxWidth(0);
            customer_name_table.getColumnModel().getColumn(0).setHeaderValue("Id");
        }

        javax.swing.GroupLayout custo_table_panelLayout = new javax.swing.GroupLayout(custo_table_panel);
        custo_table_panel.setLayout(custo_table_panelLayout);
        custo_table_panelLayout.setHorizontalGroup(
            custo_table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        custo_table_panelLayout.setVerticalGroup(
            custo_table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );

        produ_table_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        product_name_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        product_name_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                ""
            }
        ));
        product_name_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product_name_table.setRowHeight(25);
        product_name_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_name_tableMouseClicked(evt);
            }
        });
        product_name_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_name_tableKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(product_name_table);

        javax.swing.GroupLayout produ_table_panelLayout = new javax.swing.GroupLayout(produ_table_panel);
        produ_table_panel.setLayout(produ_table_panelLayout);
        produ_table_panelLayout.setHorizontalGroup(
            produ_table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        produ_table_panelLayout.setVerticalGroup(
            produ_table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custo_table_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customer_name, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produ_table_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custo_table_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produ_table_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.No", "INID", "Product Name", "Qty", "Unit Price", "Total Price"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(0);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jlable7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Paid Amount:");

        paid_amt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paid_amt.setText("0");
        paid_amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid_amtActionPerformed(evt);
            }
        });
        paid_amt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paid_amtKeyReleased(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Total Amount:");

        bill_tot.setFont(new java.awt.Font("ZapfEllipt BT", 1, 14)); // NOI18N
        bill_tot.setText("00.00");
        bill_tot.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bill_tot.setFocusable(false);
        bill_tot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Balance /Due");

        balance.setFont(new java.awt.Font("ZapfEllipt BT", 1, 14)); // NOI18N
        balance.setText("00.00");
        balance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        balance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bill_tot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(bill_tot))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(balance))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("ZapfEllipt BT", 1, 14)); // NOI18N
        jLabel2.setText("Total Qty:");

        tot_qty.setFont(new java.awt.Font("ZapfEllipt BT", 1, 14)); // NOI18N
        tot_qty.setText("00");
        tot_qty.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jlable7Layout = new javax.swing.GroupLayout(jlable7);
        jlable7.setLayout(jlable7Layout);
        jlable7Layout.setHorizontalGroup(
            jlable7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlable7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paid_amt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tot_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jlable7Layout.setVerticalGroup(
            jlable7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlable7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jlable7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jlable7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(paid_amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(tot_qty)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setBackground(new java.awt.Color(213, 0, 0));
        jButton1.setFont(new java.awt.Font("ZapfEllipt BT", 1, 14)); // NOI18N
        jButton1.setText("Remove All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(25, 118, 210));
        jButton2.setFont(new java.awt.Font("ZapfEllipt BT", 1, 14)); // NOI18N
        jButton2.setText("Add ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(244, 67, 54));
        jButton3.setFont(new java.awt.Font("ZapfEllipt BT", 1, 14)); // NOI18N
        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(25, 118, 210));
        jButton4.setFont(new java.awt.Font("ZapfEllipt BT", 1, 18)); // NOI18N
        jButton4.setText("Pay & Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlable7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlable7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // selected remove
        try {
            
            
            DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
            int rw = jTable1.getSelectedRow();
//            System.out.println("Selected Row is : "+rw);
            if(rw == -1){
                JOptionPane.showMessageDialog(this, "Please Select Product from Table", "Instruction", JOptionPane.INFORMATION_MESSAGE);
            }
            String id =dt.getValueAt(rw,0).toString();
            dt.removeRow(rw);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        tot();
        cart_total();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            //`cartid`, `INID`, `Product_Name`, `Bar_code`, `qty`, `Unit_Price`, `Total_Price`
            DefaultTableModel dt =(DefaultTableModel) jTable1.getModel();
            int rc = dt.getRowCount();
            for (int i = 0; i < rc; i++) {
                String inid =dt.getValueAt(i, 1).toString();
                String P_name=dt.getValueAt(i, 2).toString();
//                String bar_code=dt.getValueAt(i, 3).toString();
                String qty=dt.getValueAt(i, 3).toString();
                String un_price=dt.getValueAt(i, 4).toString();
                String tot_price=dt.getValueAt(i, 5).toString();
                
                Statement s = db.mycon().createStatement();

                s.executeUpdate("INSERT INTO cart (INID, Product_Name, qty, Unit_Price, Total_Price) VALUES ('"+inid+"','"+P_name+"','"+qty+"','"+un_price+"','"+tot_price+"') ");
             
                           }
            JOptionPane.showMessageDialog(null, "Data Saved");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
             
                //sales DB
                //`saleid`, `INID`, `Cid`, `Customer_Name`, `Total_Qty`, `Total_Bill`, `Status`, `Balance`
                String inv_id = inid.getText();
//                String cname= com_cus.getSelectedItem().toString();
                String cname = customer_name.getText();
                String totqty = tot_qty.getText();
                String tot_bill = bill_tot.getText();
                String blnc = balance.getText();
                //paid check
                Double tot =Double.valueOf(bill_tot.getText());
                Double pid = Double.valueOf(paid_amt.getText());
                String Status=null;
                if(pid == 0.0){
                    Status="UnPaid";
                }else if(tot>pid){
                    Status ="Partial";
                   
                }else if(tot<pid || (Objects.equals(tot, pid))){
                    Status="Paid";
                }
                
                
//                String blnc = balance.getText();
                
                Statement ss = db.mycon().createStatement();
                ss.executeUpdate("INSERT INTO sales(INID, Cid, Customer_Name, Total_Qty, Total_Bill, Status, Balance) VALUES('"+inv_id+"','"+br_code.getText()+"','"+cname+"','"+totqty+"','"+tot_bill+"','"+Status+"','"+blnc+"')");

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        //save last inid  number
        try {
            String id = inid.getText();
            Statement ss = db.mycon().createStatement();
            ss.executeUpdate("UPDATE extra SET val='"+id+"' WHERE exid = 1");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void p_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_qtyActionPerformed
        
        pro_tot_cal();
    }//GEN-LAST:event_p_qtyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // add cart to product details
        int i=0;
        DefaultTableModel dt =(DefaultTableModel) jTable1.getModel();
         i = dt.getRowCount();
        Vector v = new Vector();
        v.add(i+1);
        v.add(inid.getText());
//        v.add(com_pro.getSelectedItem().toString());
        v.add(product_name.getText());
//        v.add(br_code.getText());
        v.add(p_qty.getText());
        v.add(u_price.getText());
        v.add(tot_price.getText());
        
        dt.addRow(v);

        cart_total();
        tot();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // remove all
        
        int remove = JOptionPane.showConfirmDialog(null, "Do you want to Remove All?");
//        System.out.println(remove);
        if(remove == 0){
        DefaultTableModel dt =(DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);
        }
        cart_total();
        tot();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void paid_amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid_amtActionPerformed
        //paid amount
        tot();
    }//GEN-LAST:event_paid_amtActionPerformed

    private void customer_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customer_nameKeyReleased
        // TODO add your handling code here:
        
        
        String name = customer_name.getText();
        custo_table_panel.setVisible(true);
        
        try {
            
            
            DefaultTableModel dt = (DefaultTableModel) customer_name_table.getModel();
            dt.setRowCount(0);
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT `cid`,`customer_name` From customer WHERE customer_name LIKE '%"+name+"%'");
//            if (rs.next()) {
                while(rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    dt.addRow(v);
            }
            
        } catch (Exception e) {
            data_load();
            
        }
        
        
//         customer_name.setText(null);
    }//GEN-LAST:event_customer_nameKeyReleased

    private void customer_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customer_nameFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_customer_nameFocusGained

    private void customer_name_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customer_name_tableKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_customer_name_tableKeyPressed

    private void customer_name_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_name_tableMouseClicked
        // TODO add your handling code here:
        
        int r = customer_name_table.getSelectedRow();
        
        String cid = customer_name_table.getValueAt(r,0).toString();
        String customer_Name = customer_name_table.getValueAt(r,1).toString();
        
        
        customer_name.setText(customer_Name);
        br_code.setText(cid);
        custo_table_panel.setVisible(false);
    }//GEN-LAST:event_customer_name_tableMouseClicked

    private void product_name_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_name_tableMouseClicked
        // TODO add your handling code here:
       
        int r = product_name_table.getSelectedRow();
        
//        String cid = product_name.getValueAt(r,0).toString();
        String product_Name = product_name_table.getValueAt(r,0).toString();
        product_name.setText(product_Name);
        
        custo_table_panel.setVisible(false);
        produ_table_panel.setVisible(false);
        
        String pro_name_unit = product_name.getText();
         
       try {
           Statement s = db.mycon().createStatement();
           ResultSet rs = s.executeQuery("SELECT price From product WHERE product_name = '"+pro_name_unit+"'");
           while(rs.next()){
               u_price.setText(rs.getString("price"));
           }
       } catch (Exception e) {
           System.out.println(e);
       }
         pro_tot_cal();
         p_qty.setText(null);
    }//GEN-LAST:event_product_name_tableMouseClicked

    private void product_name_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_name_tableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_name_tableKeyPressed

    private void product_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_nameKeyReleased
        // TODO add your handling code here:
        String pro_name = product_name.getText();
        produ_table_panel.setVisible(true);
        
        try {
            
            
            DefaultTableModel dt = (DefaultTableModel) product_name_table.getModel();
            dt.setRowCount(0);
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT product_name,price From product WHERE product_name LIKE '%"+pro_name+"%'");
//            if (rs.next()) {
                while(rs.next()) {
                    Vector v = new Vector();
//                    v.add(rs.getString(1));
                    v.add(rs.getString(1));
                    u_price.setText(rs.getString("price"));
                    dt.addRow(v);
            }
//            pro_tot_cal();
        } catch (Exception e) {
            data_load();
            
        }
        
    }//GEN-LAST:event_product_nameKeyReleased

    private void p_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_qtyKeyReleased
        // TODO add your handling code here:
        pro_tot_cal();
    }//GEN-LAST:event_p_qtyKeyReleased

    private void paid_amtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paid_amtKeyReleased
        // TODO add your handling code here:
        tot();
    }//GEN-LAST:event_paid_amtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance;
    private javax.swing.JLabel bill_tot;
    private javax.swing.JLabel br_code;
    private javax.swing.JPanel custo_table_panel;
    private javax.swing.JTextField customer_name;
    private javax.swing.JTable customer_name_table;
    private javax.swing.JLabel inid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jlable7;
    private javax.swing.JTextField p_qty;
    private javax.swing.JTextField paid_amt;
    private javax.swing.JPanel produ_table_panel;
    private javax.swing.JTextField product_name;
    private javax.swing.JTable product_name_table;
    private javax.swing.JLabel tot_price;
    private javax.swing.JLabel tot_qty;
    private javax.swing.JLabel u_price;
    // End of variables declaration//GEN-END:variables
}
