/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package riswanagam_191011400122_uas;

import Model.RiswanAgam_Database;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Riswan Agam
 */
public class RiswanAgam_ListTergabung extends javax.swing.JFrame {
    
    private RiswanAgam_Database database;
    private DefaultTableModel model ;
    /**
     * Creates new form RiswanAgam_ListTergabung
     */
    public RiswanAgam_ListTergabung() {
        initComponents();
        database = new RiswanAgam_Database();
        database.connection();
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        setBounds(width/2-200,height/2-350,640,630);
        setTitle("List User");
        setResizable(false);
        setTable();
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table_1 = new javax.swing.JScrollPane();
        table_2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "No tlp", "NIM", "Pekerjaan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_1.setViewportView(table_2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("List User");

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(277, 277, 277))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(table_1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(table_1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void setTable() {
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("No tlp");
        model.addColumn("NIM");
        model.addColumn("Pekerjaan");
        table_2.setModel(model);
        try {
            database.setResult(database.getStat().executeQuery("select * from customers"));
            while(database.getResult().next()) {
                model.addRow(new Object[] {
                    database.getResult().getInt("id_customer"),
                    database.getResult().getString("nama_customer"),
                    database.getResult().getString("no_tlp_customer"),
                    database.getResult().getString("NIM"),
                    database.getResult().getString("pekerjaan")
                });
            }
        }catch(SQLException e) {
           e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane table_1;
    private javax.swing.JTable table_2;
    // End of variables declaration//GEN-END:variables
}
