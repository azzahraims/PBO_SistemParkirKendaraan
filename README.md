# 🚗 Sistem Manajemen Parkir Kendaraan

Program **Sistem Manajemen Parkir Kendaraan** merupakan aplikasi berbasis **Command Line Interface (CLI)** yang dibuat menggunakan bahasa pemrograman **Java**. Program ini dibuat untuk memenuhi tugas individu mata kuliah **Pemrograman Berorientasi Objek**.

---

## 👤 Identitas Mahasiswa

| Keterangan | Data |
|---|---|
| **Nama** | Nama Kamu |
| **NIM** | NIM Kamu |
| **Mata Kuliah** | Pemrograman Berorientasi Objek |
| **Bahasa Pemrograman** | Java |

---

## 📌 Deskripsi Studi Kasus

Studi kasus yang dipilih adalah **Sistem Manajemen Parkir Kendaraan**. Program ini digunakan untuk mencatat dan menghitung biaya parkir berdasarkan jenis kendaraan dan lama waktu parkir.

Pengguna dapat memilih dua jenis kendaraan, yaitu **Mobil** atau **Motor**. Setelah memilih jenis kendaraan, pengguna memasukkan:

- Nomor plat kendaraan
- Jam masuk
- Menit masuk
- Jam keluar
- Menit keluar

Program kemudian menghitung **durasi parkir** dan **total biaya parkir** secara otomatis.

Tarif parkir yang digunakan:

| Jenis Kendaraan | Tarif |
|---|---:|
| Mobil | Rp5.000/jam |
| Motor | Rp2.000/jam |

Apabila durasi parkir memiliki sisa menit, perhitungan biaya akan dibulatkan ke jam berikutnya. Contohnya, durasi parkir **1 jam 45 menit** dihitung menjadi **2 jam** untuk perhitungan biaya.

---

## 🏗️ Struktur dan Hierarki Class

Program terdiri dari empat class utama:

```text
                  Kendaraan
                 (Superclass)
                  /       \
                 /         \
              Mobil       Motor
           (Subclass)   (Subclass)


               SistemParkir
                Main Class
```

### Penjelasan Class

**1. Kendaraan**

Class `Kendaraan` berperan sebagai **superclass**. Class ini menyimpan data umum kendaraan seperti nomor plat, waktu masuk, dan waktu keluar.

Class ini juga memiliki method:

- `hitungDurasiMenit()` untuk menghitung lama parkir dalam menit.
- `tampilkanData()` untuk menampilkan data kendaraan dan durasi parkir.

**2. Mobil**

Class `Mobil` merupakan **subclass** dari `Kendaraan`. Class ini memiliki tarif parkir sebesar **Rp5.000 per jam** dan method untuk menghitung biaya parkir mobil.

**3. Motor**

Class `Motor` merupakan **subclass** dari `Kendaraan`. Class ini memiliki tarif parkir sebesar **Rp2.000 per jam** dan method untuk menghitung biaya parkir motor.

**4. SistemParkir**

Class `SistemParkir` merupakan **main class** yang digunakan untuk menjalankan program. Class ini menerima input pengguna menggunakan `Scanner`, kemudian membuat objek `Mobil` atau `Motor` sesuai pilihan pengguna.

---

## 🔗 Penerapan Inheritance

Konsep **inheritance** diterapkan dengan menjadikan class `Kendaraan` sebagai superclass, sedangkan class `Mobil` dan `Motor` sebagai subclass.

### Class Mobil

```java
public class Mobil extends Kendaraan {
```

### Class Motor

```java
public class Motor extends Kendaraan {
```

Penggunaan keyword `extends` menunjukkan bahwa class `Mobil` dan `Motor` mewarisi atribut dan method yang terdapat pada class `Kendaraan`.

Constructor pada kedua subclass juga menggunakan `super()`:

```java
super(nomorPlat, jamMasuk, menitMasuk, jamKeluar, menitKeluar);
```

`super()` digunakan untuk memanggil constructor milik superclass `Kendaraan`. Dengan inheritance, atribut dan method yang sama tidak perlu ditulis kembali pada setiap subclass.

---

## ⚙️ Alur Program

Alur kerja program adalah sebagai berikut:

```text
Mulai
  ↓
Pilih Jenis Kendaraan
  ↓
Mobil / Motor
  ↓
Masukkan Nomor Plat
  ↓
Masukkan Waktu Masuk
  ↓
Masukkan Waktu Keluar
  ↓
Hitung Durasi Parkir
  ↓
Hitung Biaya Parkir
  ↓
Tampilkan Hasil
  ↓
Selesai
```

Jika pengguna memilih **1**, program akan membuat objek dari class `Mobil`.

Jika pengguna memilih **2**, program akan membuat objek dari class `Motor`.

---

## 💻 Contoh Output Program

```text
==================================
 SISTEM MANAJEMEN PARKIR KENDARAAN
==================================
Pilih Jenis Kendaraan:
1. Mobil
2. Motor
Pilihan : 1

Nomor Plat : BK1234ABC
Jam Masuk : 9
Menit Masuk : 30
Jam Keluar : 11
Menit Keluar : 15

=== HASIL PARKIR ===
Jenis Kendaraan : Mobil
Nomor Plat : BK1234ABC
Waktu Masuk : 09.30
Waktu Keluar : 11.15
Durasi Parkir : 1 jam 45 menit
Tarif Per Jam : Rp5000
Total Biaya : Rp10000
```

---

## 📷 Screenshot Running Program

### 🚗 Running Program Mobil

![Running Program Mobil](screenshot-mobil.png)

### 🏍️ Running Program Motor

![Running Program Motor](screenshot-motor.png)

---

## 📁 Struktur Project

```text
SistemParkir
│
├── src
│   └── main
│       └── java
│           ├── com.mycompany.sistemparkir
│           │   └── SistemParkir.java
│           │
│           └── model
│               ├── Kendaraan.java
│               ├── Mobil.java
│               └── Motor.java
│
├── pom.xml
└── README.md
```

---

## 📝 Kesimpulan

Program **Sistem Manajemen Parkir Kendaraan** menerapkan konsep Pemrograman Berorientasi Objek terutama **inheritance**. Class `Mobil` dan `Motor` mewarisi atribut serta method dari class `Kendaraan`, sedangkan class `SistemParkir` digunakan untuk menjalankan program dan menerima input dari pengguna.

Penerapan inheritance membuat struktur program lebih terorganisasi karena atribut dan method yang digunakan bersama dapat ditempatkan pada superclass dan digunakan kembali oleh subclass.
