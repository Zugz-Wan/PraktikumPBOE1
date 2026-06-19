/* Nama File    : GUI.java
 * Deskripsi    : GUI Swing untuk manajemen data Mahasiswa menggunakan JDBC + MySQL.
 *                Mendukung operasi Tambah, Ubah, Hapus, dan Refresh.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Selasa, 27 Mei 2026
 */

package com.pbo.prak.program;

import com.pbo.prak.model.Mahasiswa;
import com.pbo.prak.service.MysqlMahasiswaService;
import com.pbo.prak.utilities.MysqlUtility;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class GUI extends JFrame {
    private final MysqlMahasiswaService service;
    private final DefaultTableModel tableModel;
    private final JTable table;
    private final JTextField txtId;
    private final JTextField txtNama;

    public GUI() throws SQLException {
        MysqlUtility.initializeDatabase();
        this.service = new MysqlMahasiswaService();

        setTitle("JDBC Mahasiswa Service GUI");
        setSize(640, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tableModel = new DefaultTableModel(new Object[]{"ID", "Nama"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        txtId = new JTextField(6);
        txtId.setEditable(false);
        txtNama = new JTextField(18);

        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && table.getSelectedRow() >= 0) {
                txtId.setText(String.valueOf(tableModel.getValueAt(table.getSelectedRow(), 0)));
                txtNama.setText(String.valueOf(tableModel.getValueAt(table.getSelectedRow(), 1)));
            }
        });

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        formPanel.add(new JLabel("ID:"));
        formPanel.add(txtId);
        formPanel.add(new JLabel("Nama:"));
        formPanel.add(txtNama);

        JButton btnAdd = new JButton("Tambah");
        JButton btnUpdate = new JButton("Ubah");
        JButton btnDelete = new JButton("Hapus");
        JButton btnRefresh = new JButton("Refresh");
        JButton btnClear = new JButton("Clear");

        btnAdd.addActionListener(e -> onAdd());
        btnUpdate.addActionListener(e -> onUpdate());
        btnDelete.addActionListener(e -> onDelete());
        btnRefresh.addActionListener(e -> loadData());
        btnClear.addActionListener(e -> clearForm());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnRefresh);
        buttonPanel.add(btnClear);

        add(formPanel, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        loadData();
    }

    private void onAdd() {
        String nama = txtNama.getText().trim();
        if (nama.isEmpty()) {
            showError("Nama tidak boleh kosong.");
            return;
        }
        try {
            service.add(new Mahasiswa(nama));
            loadData();
            clearForm();
        } catch (SQLException ex) {
            showError(ex.getMessage());
        }
    }

    private void onUpdate() {
        if (txtId.getText().isBlank()) {
            showError("Pilih data yang ingin diubah.");
            return;
        }

        String nama = txtNama.getText().trim();
        if (nama.isEmpty()) {
            showError("Nama tidak boleh kosong.");
            return;
        }

        try {
            int id = Integer.parseInt(txtId.getText());
            service.update(new Mahasiswa(id, nama));
            loadData();
            clearForm();
        } catch (SQLException ex) {
            showError(ex.getMessage());
        }
    }

    private void onDelete() {
        if (txtId.getText().isBlank()) {
            showError("Pilih data yang ingin dihapus.");
            return;
        }
        try {
            int id = Integer.parseInt(txtId.getText());
            service.deleteById(id);
            loadData();
            clearForm();
        } catch (SQLException ex) {
            showError(ex.getMessage());
        }
    }

    private void loadData() {
        tableModel.setRowCount(0);
        try {
            List<Mahasiswa> list = service.getAll();
            for (Mahasiswa mahasiswa : list) {
                tableModel.addRow(new Object[]{mahasiswa.getId(), mahasiswa.getNama()});
            }
        } catch (SQLException ex) {
            showError(ex.getMessage());
        }
    }

    private void clearForm() {
        txtId.setText("");
        txtNama.setText("");
        table.clearSelection();
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new GUI().setVisible(true);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Gagal inisialisasi database: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        });
    }
}
