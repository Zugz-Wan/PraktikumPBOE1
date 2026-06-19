/* Nama File    : MysqlMahasiswaService.java
 * Deskripsi    : Service class untuk operasi CRUD tabel mahasiswa menggunakan JDBC.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Selasa, 27 Mei 2026
 */

package com.pbo.prak.service;

import com.pbo.prak.model.Mahasiswa;
import com.pbo.prak.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {

    public void add(Mahasiswa mahasiswa) throws SQLException {
        String sql = "INSERT INTO mahasiswa(nama) VALUES (?)";
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, mahasiswa.getNama());
            ps.executeUpdate();
        }
    }

    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> result = new ArrayList<>();
        String sql = "SELECT id, nama FROM mahasiswa ORDER BY id";
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                result.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        }
        return result;
    }

    public void update(Mahasiswa mahasiswa) throws SQLException {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, mahasiswa.getNama());
            ps.setInt(2, mahasiswa.getId());
            ps.executeUpdate();
        }
    }

    public void deleteById(int id) throws SQLException {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
