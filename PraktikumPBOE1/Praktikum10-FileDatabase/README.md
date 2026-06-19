# Praktikum 10 — File & Database (Serialisasi & DAO)

**Nama  :** Raffi Arditama  
**NIM   :** 24060124120020  
**Kelas :** PBO Praktikum E1  
**Tanggal :** Rabu, 20 Mei 2026

## Deskripsi

Pertemuan 10 membahas dua topik utama:

1. **Serialisasi objek** — menyimpan dan membaca objek Java ke/dari file biner (`.ser`)
2. **Data Access Object (DAO)** — pola desain untuk memisahkan logika akses database dari logika bisnis,
   diimplementasi dengan JDBC ke MySQL.

## Struktur Kelas

### Serialisasi
| File | Peran |
|---|---|
| `Person.java` | Model data yang mengimplementasi `Serializable` |
| `SerializePerson.java` | Menulis objek `Person` ke file `person.ser` |
| `ReadSerializedPerson.java` | Membaca objek `Person` dari file `person.ser` |

### DAO Pattern
| File | Peran |
|---|---|
| `PersonDAO.java` | Interface DAO — mendefinisikan kontrak `savePerson()` |
| `MYSQLPersonDAO.java` | Implementasi DAO untuk MySQL |
| `DAOManager.java` | Pengelola DAO — menyimpan referensi implementasi aktif |
| `MainDAO.java` | Entry point — menjalankan alur penyimpanan data ke DB |

## Cara Menjalankan

### Serialisasi
```bash
cd src
javac SerializePerson.java Person.java
java SerializePerson          # menulis person.ser

javac ReadSerializedPerson.java Person.java
java ReadSerializedPerson      # membaca person.ser
```

### DAO (butuh MySQL)
```bash
# Siapkan database MySQL dengan tabel: CREATE TABLE person(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100));
# Sesuaikan kredensial di MYSQLPersonDAO.java
cd src
javac -cp mysql-connector-j-*.jar *.java
java -cp .:mysql-connector-j-*.jar MainDAO
```
