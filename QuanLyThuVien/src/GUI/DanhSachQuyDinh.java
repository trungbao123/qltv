/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.LoiPhatBUS;
import DTO.LoiPhatDTO;
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

/**
 *
 * @author Lộc
 */
public class DanhSachQuyDinh extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();
    private DefaultTableModel resOfSearch;
    private LoiPhatBUS loiphatbus = new LoiPhatBUS();

    /**
     * Creates new form TheLoaiSelector
     */
    public DanhSachQuyDinh() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(50, new Color(20, 20, 50));
        txMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new RoundedPanel(10, new Color(68, 187, 236));
        jLabel4 = new javax.swing.JLabel();
        btTim = new javax.swing.JButton();
        btChon = new javax.swing.JButton();
        btTatCa = new javax.swing.JButton();
        btTaoMoi = new javax.swing.JButton();
        btDong = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txTien = new javax.swing.JTextField();
        btThem1 = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DANH SÁCH THỂ LOẠI");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 29, 65));

        jPanel2.setBackground(new java.awt.Color(30, 29, 65));

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
        jLabel2.setText("Mã lỗi:");

        txTen.setBackground(new java.awt.Color(27, 26, 67));
        txTen.setForeground(new java.awt.Color(255, 255, 255));
        txTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên lỗi:");

        jPanel3.setBackground(new java.awt.Color(20, 20, 50));

        jLabel4.setBackground(new java.awt.Color(20, 20, 50));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DANH SÁCH QUY ĐỊNH");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tiền phạt:");

        txTien.setBackground(new java.awt.Color(27, 26, 67));
        txTien.setForeground(new java.awt.Color(255, 255, 255));
        txTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTienActionPerformed(evt);
            }
        });

        btThem1.setBackground(new java.awt.Color(27, 26, 67));
        btThem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem1.setForeground(new java.awt.Color(255, 255, 255));
        btThem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/add.png"))); // NOI18N
        btThem1.setText("Thêm");
        btThem1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btThem1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThem1ActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(27, 26, 67));
        btXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/minus.png"))); // NOI18N
        btXoa.setText("Xoá");
        btXoa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btXoa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(27, 26, 67));
        btSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSua.setForeground(new java.awt.Color(255, 255, 255));
        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/edit.png"))); // NOI18N
        btSua.setText("Sửa");
        btSua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSua.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTien, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btChon, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTim)
                            .addComponent(btDong, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btThem1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(170, 170, 170))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txMa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTatCa)
                    .addComponent(btTaoMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table.setBackground(new java.awt.Color(20, 20, 50));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã lỗi", "Tên lỗi", "Tiền phạt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTatCaActionPerformed
        // TODO add your handling code here:
        if (loiphatbus.getList().size() > 0) {
            table.setModel(model);
        }
    }//GEN-LAST:event_btTatCaActionPerformed

    private void btTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaoMoiActionPerformed
        // TODO add your handling code here:
        txMa.setText("");
        txTen.setText("");
        txTien.setText("");
    }//GEN-LAST:event_btTaoMoiActionPerformed

    private void btDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDongActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btDongActionPerformed

    private void txTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenActionPerformed

    private void txMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaActionPerformed

    private void txMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txMaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txTen.requestFocus();
        }
    }//GEN-LAST:event_txMaKeyPressed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        // TODO add your handling code here:
        if (loiphatbus.getList().isEmpty()) {
            return;
        }

        String MaLP, TenLP;
        int TienPhat;
        MaLP = txMa.getText();
        TenLP = txTen.getText();
        if (txTien.getText().equals("")) {
            TienPhat = -1;
        } else {
            TienPhat = Integer.parseInt(txTien.getText());
        }

        ArrayList<LoiPhatDTO> res = new ArrayList<LoiPhatDTO>();
        res = loiphatbus.Search(MaLP, TenLP, TienPhat);

        if (res.size() == 0) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Vector header = new Vector();
            header.add("Mã lỗi phạt");
            header.add("Tên lỗi phạt");
            header.add("Tiền phạt");
            resOfSearch = new DefaultTableModel(header, 0);
            for (LoiPhatDTO lp : res) {
                Vector row = new Vector();
                row.add(lp.getMaLoiPhat());
                row.add(lp.getTenLoiPhat());
                row.add(lp.getTienPhat());
                resOfSearch.addRow(row);
            }
            table.setModel(resOfSearch);
        }
    }//GEN-LAST:event_btTimActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        if (loiphatbus.getList().size() > 0) {
            LoiPhatDTO lp = new LoiPhatDTO();
            lp = loiphatbus.getList().get(i);
            txMa.setText(lp.getMaLoiPhat());
            txTen.setText(lp.getTenLoiPhat());
            txTien.setText(String.valueOf(lp.getTienPhat()));
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonActionPerformed
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Chưa chọn lỗi phạt", "Chú ý!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            QuanLyPhieuPhat.setMaLoiPhat(loiphatbus.getList().get(i).getMaLoiPhat());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        this.dispose();
    }//GEN-LAST:event_btChonActionPerformed

    private void txTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTienActionPerformed

    private void btThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThem1ActionPerformed
        // TODO add your handling code here:
        //if(!ValidateThemSach())
        //return;

        LoiPhatDTO loiphat = new LoiPhatDTO();

        loiphat.setMaLoiPhat(txMa.getText());
        loiphat.setTenLoiPhat(txTen.getText());
        loiphat.setTienPhat(Integer.parseInt(txTien.getText()));

        try {
            loiphatbus.Add(loiphat);
        } catch (Exception ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }

        Vector row = new Vector();
        row.add(loiphat.getMaLoiPhat());
        row.add(loiphat.getTenLoiPhat());
        row.add(loiphat.getTienPhat());

        model.addRow(row);

        table.setModel(model);
    }//GEN-LAST:event_btThem1ActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        if (loiphatbus.getList().size() > 0) {
            try {
                loiphatbus.Remove(loiphatbus.getList().get(i).getMaLoiPhat());
            } catch (Exception ex) {
                Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
            }
            model.removeRow(i);
            table.setModel(model);

            txMa.setText("");
            txTen.setText("");
            txTien.setText("");
        }

    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Chọn lỗi cần chỉnh sửa", "Chú ý!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (loiphatbus.getList().size() > 0) {
            LoiPhatDTO loiphat = new LoiPhatDTO();

            loiphat.setMaLoiPhat(txMa.getText());
            loiphat.setTenLoiPhat(txTen.getText());
            loiphat.setTienPhat(Integer.parseInt(txTien.getText()));

            try {
                loiphatbus.Edit(loiphat);
            } catch (Exception ex) {
                Logger.getLogger(QuanLyMuonTra.class.getName()).log(Level.SEVERE, null, ex);
            }

            model.setValueAt(loiphat.getMaLoiPhat(), i, 0);
            model.setValueAt(loiphat.getTenLoiPhat(), i, 1);
            model.setValueAt(loiphat.getTienPhat(), i, 2);

            table.setModel(model);
        }
    }//GEN-LAST:event_btSuaActionPerformed
    public void List() throws Exception {
        if (loiphatbus.getList() == null) {
            loiphatbus.listLoiPhat();
        }
        ArrayList<LoiPhatDTO> listLP = loiphatbus.getList();
        Vector header = new Vector();
        header.add("Mã lỗi phạt");
        header.add("Tên lỗi phạt");
        header.add("Tiền phạt");
        if (model.getRowCount() == 0) {
            model = new DefaultTableModel(header, 0);
        }
        for (LoiPhatDTO lp : listLP) {
            Vector row = new Vector();
            row.add(lp.getMaLoiPhat());
            row.add(lp.getTenLoiPhat());
            row.add(lp.getTienPhat());
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
            java.util.logging.Logger.getLogger(DanhSachQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DanhSachQuyDinh dsqd = new DanhSachQuyDinh();
                try {
                    dsqd.List();
                } catch (Exception ex) {
                    Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
                }
                dsqd.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChon;
    private javax.swing.JButton btDong;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btTaoMoi;
    private javax.swing.JButton btTatCa;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThem1;
    private javax.swing.JButton btTim;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txMa;
    private javax.swing.JTextField txTen;
    private javax.swing.JTextField txTien;
    // End of variables declaration//GEN-END:variables
    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }
}
