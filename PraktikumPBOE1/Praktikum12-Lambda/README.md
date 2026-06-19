# Praktikum 12 — Ekspresi Lambda

**Nama  :** Raffi Arditama  
**NIM   :** 24060124120020  
**Kelas :** PBO Praktikum E1  
**Tanggal :** Kamis, 4 Juni 2026

## Deskripsi

Pertemuan 12 membahas **ekspresi lambda** di Java — fitur utama pemrograman fungsional yang
diperkenalkan sejak Java 8. Lambda memungkinkan penulisan implementasi interface fungsional secara
ringkas tanpa perlu mendefinisikan anonymous class secara eksplisit.

## File

| File | Topik |
|---|---|
| `DiskonLambda.java` | Lambda dasar: 3 cara mengimplementasi interface fungsional `IDiskon` |
| `LambdaList.java` | Lambda sebagai parameter `forEach()` pada `ArrayList`, termasuk `stream().filter()` |
| `LambdaMap.java` | Lambda pada `HashMap.forEach()` untuk mencetak pasangan key–value |

## Sintaks Lambda

```java
// Ringkas (satu ekspresi)
(parameter) -> ekspresi

// Blok statement
(parameter) -> {
    // beberapa baris
    return nilai;
}
```

## Cara Menjalankan

```bash
cd Praktikum12-Lambda
javac -d bin src/*.java

java -cp bin DiskonLambda
java -cp bin LambdaList
java -cp bin LambdaMap
```
