/* Nama File    : GUI.java
 * Deskripsi    : GUI Swing untuk mendemonstrasikan operasi CRUD pada struktur data
 *                koleksi Java: List (ArrayList), Set (LinkedHashSet), dan Map (LinkedHashMap).
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Selasa, 27 Mei 2026
 */

package com.pbo.prak;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class GUI extends javax.swing.JFrame {
    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    Set<String> itemsSet = new LinkedHashSet<>();
    Map<Integer, String> itemsMap = new LinkedHashMap<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu"};
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());

    public GUI() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
        for (String data : datas) {
            dlm.addElement(data);
        }
        updateJumDataTersimpan();
        jListItem.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selected = jListItem.getSelectedValue();
                jTextFieldItem.setText(selected == null ? "" : selected);
            }
        });
    }

    private void addItem(String namaItem) { dlm.addElement(namaItem); }

    private void updateJumDataTersimpan() {
        jLabelJumlahList.setText("Data tersimpan = " + items.size());
        jLabelJumlahSet.setText("Data tersimpan = " + itemsSet.size());
        jLabelJumlahMap.setText("Data tersimpan = " + itemsMap.size());
    }

    private int getSelectedIndexOrWarn() {
        int index = jListItem.getSelectedIndex();
        if (index < 0) JOptionPane.showMessageDialog(this, "Pilih item pada list terlebih dahulu.");
        return index;
    }

    private List<String> getCurrentListSnapshot() {
        List<String> snapshot = new ArrayList<>();
        for (int i = 0; i < dlm.getSize(); i++) snapshot.add(dlm.getElementAt(i));
        return snapshot;
    }

    private void loadFromList(List<String> source) { dlm.clear(); source.forEach(dlm::addElement); }
    private void loadFromSet(Set<String> source) { dlm.clear(); source.forEach(dlm::addElement); }
    private void loadFromMap(Map<Integer, String> source) { dlm.clear(); source.values().forEach(dlm::addElement); }

    private void saveToList() { items.clear(); items.addAll(getCurrentListSnapshot()); updateJumDataTersimpan(); }
    private void saveToSet() { itemsSet.clear(); itemsSet.addAll(getCurrentListSnapshot()); updateJumDataTersimpan(); }
    private void saveToMap() {
        itemsMap.clear();
        List<String> snap = getCurrentListSnapshot();
        for (int i = 0; i < snap.size(); i++) itemsMap.put(i, snap.get(i));
        updateJumDataTersimpan();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jTextFieldItem = new javax.swing.JTextField();
        jLabelNamaItem = new javax.swing.JLabel();
        jButtonInsertList = new javax.swing.JButton();
        jButtonSaveList = new javax.swing.JButton();
        jButtonSaveSet = new javax.swing.JButton();
        jButtonInsertSet = new javax.swing.JButton();
        jButtonSaveMap = new javax.swing.JButton();
        jButtonInsertMap = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabelJumlahList = new javax.swing.JLabel();
        jLabelJumlahSet = new javax.swing.JLabel();
        jLabelJumlahMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Item 1","Item 2","Item 3","Item 4","Item 5"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1,javax.swing.GroupLayout.DEFAULT_SIZE,88,Short.MAX_VALUE).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,273,javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)));
        jLabelNamaItem.setText("Item name:");
        jButtonInsertList.setText("<- insert data List"); jButtonInsertList.addActionListener(this::jButtonInsertListActionPerformed);
        jButtonSaveList.setText("save to List ->"); jButtonSaveList.addActionListener(this::jButtonSaveListActionPerformed);
        jButtonSaveSet.setText("save to Set ->"); jButtonSaveSet.addActionListener(this::jButtonSaveSetActionPerformed);
        jButtonInsertSet.setText("<- insert data Set"); jButtonInsertSet.addActionListener(this::jButtonInsertSetActionPerformed);
        jButtonSaveMap.setText("save to Map ->"); jButtonSaveMap.addActionListener(this::jButtonSaveMapActionPerformed);
        jButtonInsertMap.setText("<- insert data Map"); jButtonInsertMap.addActionListener(this::jButtonInsertMapActionPerformed);
        jButtonAdd.setText("Add"); jButtonAdd.addActionListener(this::jButtonAddActionPerformed);
        jButtonDelete.setText("Delete"); jButtonDelete.addActionListener(this::jButtonDeleteActionPerformed);
        jButtonUpdate.setText("Update"); jButtonUpdate.addActionListener(this::jButtonUpdateActionPerformed);
        jButtonClear.setText("Clear all"); jButtonClear.addActionListener(this::jButtonClearActionPerformed);
        jLabelJumlahList.setText("Data tersimpan = 0");
        jLabelJumlahSet.setText("Data tersimpan = 0");
        jLabelJumlahMap.setText("Data tersimpan = 0");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jLabelNamaItem).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jTextFieldItem,javax.swing.GroupLayout.PREFERRED_SIZE,138,javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addComponent(jButtonSaveList,javax.swing.GroupLayout.PREFERRED_SIZE,140,javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabelJumlahList)).addGroup(layout.createSequentialGroup().addComponent(jButtonSaveSet,javax.swing.GroupLayout.PREFERRED_SIZE,140,javax.swing.GroupLayout.PREFERRED_SIZE).addGap(12,12,12).addComponent(jLabelJumlahSet)).addGroup(layout.createSequentialGroup().addComponent(jButtonSaveMap,javax.swing.GroupLayout.PREFERRED_SIZE,140,javax.swing.GroupLayout.PREFERRED_SIZE).addGap(12,12,12).addComponent(jLabelJumlahMap)).addComponent(jButtonInsertList,javax.swing.GroupLayout.PREFERRED_SIZE,140,javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButtonInsertSet,javax.swing.GroupLayout.PREFERRED_SIZE,140,javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButtonInsertMap,javax.swing.GroupLayout.PREFERRED_SIZE,140,javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButtonAdd).addComponent(jButtonUpdate)).addGap(35,35,35).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButtonClear).addComponent(jButtonDelete)))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(9,9,9).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButtonSaveList).addComponent(jLabelJumlahList)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButtonInsertList).addGap(8,8,8).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButtonSaveSet).addComponent(jLabelJumlahSet)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButtonInsertSet).addGap(8,8,8).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButtonSaveMap).addComponent(jLabelJumlahMap)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButtonInsertMap).addGap(16,16,16).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jTextFieldItem,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabelNamaItem)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButtonAdd).addComponent(jButtonDelete)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButtonUpdate).addComponent(jButtonClear))).addComponent(jPanel1,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(24,Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertListActionPerformed(java.awt.event.ActionEvent evt) { loadFromList(items); }
    private void jButtonSaveListActionPerformed(java.awt.event.ActionEvent evt) { saveToList(); }
    private void jButtonSaveSetActionPerformed(java.awt.event.ActionEvent evt) { saveToSet(); }
    private void jButtonInsertSetActionPerformed(java.awt.event.ActionEvent evt) { loadFromSet(itemsSet); }
    private void jButtonSaveMapActionPerformed(java.awt.event.ActionEvent evt) { saveToMap(); }
    private void jButtonInsertMapActionPerformed(java.awt.event.ActionEvent evt) { loadFromMap(itemsMap); }

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextFieldItem.getText().trim();
        if (input.isEmpty()) { JOptionPane.showMessageDialog(this, "Nama item tidak boleh kosong."); return; }
        addItem(input); jTextFieldItem.setText("");
    }
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        int index = getSelectedIndexOrWarn(); if (index < 0) return;
        dlm.removeElementAt(index); jTextFieldItem.setText("");
    }
    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        int index = getSelectedIndexOrWarn(); if (index < 0) return;
        String selected = jTextFieldItem.getText().trim();
        if (selected.isEmpty()) { JOptionPane.showMessageDialog(this, "Nama item tidak boleh kosong."); return; }
        dlm.setElementAt(selected, index); jTextFieldItem.setText("");
    }
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) { dlm.clear(); }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { javax.swing.UIManager.setLookAndFeel(info.getClassName()); break; }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd, jButtonClear, jButtonDelete;
    private javax.swing.JButton jButtonInsertList, jButtonInsertMap, jButtonInsertSet;
    private javax.swing.JButton jButtonSaveList, jButtonSaveMap, jButtonSaveSet, jButtonUpdate;
    private javax.swing.JLabel jLabelJumlahList, jLabelJumlahMap, jLabelJumlahSet, jLabelNamaItem;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldItem;
    // End of variables declaration//GEN-END:variables
}
