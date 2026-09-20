# 🚗 Sistem Manajemen Parkir Kendaraan

Program **Sistem Manajemen Parkir Kendaraan** merupakan aplikasi berbasis **Command Line Interface (CLI)** yang dibuat menggunakan bahasa pemrograman **Java**. Program ini dibuat untuk memenuhi tugas individu mata kuliah **Pemrograman Berorientasi Objek**.

---

## 👤 Identitas Mahasiswa

| Keterangan | Data |
|---|---|
| **Nama** | Az-Zahra Imsawati Sugianto |
| **NIM** | 2509116062 |
| **Mata Kuliah** | Pemrograman Berorientasi Objek |

---

## 📌 Deskripsi Studi Kasus

Tema yang dipilih adalah **Sistem Manajemen Parkir Kendaraan**. Program ini digunakan untuk mencatat dan menghitung biaya parkir berdasarkan jenis kendaraan dan lama waktu parkir. Pengguna dapat memilih dua jenis kendaraan, yaitu **Mobil** atau **Motor**. Setelah memilih jenis kendaraan, pengguna memasukkan:

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

## 🏗️ Hierarki Class

Program terdiri dari empat class utama:

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/526b5b5b-0546-41dd-b118-4ee7f4705216" />

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

## ⚙️ Alur Program

<img width="1312" height="1199" alt="image" src="https://github.com/user-attachments/assets/a8bb747d-bb72-4bee-a7a8-cee556fb3ad8" />

```

Jika pengguna memilih **1**, program akan membuat objek dari class `Mobil`.

Jika pengguna memilih **2**, program akan membuat objek dari class `Motor`.

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

## 📷 Screenshot Running Program

### 🚗 Running Program Mobil

<p align="center">
  <img 
    src="https://github.com/user-attachments/assets/f3e6ff18-c4a8-471c-88ef-764b3fff5915"
    width="300"
    alt="Tampilan Input Data Kendaraan Mobil">
</p>

Program menampilkan pilihan jenis kendaraan, yaitu Mobil dan Motor. Pengguna kemudian memasukkan nomor plat serta waktu masuk dan keluar yang digunakan untuk menghitung durasi parkir.

<p align="center">
  <img 
    src="https://github.com/user-attachments/assets/12c7904d-4e85-420e-9d42-8a8141d0fc70"
    width="300"
    alt="Tampilan Hasil Perhitungan Parkir Mobil">
</p>

Program menampilkan hasil perhitungan berupa jenis kendaraan, nomor plat, waktu masuk dan keluar, durasi parkir, tarif per jam, serta total biaya. Pada contoh tersebut, Mobil parkir selama 1 jam 30 menit dan dikenakan biaya sebesar Rp10.000


### 🏍️ Running Program Motor

<p align="center">
  <img 
    src="https://github.com/user-attachments/assets/73fcff76-a244-46be-9e05-d42e2b2fd88f"
    width="300"
    alt="Tampilan Input Data Kendaraan Motor">
</p>

Program menampilkan pilihan jenis kendaraan dan pengguna memilih 2 (Motor). Pengguna kemudian memasukkan nomor plat serta waktu masuk dan keluar yang digunakan untuk menghitung durasi parkir.

<p align="center">
  <img 
    src="https://github.com/user-attachments/assets/946b757d-298f-4779-823f-0d7089a96493"
    width="300"
    alt="Tampilan Hasil Perhitungan Parkir Motor">
</p>

Program menampilkan hasil perhitungan berupa jenis kendaraan, nomor plat, waktu masuk dan keluar, durasi parkir, tarif per jam, serta total biaya. Pada contoh tersebut, Motor parkir selama 1 jam 45 menit dan dikenakan biaya sebesar Rp4.000.
