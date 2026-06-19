# Praktikum 5 — Latihan: Abstract Class & Interface (Pajak)

**Nama  :** Raffi Arditama  
**NIM   :** 24060124120020  
**Kelas :** PBO Praktikum E1  
**Tanggal :** Kamis, 16 April 2026

## Deskripsi

Latihan tambahan pada Pertemuan 5 yang mengeksplorasi **abstract class** dan **interface** melalui
hirarki kelas bertema penghitungan pajak.

## Hirarki Kelas

```
Manusia (abstract)
├── hitungMasaKerja() — abstract
├── cetakInfo()
│
├── Pengusaha  implements Pajak  → pajak 15%, bonus masa kerja +2 th
├── Petani     implements Pajak  → pajak 0%, masa kerja sebenarnya
└── PNS        implements Pajak  → pajak 10%, bonus masa kerja +6 th

Pajak (interface)
└── hitungPajak() : double
```

## Cara Menjalankan

```bash
cd Latihan
javac -d bin src/*.java
java -cp bin MManusia
```
