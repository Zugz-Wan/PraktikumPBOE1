# Praktikum 9 — Koleksi Kelas Bentukan

**Nama  :** Raffi Arditama  
**NIM   :** 24060124120020  
**Kelas :** PBO Praktikum E1  
**Tanggal :** Kamis, 7 Mei 2026

## Deskripsi

Mendemonstrasikan penggunaan **Queue** (LinkedList) dari Java Collections Framework untuk
menyimpan kumpulan objek kelas bentukan (`Anabul` dan turunannya).

## Hirarki Kelas

```
Anabul (abstract)
├── gerak()    — abstract
├── bersuara() — abstract
│
├── Anjing
├── Burung
└── Kucing
    ├── Anggora
    └── KembangTelon

Piaraan  → Queue<Anabul>
   enqueueAnabul, dequeueAnabul, countKucing, bobotKucing, showJenisAnabul
```

## Cara Menjalankan

```bash
cd KoleksiKelasBentukan
javac -d bin src/*.java
java -cp bin MPiaraan
```
