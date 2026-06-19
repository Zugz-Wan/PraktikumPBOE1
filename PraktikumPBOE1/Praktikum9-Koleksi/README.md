# Praktikum 9 — Koleksi (Java Collections Framework)

**Nama  :** Raffi Arditama  
**NIM   :** 24060124120020  
**Kelas :** PBO Praktikum E1  
**Tanggal :** Kamis, 7 Mei 2026

## Deskripsi

Pertemuan 9 membahas **Java Collections Framework** — kumpulan interface dan class untuk
menyimpan dan memanipulasi sekelompok objek secara terstruktur.

## Subproyek

### KoleksiKelasDasar
Menggunakan `ArrayList<String>` untuk menyimpan kumpulan nama teman.
- Operasi: `add`, `delete`, `set`, `ganti`, `isMember`, `count`, `show`

### KoleksiKelasBentukan
Menggunakan `Queue<Anabul>` (LinkedList) untuk menyimpan antrian hewan peliharaan.
- Operasi: `enqueue`, `dequeue`, `getFirst`, `isMember`, `countKucing`, `bobotKucing`, `showJenis`

## Cara Menjalankan

```bash
# KoleksiKelasDasar
cd KoleksiKelasDasar && javac -d bin src/*.java && java -cp bin MTeman

# KoleksiKelasBentukan
cd KoleksiKelasBentukan && javac -d bin src/*.java && java -cp bin MPiaraan
```
