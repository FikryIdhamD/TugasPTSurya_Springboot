# TugasPTSurya_Springboot (RestAPI - Java Spring Boot)

Proyek ini adalah implementasi dari RestAPI menggunakan Java Spring Boot. Proyek ini dirancang untuk menyediakan endpoint untuk mengelola data Lokasi dan Proyek. 

## Cara Menjalankan Proyek

1. **Gunakan IntelliJ IDEA**:
   - Buka proyek ini menggunakan IntelliJ IDEA.
   - Jalankan aplikasi Spring Boot dari IntelliJ IDEA.

2. **Akses Endpoint Utama**:
   - Setelah aplikasi berjalan, Anda dapat mengakses dua link utama berikut:
     - [http://localhost:8080/lokasi](http://localhost:8080/lokasi)
     - [http://localhost:8080/proyek](http://localhost:8080/proyek)
   - Kedua endpoint tersebut dapat digunakan untuk operasi **POST** dan **GET**.

3. **Operasi PUT dan DELETE**:
   - Untuk operasi **PUT** dan **DELETE**, tambahkan **/{id}** di akhir link, misalnya:
     - PUT: `http://localhost:8080/lokasi/{id}`
     - DELETE: `http://localhost:8080/proyek/{id}`

4. **Pengujian API**:
   - Disarankan untuk menggunakan **Postman** untuk menguji fungsi **POST**, **GET**, **PUT**, dan **DELETE** dari API ini.

# Contoh Data untuk Pengisian Data Lokasi

Berikut adalah data yang bisa digunakan untuk mengisi data Lokasi di RestAPI:

```json
{
    "namaLokasi": "Jakarta Pusat",
    "negara": "Indonesia",
    "provinsi": "DKI Jakarta",
    "kota": "Jakarta Pusat"
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaLokasi": "Surabaya",
    "negara": "Indonesia",
    "provinsi": "Jawa Timur",
    "kota": "Surabaya"
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaLokasi": "Bandung",
    "negara": "Indonesia",
    "provinsi": "Jawa Barat",
    "kota": "Bandung"
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaLokasi": "Medan",
    "negara": "Indonesia",
    "provinsi": "Sumatera Utara",
    "kota": "Medan"
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaLokasi": "Makassar",
    "negara": "Indonesia",
    "provinsi": "Sulawesi Selatan",
    "kota": "Makassar"
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaLokasi": "Denpasar",
    "negara": "Indonesia",
    "provinsi": "Bali",
    "kota": "Denpasar"
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaLokasi": "Yogyakarta",
    "negara": "Indonesia",
    "provinsi": "DI Yogyakarta",
    "kota": "Yogyakarta"
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaLokasi": "Semarang",
    "negara": "Indonesia",
    "provinsi": "Jawa Tengah",
    "kota": "Semarang"
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaLokasi": "Palembang",
    "negara": "Indonesia",
    "provinsi": "Sumatera Selatan",
    "kota": "Palembang"
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaLokasi": "Balikpapan",
    "negara": "Indonesia",
    "provinsi": "Kalimantan Timur",
    "kota": "Balikpapan"
}
```

## Catatan: Masukkan data satu per satu, jangan langsung keseluruhan.

# Contoh Data untuk Pengisian Data Proyek

Berikut adalah data yang bisa digunakan untuk mengisi data Proyek di RestAPI:

```json
{
    "namaProyek": "Proyek A",
    "client": "PT. XYZ",
    "tglMulai": "2024-08-01T00:00:00",
    "tglSelesai": "2024-12-01T00:00:00",
    "pimpinanProyek": "Budi",
    "keterangan": "Proyek pembangunan gedung",
    "lokasiList": [
        { "id": 1 },
        { "id": 2 }
    ]
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaProyek": "Proyek B",
    "client": "PT. ABC",
    "tglMulai": "2024-09-01T00:00:00",
    "tglSelesai": "2025-03-01T00:00:00",
    "pimpinanProyek": "Andi",
    "keterangan": "Proyek renovasi gedung",
    "lokasiList": [
        { "id": 3 },
        { "id": 4 }
    ]
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaProyek": "Proyek C",
    "client": "PT. DEF",
    "tglMulai": "2024-10-01T00:00:00",
    "tglSelesai": "2025-04-01T00:00:00",
    "pimpinanProyek": "Citra",
    "keterangan": "Proyek instalasi jaringan",
    "lokasiList": [
        { "id": 5 },
        { "id": 6 }
    ]
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaProyek": "Proyek D",
    "client": "PT. GHI",
    "tglMulai": "2024-11-01T00:00:00",
    "tglSelesai": "2025-05-01T00:00:00",
    "pimpinanProyek": "Dedi",
    "keterangan": "Proyek pengembangan sistem IT",
    "lokasiList": [
        { "id": 7 },
        { "id": 8 }
    ]
}
```
=== [Hanya Pemisah agar tidak Bingung] ===
```json
{
    "namaProyek": "Proyek E",
    "client": "PT. JKL",
    "tglMulai": "2024-12-01T00:00:00",
    "tglSelesai": "2025-06-01T00:00:00",
    "pimpinanProyek": "Eko",
    "keterangan": "Proyek penelitian dan pengembangan",
    "lokasiList": [
        { "id": 9 },
        { "id": 10 }
    ]
}
```

## Catatan: Masukkan data satu per satu, jangan langsung keseluruhan dan Pastikan data Lokasi sudah dimasukkan terlebih dahulu sebelum mengisi data Proyek.

# Langkah Selanjutnya

Setelah semua langkah di atas selesai, Anda dapat melanjutkan untuk melihat kode dan dokumentasi lebih lanjut di repository GitHub ini: [TugasPTSurya: PHP Framework Codeigniter3](https://github.com/FikryIdhamD/TugasPTSurya_CI3_PHP) untuk melanjutkan implementasi RestAPI - Java Spring Boot pada PHP Framework Codeigniter 3
