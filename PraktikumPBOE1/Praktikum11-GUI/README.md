# Praktikum 11 — GUI Swing & JDBC

**Nama  :** Raffi Arditama  
**NIM   :** 24060124120020  
**Kelas :** PBO Praktikum E1  
**Tanggal :** Selasa, 27 Mei 2026

## Deskripsi

Pertemuan 11 membahas pembuatan antarmuka grafis (GUI) dengan **Java Swing** dan integrasi
ke database melalui **JDBC (Java Database Connectivity)**.

## Subproyek

### 1. GUICollection
GUI Swing sederhana untuk mendemonstrasikan operasi CRUD pada tiga struktur koleksi:
- **List** (ArrayList) — menjaga urutan, mengizinkan duplikat
- **Set** (LinkedHashSet) — menghapus duplikat, menjaga urutan insert
- **Map** (LinkedHashMap) — pasangan key–value

> Proyek ini dibuat dengan NetBeans GUI Builder (Form Editor).

### 2. JDBCMahasiswa
GUI Swing lengkap dengan koneksi JDBC ke MySQL untuk operasi CRUD tabel `mahasiswa`.

**Persyaratan:**
- MySQL Server berjalan di localhost:3306
- Sesuaikan `USER` dan `PASSWORD` di `MysqlUtility.java`
- Tambahkan `mysql-connector-j-*.jar` ke classpath

## Cara Menjalankan JDBCMahasiswa (Maven)
```bash
cd JDBCMahasiswa
mvn compile
mvn exec:java -Dexec.mainClass="com.pbo.prak.program.GUI"
```
