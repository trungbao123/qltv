/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.MaSachBUS;
import DTO.MaSachDTO;
import GUI.MainMenu.RoundedPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author 01042001
 */
public class MaSachSelector extends javax.swing.JFrame {

    /**
     * Creates new form MaSachSelector
     */
    private DefaultTableModel model = new DefaultTableModel();
    private DefaultTableModel resOfSearch;
    private MaSachBUS masachbus=new  MaSachBUS();
    public MaSachSelector() {
        initComponents();
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {
                Onclick();
            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {

            }

            @Override
            public void mouseExited(MouseEvent me) {

            }
        });
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
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txTen = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btTim = new javax.swing.JButton();
        btChon = new javax.swing.JButton();
        btTatCa = new javax.swing.JButton();
        btTaoMoi = new javax.swing.JButton();
        btDong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh Sách Mã Sạc");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 29, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(664, 473));

        jPanel4.setBackground(new java.awt.Color(30, 29, 65));
        jPanel4.setPreferredSize(new java.awt.Dimension(589, 210));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên thể loại:");

        txMa.setBackground(new java.awt.Color(27, 26, 67));
        txMa.setForeground(new java.awt.Color(255, 255, 255));
        txMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaActionPerformed(evt);
            }
        });
        txMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txMaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã thể loại:");

        txTen.setBackground(new java.awt.Color(27, 26, 67));
        txTen.setForeground(new java.awt.Color(255, 255, 255));
        txTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(20, 20, 50));
        jPanel5.setPreferredSize(new java.awt.Dimension(480, 37));

        jLabel1.setBackground(new java.awt.Color(20, 20, 50));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh Sách Mã Sách");
        jLabel1.setMaximumSize(new java.awt.Dimension(199, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(199, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(199, 22));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        btTim.setBackground(new java.awt.Color(27, 26, 67));
        btTim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTim.setForeground(new java.awt.Color(255, 255, 255));
        btTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/search.png"))); // NOI18N
        btTim.setText("Tìm kiếm");
        btTim.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        btChon.setBackground(new java.awt.Color(27, 26, 67));
        btChon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btChon.setForeground(new java.awt.Color(255, 255, 255));
        btChon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/select.png"))); // NOI18N
        btChon.setText("Chọn");
        btChon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonActionPerformed(evt);
            }
        });

        btTatCa.setBackground(new java.awt.Color(165, 201, 63));
        btTatCa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTatCa.setForeground(new java.awt.Color(255, 255, 255));
        btTatCa.setText("Tất cả");
        btTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTatCaActionPerformed(evt);
            }
        });

        btTaoMoi.setBackground(new java.awt.Color(255, 153, 51));
        btTaoMoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTaoMoi.setForeground(new java.awt.Color(255, 255, 255));
        btTaoMoi.setText("Tạo mới");
        btTaoMoi.setPreferredSize(new java.awt.Dimension(75, 25));
        btTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTaoMoiActionPerformed(evt);
            }
        });

        btDong.setBackground(new java.awt.Color(206, 81, 80));
        btDong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDong.setForeground(new java.awt.Color(255, 255, 255));
        btDong.setText("Đóng");
        btDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txMa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btChon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txMa, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txTen, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btChon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTaoMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTatCa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        table.setBackground(new java.awt.Color(20, 20, 50));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã thể loại", "Tên thể loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setRowHeight(25);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaActionPerformed

    private void txMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txMaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        txTen.requestFocus();
    }//GEN-LAST:event_txMaKeyPressed

    private void txTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        /*int i=table.getSelectedRow();
        if(masachbus.getList().size()>0){
            MaSachDTO tl=new MaSachDTO();
            tl=masachbus.getList().get(i);
            txMa.setText(tl.getMaMaSach());
            txTen.setText(tl.getTenMaSach());
        }*/
    }//GEN-LAST:event_tableMouseClicked

    private void btTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTatCaActionPerformed
        // TODO add your handling code here:
         if(masachbus.getList().size()>0)
            table.setModel(model);
    }//GEN-LAST:event_btTatCaActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        // TODO add your handling code here:
        if(masachbus.getList().isEmpty())
            return;
        
        String MaSach, TenSach;
        MaSach=txMa.getText();
        TenSach=txTen.getText();
        
        ArrayList<MaSachDTO> res=new ArrayList<MaSachDTO>();
        res=masachbus.Search(MaSach, TenSach);
        
        if (res.size()==0)
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        else{
            Vector header = new Vector();
            header.add("Mã sách");
            header.add("Tên sách");
            resOfSearch = new DefaultTableModel(header, 0);
            for(MaSachDTO tl: res){
                Vector row=new Vector();
                row.add(tl.getMaSach());
                row.add(tl.getTenSach());
                resOfSearch.addRow(row);
            }
            table.setModel(resOfSearch);
        }
        
    }//GEN-LAST:event_btTimActionPerformed

    private void btChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonActionPerformed
        // TODO add your handling code here:
        int i=table.getSelectedRow();
        if(i<0){
            JOptionPane.showMessageDialog(null, "Chưa chọn mã sách", "Chú ý!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }   
        try{
            QuanLyMuonTra.setMaSach(masachbus.getList().get(i).getMaSach());
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        this.dispose();
    }//GEN-LAST:event_btChonActionPerformed

    private void btTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaoMoiActionPerformed
        // TODO add your handling code here:
        txMa.setText("");
        txTen.setText("");
    }//GEN-LAST:event_btTaoMoiActionPerformed

    private void btDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDongActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btDongActionPerformed

    private void Onclick() {
        int i = table.getSelectedRow();
        if (masachbus.getList().size() > 0) {
            MaSachDTO masach = new MaSachDTO();
            masach = masachbus.getList().get(i);
            
           txMa.setText(masach.getMaSach());
           txTen.setText(masach.getTenSach());
        }
    }
    public void List() throws Exception{
        if(masachbus.getList()==null)
            masachbus.listMaSach();
        ArrayList<MaSachDTO> listMS= masachbus.getList();
        Vector header=new Vector();
        header.add("Mã Sách");
        header.add("Tên Sách");
        if (model.getRowCount() == 0) 
                model = new DefaultTableModel(header, 0);
        for(MaSachDTO tl: listMS) {
            Vector row=new Vector();
            row.add(tl.getMaSach());
            row.add(tl.getTenSach());
            model.addRow(row);
        }
        table.setModel(model);
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
            java.util.logging.Logger.getLogger(MaSachSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaSachSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaSachSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaSachSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               MaSachSelector MaSachSel=new MaSachSelector();
                try {
                    MaSachSel.List();
                } catch (Exception ex) {
                    Logger.getLogger(TheLoaiSelector.class.getName()).log(Level.SEVERE, null, ex);
                }
                MaSachSel.setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChon;
    private javax.swing.JButton btDong;
    private javax.swing.JButton btTaoMoi;
    private javax.swing.JButton btTatCa;
    private javax.swing.JButton btTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txMa;
    private javax.swing.JTextField txTen;
    // End of variables declaration//GEN-END:variables
}