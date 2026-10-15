# DOKUMENTASI MINI PROJECT 4
### PEMROGRAMAN BERORIENTASI OBJEK
### SISTEM MANAJEMEN PANTI JOMPO

---

Nama: Alisya Octa Noor Ghina

NIM: 2509116017

Kelas: A

---

# BAB I PENDAHULUAN

## 1.1	Deskripsi Singkat

### Deskripsi Program

**Sistem Manajemen Panti Jompo Rumah Senja** merupakan program yang dirancang untuk membantu proses pengelolaan dan pendataan penghuni panti 
secara lebih terstruktur dan sistematis. Program ini memungkinkan pengguna untuk mengelola informasi penghuni melalui beberapa fitur yang 
telah disediakan.

Fitur utama yang tersedia dalam program meliputi **menambahkan data, menampilkan data, memperbarui data, menghapus data, dan mencari data 
penghuni**. Pada proses pembaruan data, pengguna dapat memperbarui informasi tertentu, seperti **usia dan kondisi penghuni**. 
Data umum yang dikelola meliputi **ID penghuni, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan**.

Dalam program ini, penghuni panti dibedakan menjadi dua kategori, yaitu **Penghuni Intensif** dan **Penghuni Mandiri**. 
Penghuni Intensif merupakan penghuni yang membutuhkan pemantauan dan perawatan lebih lanjut, sehingga memiliki informasi tambahan seperti 
**nama perawat, jadwal kontrol medis, dan jadwal pemberian obat**. Sementara itu, Penghuni Mandiri merupakan penghuni yang masih dapat 
melakukan aktivitas sehari-hari secara lebih mandiri dan memiliki informasi tambahan berupa **hobi serta kegiatan harian**.

Dalam pembuatannya, program ini menerapkan beberapa konsep **Object-Oriented Programming (OOP)**, yaitu **enkapsulasi, inheritance, 
polymorphism, abstraction, dan interface**. Selain itu, struktur program menggunakan pola **Model-View-Controller (MVC)** untuk 
memisahkan pengelolaan data, interaksi pengguna, dan pengendalian alur program. Program ini juga menerapkan metode **JDBC 
(Java Database Connectivity)** untuk mengintegrasikan program dengan database. Penerapan konsep-konsep tersebut bertujuan agar program 
memiliki struktur yang lebih terorganisir serta memudahkan proses pengembangan dan pemeliharaan kode.


## 1.2	Tujuan

Sistem Manajemen Panti Jompo dirancang dengan tujuan sebagai berikut:

- Membantu mengelola data penghuni Panti Jompo Rumah Senja secara lebih terstruktur. 
- Mempermudah dalam melakukan proses penambahan, penampilan, pembaruan, penghapusan, dan pencarian data penghuni.
- Memastikan seluruh data penghuni tersimpan secara permanen dan konsisten di dalam database.

## 1.3  Alur Singkat

Alur program dimulai dengan menampilkan Menu Utama yang berisi beberapa pilihan untuk mengelola data penghuni. Pengguna dapat memilih menu 
sesuai dengan kebutuhan, yaitu menambahkan data, menampilkan data, memperbarui data, menghapus data, mencari data penghuni, dan mencatat 
jadwal kunjungan keluarga penghuni panti. Setelah pengguna memilih salah satu menu, sistem akan menjalankan proses sesuai dengan pilihan 
tersebut.

Pada proses penambahan, penampilan, dan update data, sistem dapat menampilkan pilihan berdasarkan kategori penghuni, yaitu Penghuni Mandiri 
dan Penghuni Intensif. Ketika menambahkan data, sistem akan meminta pengguna untuk memasukkan informasi yang diperlukan sesuai dengan 
kategori penghuni yang dipilih. Setiap input yang diberikan akan melalui proses validasi untuk memastikan data yang dimasukkan sesuai dengan 
ketentuan program.

Setelah proses selesai, sistem akan menampilkan hasil dari proses yang dilakukan, seperti data yang berhasil ditambahkan, ditampilkan, 
diperbarui, dihapus, atau ditemukan. Pengguna kemudian dapat kembali ke Menu Utama untuk melakukan pengelolaan data lainnya.

Program akan terus berjalan dan menerima pilihan dari pengguna hingga pengguna memilih menu Keluar. Setelah menu tersebut dipilih, program 
akan mengakhiri proses dan keluar dari sistem.

---

# BAB II ALUR PROGRAM

## 2.1 Menu Utama

<img width="373" height="222" alt="image" src="https://github.com/user-attachments/assets/869e47df-95b8-4812-bbb7-d9370e655f20" />

Gambar di atas menampilkan Menu Utama dari program Sistem Manajemen Panti Jompo Rumah Senja. Menu ini menjadi tampilan awal yang digunakan sebagai pusat navigasi bagi pengguna dalam mengelola data penghuni panti. Terdapat beberapa pilihan menu, yaitu Tambah Data untuk menambahkan data penghuni baru, Tampilkan Data untuk melihat data penghuni yang telah tersimpan, Hapus Data untuk menghapus data penghuni, Update Data untuk memperbarui informasi penghuni, Cari Data Penghuni untuk mencari data berdasarkan informasi tertentu, mencatat data para pengunjung panti, serta Keluar untuk mengakhiri program.

Pengguna dapat memilih menu sesuai dengan kebutuhan pengelolaan data melalui pilihan nomor yang tersedia. Dengan adanya Menu Utama ini, proses pengelolaan data penghuni dapat dilakukan secara lebih terstruktur dan mudah digunakan.

## 2.2 Menu Tambah

<img width="372" height="151" alt="image" src="https://github.com/user-attachments/assets/4b7ae8fe-1b8b-4b1c-ab45-b62708fd9450" />

Gambar di atas menampilkan Menu Tambah Data pada program Sistem Manajemen Panti Jompo Rumah Senja. Pada menu ini, pengguna dapat memilih jenis penghuni yang ingin ditambahkan, yaitu Penghuni Intensif atau Penghuni Mandiri. Setiap jenis penghuni memiliki data yang perlu diinput sesuai dengan kategorinya. Setelah pengguna memilih jenis penghuni, sistem akan meminta pengguna untuk memasukkan informasi yang diperlukan, seperti ID, nama, usia, nomor telepon, jenis kelamin, serta kondisi penghuni. Dengan adanya pilihan tersebut, data penghuni dapat dikelompokkan berdasarkan jenisnya sehingga pengelolaan data menjadi lebih terstruktur.

### 2.2.1 Tambah Data Penghuni Mandiri

<img width="377" height="225" alt="image" src="https://github.com/user-attachments/assets/013d4cff-9b3e-4ceb-bf4b-1b92bf379787" />

Gambar di atas menampilkan informasi yang perlu diinput untuk menambahkan data Penghuni Mandiri. Informasi yang dimasukkan terdiri dari data umum penghuni, yaitu ID, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan. Selain itu, terdapat informasi tambahan khusus untuk Penghuni Mandiri, yaitu hobi dan kegiatan harian. Data tersebut digunakan untuk memberikan informasi yang lebih lengkap mengenai penghuni.

### 2.2.2 Tambah Data Penghuni Intensif

<img width="375" height="240" alt="image" src="https://github.com/user-attachments/assets/455229f3-25e8-48ec-9457-1949d693eb0a" />

Gambar di atas menampilkan informasi yang perlu diinput untuk menambahkan data Penghuni Intensif. Informasi yang dimasukkan terdiri dari data umum penghuni, yaitu ID, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan. Selain itu, terdapat informasi tambahan khusus untuk Penghuni Intensif, yaitu nama perawat, jadwal kontrol medis, dan jadwal pemberian obat. Informasi tambahan tersebut digunakan untuk mendukung pengelolaan dan pemantauan kebutuhan khusus penghuni intensif.

## 2.3 Menu Tampilkan

<img width="592" height="273" alt="image" src="https://github.com/user-attachments/assets/75427902-e45b-49a5-8324-47cd3aba0469" />

Gambar di atas menampilkan Menu Tampilkan Data pada program Sistem Manajemen Panti Jompo Rumah Senja. Pada menu ini, pengguna dapat memilih jenis data yang ingin ditampilkan, yaitu seluruh data penghuni, data Penghuni Mandiri, atau data Penghuni Intensif. Pilihan tersebut memudahkan pengguna dalam melihat data sesuai dengan kebutuhan.

### 2.3.1 Tampilkan Seluruh Data Penghuni

<img width="376" height="440" alt="image" src="https://github.com/user-attachments/assets/3ec01193-87c1-418e-9303-995682286a2e" />

Gambar di atas menunjukkan seluruh data penghuni Panti Jompo Rumah Senja, yang terdiri dari Penghuni Mandiri dan Penghuni Intensif. Ketika pengguna memilih menu untuk menampilkan seluruh data, sistem akan menampilkan informasi dari kedua jenis penghuni tersebut.

### 2.3.2 Tampilkan Data Penghuni Intensif

<img width="375" height="255" alt="image" src="https://github.com/user-attachments/assets/b5c37c0b-6b79-47ee-853f-5f0489b45aa2" />

Gambar di atas menunjukkan data Penghuni Intensif. Ketika pengguna memilih menu ini, sistem hanya akan menampilkan informasi penghuni yang termasuk dalam kategori Penghuni Intensif, sehingga data dapat dilihat secara lebih spesifik sesuai dengan jenis penghuni yang dipilih.

### 2.3.3 Tampilkan Data Penghuni Mandiri

<img width="377" height="239" alt="image" src="https://github.com/user-attachments/assets/fb903fa8-0de2-4730-a9d3-2ef54578ffd1" />

Gambar di atas menunjukkan data Penghuni Mandiri. Ketika pengguna memilih menu ini, sistem hanya akan menampilkan informasi penghuni yang termasuk dalam kategori Penghuni Mandiri, sehingga data dapat dilihat secara lebih spesifik sesuai dengan jenis penghuni yang dipilih.

## 2.4 Menu Update

<img width="375" height="189" alt="image" src="https://github.com/user-attachments/assets/e9aaf726-aaa1-40db-8496-f91d7757019b" />

Pada menu Update Data, pengguna dapat memilih informasi yang ingin diperbarui. Sistem menyediakan empat pilihan informasi yang dapat diubah, yaitu Usia Penghuni, Kondisi Kesehatan Penghuni, Update Informasi Khusus Penghuni Intensif, dan Update Informasi Khusus Penghuni Mandiri. 

### 2.4.1 Update Umur Penghuni

<img width="392" height="169" alt="image" src="https://github.com/user-attachments/assets/c27dabe8-5c10-4626-a3a9-68874e48b821" />

Pada menu Update Usia, pengguna perlu memasukkan ID penghuni yang ingin diperbarui usianya. Setelah ID penghuni ditemukan, pengguna dapat memasukkan usia terbaru penghuni tersebut. Kemudian sistem akan memperbarui data usia sesuai dengan input yang diberikan. Jika pengguna tidak ingin memperbarui usia penghuni, pengguna cukup menekan enter untuk melewati perbaruan itu.

### 2.4.2 Update Kondisi Penghuni

<img width="389" height="150" alt="image" src="https://github.com/user-attachments/assets/6b35a9da-4209-4a99-896a-63deedb487c5" />

Pada menu Update Kondisi, pengguna perlu memasukkan ID penghuni yang ingin diperbarui kondisi kesehatannya. Pembaruan kondisi Kesehatan ini diperlukan untuk memastikan informasi yang tersimpan sesuai dengan kondisi terkini penghuni sehingga dapat membantu pihak panti dalam melakukan pemantauan dan pengelolaan kesehatan para lansianya.

<img width="381" height="235" alt="image" src="https://github.com/user-attachments/assets/1b6c6c53-1b2b-4b3c-8ba8-26d07946cd9c" />

Gambar di atas menunjukkan hasil bahwa kondisi kesehatan penghuni panti yang terbaru telah terupdate di sistem.

### 2.4.3 Update Informasi Khusus Penghuni Intensif

<img width="384" height="183" alt="image" src="https://github.com/user-attachments/assets/14f54a72-b540-4bf5-ac42-74cea2e1c25c" />

Gambar di atas menunjukkan informasi yang dapat diperbarui pada data Penghuni Intensif. Pengguna dapat memilih informasi yang ingin diubah sesuai dengan kebutuhan. Jika pengguna tidak ingin memperbarui suatu informasi, pengguna cukup menekan tombol Enter untuk mempertahankan data yang sudah tersimpan sebelumnya. Dengan demikian, pengguna tidak perlu memasukkan kembali data yang tidak ingin diubah.

<img width="382" height="106" alt="image" src="https://github.com/user-attachments/assets/557163c7-2238-4c02-a9ed-486bc40ae7b0" />

Gambar di atas menunjukkan pesan yang ditampilkan oleh sistem ketika pengguna memasukkan ID yang tidak terdaftar sebagai penghuni Intensif. Sistem akan melakukan pengecekan terhadap ID yang dimasukkan, kemudian menampilkan pesan bahwa ID tersebut bukan merupakan ID penghuni Intensif. Pesan ini membantu pengguna memastikan bahwa data yang akan diproses sesuai dengan jenis penghuni yang dipilih.

### 2.4.4 Update Informasi Khusus Penghuni Mandiri

<img width="388" height="172" alt="image" src="https://github.com/user-attachments/assets/1005ec6e-e637-4579-8c82-48a95938cb7a" />

Gambar di atas menunjukkan informasi yang dapat diperbarui pada data Penghuni Mandiri. Pengguna dapat memilih informasi yang ingin diubah sesuai dengan kebutuhan. Jika pengguna tidak ingin memperbarui suatu informasi, pengguna cukup menekan tombol Enter untuk mempertahankan data yang sudah tersimpan sebelumnya. Dengan demikian, pengguna tidak perlu memasukkan kembali data yang tidak ingin diubah.

<img width="388" height="98" alt="image" src="https://github.com/user-attachments/assets/ff5e6a94-b6e7-449b-9c32-0db154539734" />

Gambar di atas menunjukkan pesan yang ditampilkan oleh sistem ketika pengguna memasukkan ID yang tidak terdaftar sebagai penghuni Mandiri. Sistem akan melakukan pengecekan terhadap ID yang dimasukkan, kemudian menampilkan pesan bahwa ID tersebut bukan merupakan ID penghuni Mandiri. Pesan ini membantu pengguna memastikan bahwa data yang akan diproses sesuai dengan jenis penghuni yang dipilih.

## 2.5 Menu Hapus

<img width="372" height="105" alt="image" src="https://github.com/user-attachments/assets/f47acd73-988f-4b37-833c-8772dadcdae0" />

Pada menu Hapus Data, pengguna dapat menghapus data penghuni dengan memasukkan ID penghuni yang ingin dihapus. Sistem nantinya akan mencari data berdasarkan ID yang dimasukkan, kemudian menghapus data penghuni tersebut dari daftar apabila ID ditemukan.

<img width="372" height="105" alt="image" src="https://github.com/user-attachments/assets/a6eaf2e0-ecba-46b5-a710-5c63f51f86c5" />

Gambar di atas merupakan tampilan ketika pengguna mencari penghuni dengan nama tersebut yang sebelumya sudah dihapus, sistem pasti akan menampilkan pesan bahwa pasien dengan nama tersebut tidak ditemukan.

## 2.6 Menu Cari

<img width="373" height="152" alt="image" src="https://github.com/user-attachments/assets/55f8349c-f76f-4767-9e5f-a9bc7e3243a3" />

Pada menu Cari Data Penghuni, pengguna dapat mencari informasi mengenai penghuni panti jompo dengan memasukkan ID atau nama penghuni.

<img width="373" height="105" alt="image" src="https://github.com/user-attachments/assets/46cb3af3-ffb1-4067-8e62-63a54c1165c0" />

Gambar di atas menunjukkan tampilan sistem ketika pengguna memasukkan nama penghuni yang tidak terdapat dalam data Penghuni Panti Jompo Rumah Senja. Sistem akan melakukan pencarian berdasarkan nama yang dimasukkan, kemudian menampilkan pesan bahwa data penghuni yang dicari tidak ditemukan. Hal ini bertujuan untuk memberikan informasi kepada pengguna bahwa nama tersebut belum tersedia atau tidak terdaftar dalam data penghuni panti.

<img width="373" height="290" alt="image" src="https://github.com/user-attachments/assets/2e6e2438-de08-496f-a9df-e1709ec07254" />

Gambar di atas menunjukkan tampilan sistem ketika pengguna mencari nama penghuni yang terdapat dalam data Penghuni Panti Jompo Rumah Senja. Jika nama yang dimasukkan sesuai dengan data yang tersimpan dalam sistem, sistem akan menampilkan informasi mengenai penghuni tersebut. Dengan demikian, pengguna dapat melihat data penghuni yang ditemukan berdasarkan nama yang dicari.

## 2.7 Menu Kunjungan

<img width="446" height="307" alt="image" src="https://github.com/user-attachments/assets/1e293710-2a92-4fce-bbb8-04a7a319fb88" />

Gambar di atas menunjukkan menu kunjungan pada sistem manajemen Panti Jompo Rumah Senja. Pada menu tersebut, pengguna atau admin panti jompo dapat mencatat data pengunjung yang ingin menjenguk penghuni panti. Informasi yang dicatat meliputi nama penghuni yang ingin dikunjungi serta waktu kunjungan. Setelah data kunjungan dicatat, staf admin dapat memberikan arahan kepada pengunjung mengenai tempat yang diperbolehkan untuk melakukan kunjungan. Pengunjung juga dapat menemani penghuni melakukan kegiatan atau hobinya selama kunjungan berlangsung. Selain itu, staf admin perlu memberikan informasi mengenai batas waktu kunjungan agar kegiatan kunjungan dapat berlangsung sesuai dengan ketentuan yang telah ditetapkan oleh pihak panti.

## 2.8 Menu Keluar

<img width="379" height="91" alt="image" src="https://github.com/user-attachments/assets/fce26b07-c0b1-403a-bf33-2f34ff406212" />

Pada menu Keluar, pengguna dapat memilih menu tersebut apabila telah selesai menggunakan sistem. Setelah menu dipilih, program akan menghentikan seluruh proses dan keluar dari sistem sehingga pengguna tidak dapat melakukan pengelolaan data lagi sampai program dijalankan kembali.

## 2.9 Validasi 

<img width="376" height="51" alt="image" src="https://github.com/user-attachments/assets/326379f8-f7e9-4193-b0e8-3b6a32ac89d2" />

Gambar di atas menampilkan validasi pilihan menu. Jika pengguna memasukkan pilihan yang melebihi batas yang tersedia, sistem akan menampilkan pesan peringatan seperti pada gambar.

<img width="394" height="50" alt="image" src="https://github.com/user-attachments/assets/69834fab-c8f9-4d22-90c4-18c1a9f6b2e2" />

Gambar di atas menampilkan validasi input ID. Pengguna tidak diperbolehkan memasukkan huruf pada atribut ID karena ID hanya dapat berupa angka.

<img width="395" height="51" alt="image" src="https://github.com/user-attachments/assets/06896225-93cd-4ee6-a2a7-2aa6ceef1f33" />

Gambar di atas menampilkan validasi ID. Jika pengguna memasukkan ID penghuni yang sudah tersimpan di dalam sistem, sistem akan menampilkan pesan peringatan, hal ini dilakukan untuk mencegah terjadinya duplikasi data.

<img width="390" height="55" alt="image" src="https://github.com/user-attachments/assets/3cf87de6-ce53-48da-a261-50214d06b814" />

Gambar di atas menampilkan validasi nama. Pengguna tidak diperbolehkan mengisi atribut nama dengan angka untuk menjaga kesesuaian format data nama.

<img width="379" height="51" alt="image" src="https://github.com/user-attachments/assets/36176c43-1e0e-404c-b384-eff11d33e91c" />

Gambar di atas menampilkan validasi nama. Pengguna tidak diperbolehkan mengosongkan atribut nama saat memasukkan data.

<img width="374" height="49" alt="image" src="https://github.com/user-attachments/assets/a203177c-0d37-4c4f-b041-6d3f748ebbe9" />

Gambar di atas menampilkan validasi usia. Pengguna tidak diperbolehkan memasukkan usia dengan angka negatif.

<img width="378" height="50" alt="image" src="https://github.com/user-attachments/assets/e065ca77-4a49-4c8e-a4ea-90a7fa5062e1" />

Gambar di atas menampilkan validasi nomor telepon. Pengguna tidak diperbolehkan mengisi atribut nomor telepon dengan huruf karena nomor telepon hanya dapat berupa angka.

<img width="443" height="49" alt="image" src="https://github.com/user-attachments/assets/1a7d8a9c-982d-42be-8c4b-d40f473d1c34" />

Gambar di atas menampilkan validasi jenis kelamin. Pengguna tidak diperbolehkan memasukkan angka pada atribut jenis kelamin.

<img width="394" height="45" alt="image" src="https://github.com/user-attachments/assets/3f6ee38b-e22a-41ba-9163-3572c046de2c" />

Gambar di atas menampilkan validasi kondisi kesehatan. Pengguna tidak diperbolehkan memasukkan angka pada atribut kondisi kesehatan.

---

# BAB III STRUKTUR PROGRAM

## 3.1 MVC dan Struktur File

**MVC (Model, View, Controller)** merupakan pola atau struktur dalam pembuatan proyek yang digunakan untuk memisahkan bagian data, tampilan, dan proses pengendalian program. Penerapan MVC bertujuan agar kode program lebih terstruktur, mudah dipahami, serta memudahkan proses pengembangan dan pemeliharaan program.

Pada proyek Sistem Manajemen Panti Jompo Rumah Senja, penerapan MVC dibagi menjadi tiga package, yaitu:

| Lapisan | File | Keterangan |
|---|---|---|
| model | PenghuniPanti, PenghuniIntensif, PenghuniMandiri, dan interface KunjunganKeluarga | Bertugas untuk merepresentasikan, menyimpan, dan mengelola data serta atribut yang berkaitan dengan penghuni panti. PenghuniIntensif dan PenghuniMandiri merupakan turunan dari class PenghuniPanti, sehingga dapat menerapkan konsep inheritance dalam pemrograman berorientasi objek dengan mewarisi atribut dan method dari class induknya.  Sementara itu, KunjunganKeluarga digunakan sebagai interface yang mendefinisikan perilaku atau method yang berkaitan dengan kunjungan keluarga dan dapat diimplementasikan oleh class yang membutuhkan fungsi tersebut.|
| controller | PantiService | Bertugas sebagai penghubung antara bagian Model dan View, sekaligus mengatur alur proses dalam program. Class PantiService menangani berbagai operasi terhadap data penghuni, seperti menambahkan, menampilkan, memperbarui, menghapus, dan mencari data berdasarkan input yang diberikan oleh pengguna. |
| view | PantiView | Digunakan untuk menampilkan menu utama, informasi data penghuni, hasil proses, serta pesan yang diberikan oleh sistem kepada pengguna. Dengan adanya package view, proses tampilan program dapat dipisahkan dari logika pengolahan data sehingga struktur program menjadi lebih terorganisir dan mudah dipahami.

Selain ketiga package di atas, pada struktur file program ini, saya menggunakan package lain seperti :

| Lapisan | File | Keterangan |
|---|---|---|
| model.dao | PantiDAO | `model.dao` adalah package untuk kelas Data Access Object, dan `PantiDAO` bertugas menjalankan operasi data penghuni Panti Jompo Rumah Senja (tambah, tampil, ubah, hapus, cari) melalui query ke database. Pemisahan ini membuat kelas lain tidak perlu mengetahui detail SQL. |
| utility | InputValidasi | Digunakan untuk membantu proses validasi input dari pengguna. Class ini menyediakan method yang digunakan untuk memastikan data yang dimasukkan sesuai dengan ketentuan program, seperti memvalidasi input angka, ID penghuni, serta mencegah kesalahan input yang dapat menyebabkan program mengalami error. |
| config | Koneksi & TestKoneksi | Class TestKoneksi disini berfungsi untuk mengetest apakah program telah tersambung dengan database dan class Koneksi berfungsi untuk mengintegrasikan program dengan database. |


## 3.2 Inheritance

<img width="547" height="180" alt="image" src="https://github.com/user-attachments/assets/82c1c009-1442-4233-9b51-645c89c9fdbf" />

Penggunaan keyword final pada atribut idPenghuni, nama, dan jenisKelamin berfungsi untuk menjaga agar nilai dari atribut tersebut tidak dapat 
diubah setelah diberikan nilai awal. Penggunaan final bertujuan agar data identitas utama penghuni tetap konsisten selama objek digunakan. 
Setelah atribut tersebut diinisialisasi melalui constructor, nilainya tidak dapat diberikan nilai baru melalui proses pembaruan data. 
Dengan demikian, keyword final membantu mencegah perubahan yang tidak diinginkan terhadap data penting seperti ID penghuni, nama, dan 
jenis kelamin.

<img width="665" height="131" alt="image" src="https://github.com/user-attachments/assets/692dfd4d-0f86-4906-ba8a-e853e41196d8" />

<img width="658" height="118" alt="image" src="https://github.com/user-attachments/assets/1b85df97-69be-48e3-aaba-fc691ebea2a8" />

Kedua gambar di atas adalah implementasi inheritance yang ditandai dengan penggunaan keyword extends. Keyword extends digunakan untuk 
menunjukkan bahwa class PenghuniIntensif dan PenghuniMandiri mewarisi atribut dan method dari class PenghuniPanti sebagai superclass. 
Dengan demikian, kedua subclass tersebut dapat menggunakan data dan perilaku yang sudah didefinisikan pada class PenghuniPanti serta 
menambahkan atribut atau method khusus sesuai dengan jenis penghuninya.

<img width="852" height="158" alt="image" src="https://github.com/user-attachments/assets/3dead879-1cf8-4d55-9fd1-30e32d56b9d0" />

<img width="668" height="141" alt="image" src="https://github.com/user-attachments/assets/8d508149-bc15-4730-b65c-2d82eb7fb87c" />

Kedua gambar di atas menunjukkan implementasi konsep pewarisan dari superclass ke subclass yang ditandai dengan penggunaan keyword super. 
Keyword super digunakan oleh subclass untuk mengakses atribut, method, atau constructor yang berasal dari superclass. Pada implementasi 
tersebut, subclass PenghuniIntensif dan PenghuniMandiri mewarisi atribut dan perilaku dari class PenghuniPanti, sehingga subclass dapat 
menggunakan kembali anggota yang dimiliki oleh superclass tanpa harus mendefinisikannya kembali. 

## 3.3 Encapsulation

**1. Penghuni Panti**

<img width="544" height="204" alt="image" src="https://github.com/user-attachments/assets/8f4093ed-7dcc-42dc-9bbb-13f157a68af9" />

Gambar di atas menampilkan penggunaan konsep enkapsulasi pada class PenghuniPanti. Atribut pada class PenghuniPanti diatur menggunakan access 
modifier private. Penggunaan access private bertujuan untuk membatasi akses langsung dari luar class sehingga nilai atribut tidak dapat 
dimodifikasi secara langsung dan sembarangan.

Dengan menerapkan enkapsulasi, perubahan dan pengambilan data penghuni dilakukan melalui method yang telah disediakan oleh class. 
Hal ini membantu menjaga data agar lebih terkontrol dan sesuai dengan aturan yang telah ditentukan dalam program.

**2. Penghuni Intensif**

<img width="646" height="204" alt="image" src="https://github.com/user-attachments/assets/7776224b-966f-4f86-b880-ce2b9f1da5bd" />

Gambar di atas menampilkan penggunaan konsep enkapsulasi pada class PenghuniIntensif. Atribut pada class PenghuniIntensif diatur menggunakan 
access modifier private. Penggunaan access private bertujuan untuk membatasi akses langsung dari luar class sehingga nilai atribut tidak dapat 
dimodifikasi secara langsung dan sembarangan.

**3. Penghuni Mandiri**

<img width="654" height="182" alt="image" src="https://github.com/user-attachments/assets/25f82de3-4565-42ec-8b93-cb45e59749f7" />

Gambar di atas menampilkan penggunaan konsep enkapsulasi pada class PenghuniMandiri. Atribut pada class PenghuniMandiri diatur menggunakan 
access modifier private. Penggunaan access private bertujuan untuk membatasi akses langsung dari luar class sehingga nilai atribut tidak dapat 
dimodifikasi secara langsung dan sembarangan.

## 3.4 Constructor

**1. Penghuni Panti**

<img width="601" height="185" alt="image" src="https://github.com/user-attachments/assets/2637d8ea-2890-4f2b-8677-8db478a6188c" />

Class PenghuniPanti menggunakan constructor untuk menginisialisasi nilai atribut ketika sebuah objek penghuni dibuat. Melalui constructor ini, 
data awal seperti ID, nama, usia, nomor telepon, jenis kelamin, dan kondisi kesehatan penghuni dapat langsung diberikan pada saat objek 
dibentuk, sehingga setiap objek PenghuniPanti yang dibuat sudah memiliki data lengkap tanpa perlu proses inisialisasi tambahan setelahnya.

**2. Penghuni Intensif**

<img width="852" height="158" alt="image" src="https://github.com/user-attachments/assets/3dead879-1cf8-4d55-9fd1-30e32d56b9d0" />

Gambar di atas menampilkan constructor dari kelas PenghuniIntensif, yang merupakan subclass dari kelas PenghuniPanti. Constructor ini menerima 
parameter data umum penghuni (idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi) serta parameter khusus tambahan yang hanya dimiliki oleh 
penghuni intensif, yaitu namaPerawat, kontrolMedis, dan jadwalObat.

Baris super (idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi) digunakan untuk memanggil constructor dari kelas induk (PenghuniPanti) agar 
atribut-atribut umum tersebut diinisialisasi oleh constructor kelas induknya, sehingga tidak perlu ditulis ulang di kelas anak. 
Setelah itu, ketiga atribut tambahan (namaPerawat, kontrolMedis, jadwalObat) diinisialisasi secara langsung menggunakan this, karena 
atribut-atribut tersebut memang khusus dimiliki oleh kelas PenghuniIntensif dan tidak ada di kelas induknya.

**3. Penghuni Mandiri**

<img width="668" height="141" alt="image" src="https://github.com/user-attachments/assets/8d508149-bc15-4730-b65c-2d82eb7fb87c" />

Gambar di atas menampilkan constructor dari kelas PenghuniIntensif, yang merupakan subclass dari kelas PenghuniPanti. Constructor ini menerima 
parameter data umum penghuni (idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi) serta parameter khusus tambahan yang hanya dimiliki oleh 
penghuni intensif, yaitu hobi dan kegiatanHarian.

Baris super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi) digunakan untuk memanggil constructor dari kelas induk (PenghuniPanti) 
agar atribut-atribut umum tersebut diinisialisasi oleh constructor kelas induknya, sehingga tidak perlu ditulis ulang di kelas anak. 
Setelah itu, kedua atribut tambahan (hobi dan kegiatanHarian) diinisialisasi secara langsung menggunakan this, karena atribut-atribut tersebut 
memang khusus dimiliki oleh kelas PenghuniMandiri dan tidak ada di kelas induknya.

## 3.5 Polymorphism

### 3.5.1 Overriding

<img width="543" height="157" alt="image" src="https://github.com/user-attachments/assets/0a14f35a-d32d-41dc-bdb5-96a4bbb48332" />

<img width="557" height="135" alt="image" src="https://github.com/user-attachments/assets/8438230e-4624-4de2-8e12-c9fa4c92840a" />

Kedua gambar di atas menunjukkan implementasi dari polymorphism metode overriding. Pada kedua gambar tersebut, method tampilkanInfo() 
dimodifikasi oleh kelas turunan (subclass) dari PenghuniPanti, yaitu PenghuniMandiri dan PenghuniIntensif. Masing-masing subclass memiliki 
implementasi method tampilkanInfo() yang berbeda sesuai dengan karakteristik dan informasi tambahan dari jenis penghuni panti tersebut. 
Dengan demikian, method yang memiliki nama sama dapat menghasilkan keluaran yang berbeda bergantung pada objek yang memanggilnya.  

### 3.5.2 Overloading

<img width="719" height="562" alt="image" src="https://github.com/user-attachments/assets/27acf0c0-e8a5-44bd-90ff-40d64d69ed57" />

Gambar di atas menunjukkan proses pemanggilan method tampilkanHeaderHasil() dan tampilkanIdTidakDitemukan() sebagai implementasi dari konsep 
polymorphism melalui metode overloading. Pemanggilan kedua method tersebut bertujuan untuk menampilkan informasi pada hasil keluaran program 
agar lebih terstruktur dan mudah dipahami.

<img width="659" height="94" alt="image" src="https://github.com/user-attachments/assets/e0d352f6-9173-4202-bb42-7f4689f1fbd1" />

<img width="658" height="96" alt="image" src="https://github.com/user-attachments/assets/51c4441b-3c09-4d43-b263-cdb741d6981f" />

Gambar di atas menunjukkan implementasi polymorphism metode overloading melalui pendefinisian method tampilkanHeaderHasil() dan 
tampilkanIdTidakDitemukan() di dalam kelas yang sama. Method tampilkanHeaderHasil() berfungsi untuk menampilkan header atau judul pada hasil 
keluaran program, sedangkan method tampilkanIdTidakDitemukan() berfungsi untuk menampilkan pesan ketika ID penghuni yang dicari tidak ditemukan.

## 3.6 Abstraction

### 3.6.1 Abstract Class

<img width="527" height="64" alt="image" src="https://github.com/user-attachments/assets/42baeb3c-7cfb-43e9-b961-f095433d2eb7" />

Gambar di atas menunjukkan penerapan konsep abstract class pada Java. Pada gambar tersebut, superclass atau kelas induk dijadikan sebagai 
abstract class yang berfungsi sebagai kelas dasar bagi subclass. Abstract class dapat memiliki atribut, constructor, serta method yang sudah 
memiliki implementasi maupun abstract method yang belum memiliki implementasi. Dengan demikian, abstract class digunakan untuk menyediakan 
struktur atau aturan umum yang nantinya dapat dikembangkan lebih lanjut oleh subclass.

### 3.6.2 Abstract Method

<img width="614" height="74" alt="image" src="https://github.com/user-attachments/assets/ef146bf2-9f7b-4798-a4fb-023ce0daf129" />

<img width="638" height="198" alt="image" src="https://github.com/user-attachments/assets/4f206fed-3bac-4b5e-a22b-ae4726f886a1" />

Kedua gambar di atas menunjukkan implementasi dari penggunaan abstract method, yaitu method getKategori() dan hitungBiayaBulanan(). 
Kedua method tersebut dideklarasikan sebagai abstract method sehingga tidak memiliki isi atau implementasi pada superclass. 
Oleh karena itu, setiap subclass yang mewarisi abstract class tersebut wajib mengimplementasikan kedua method tersebut sesuai dengan 
kebutuhan masing-masing subclass. Hal ini memungkinkan setiap subclass memiliki cara atau proses yang berbeda dalam menentukan kategori dan 
menghitung biaya bulanan.

## 3.7 Interface

<img width="515" height="108" alt="image" src="https://github.com/user-attachments/assets/5d274f34-19d6-46b8-9731-8e3682b7d766" />

Gambar di atas menunjukkan penerapan konsep interface pada Java. Pada gambar tersebut, interface KunjunganKeluarga berisi dua method yang belum 
memiliki implementasi (how-to-do), yaitu prosesKunjungan() dan getDurasiKunjunganMenit(). Kedua method tersebut berfungsi sebagai ketentuan 
yang harus diimplementasikan oleh kelas yang menggunakan interface tersebut.

<img width="665" height="131" alt="image" src="https://github.com/user-attachments/assets/692dfd4d-0f86-4906-ba8a-e853e41196d8" />

<img width="658" height="118" alt="image" src="https://github.com/user-attachments/assets/1b85df97-69be-48e3-aaba-fc691ebea2a8" />

Kedua gambar di atas menunjukkan penerapan konsep interface yang ditandai dengan penggunaan keyword implements pada subclass. 
Penggunaan keyword tersebut menunjukkan bahwa kelas turunan mengimplementasikan interface KunjunganKeluarga, sehingga wajib menyediakan 
implementasi (how-to-do) untuk method prosesKunjungan() dan getDurasiKunjunganMenit() sesuai dengan kebutuhan program.


## 3.8 JDBC
JDBC (_Java Database Connectivity_) adalah standar API bawaan Java yang berfungsi sebagai jembatan antara program Java dan database, 
seperti MySQL. Lewat JDBC, program bisa terhubung ke database, mengirim perintah SQL, lalu menerima hasilnya kembali ke dalam kode Java. 

Cara kerjanya mirip seperti penerjemah: kode Java tidak langsung bicara dengan database, melainkan lewat driver (mysql-connector-j) yang 
mengubah perintah Java menjadi sesuatu yang dipahami MySQL. JDBC dipakai di class Koneksi untuk  membuka koneksi, dan di class DAO seperti 
PantiDAO untuk menjalankan query dengan PreparedStatement.

**1. Membuat Database**
 
<img width="878" height="642" alt="image" src="https://github.com/user-attachments/assets/d01e123d-d21f-40be-8a31-f5adc54f5631" />

<img width="873" height="366" alt="image" src="https://github.com/user-attachments/assets/5993b8a8-38e1-4ba4-b59a-26e61e4841ea" />

<img width="877" height="348" alt="image" src="https://github.com/user-attachments/assets/bdc3274e-445f-4c5a-925f-860f203a7638" />

Sebelum program bisa terhubung ke database, database itu sendiri harus dibuat terlebih dulu. Dalam proyek ini, database bernama db_panti_jompo 
dibuat untuk menyimpan semua data penghuni panti. Setelah database terbentuk, data awal (dummy data) juga dimasukkan supaya saat fitur 
tampilkan data dijalankan, sudah ada isinya dan tidak perlu diketik ulang dari awal, agar lebih mudah memastikan apakah koneksi dan fitur 
baca data sudah berjalan dengan benar.

**2. Koneksi Database**
 
<img width="975" height="444" alt="image" src="https://github.com/user-attachments/assets/b588c328-ce68-4c89-8ad2-1ff7d8b7cd15" />

Gambar di atas menunjukkan class Koneksi, yaitu class yang bertugas menghubungkan program dengan database db_panti_jompo. 
Class ini menyimpan alamat database, nama pengguna, dan password MySQL, lalu membuka koneksi ke database saat dibutuhkan. 
Koneksi tidak dibuat ulang setiap kali ada permintaan, tetapi disimpan dan dipakai kembali, sehingga program bekerja lebih efisien.

<img width="975" height="318" alt="image" src="https://github.com/user-attachments/assets/a9359215-ef34-4739-adcd-306fb6eeede5" />
 
Gambar di atas menunjukkan class TestKoneksi, yaitu class untuk menguji apakah program sudah terhubung dengan database db_panti_jompo. 
Class ini memanggil Koneksi.getConnection() lalu mengecek hasilnya. Jika koneksi berhasil, program menampilkan pesan bahwa database siap 
digunakan. Jika gagal, program menampilkan pesan untuk memeriksa URL, username, password, dan apakah service MySQL sudah menyala.

**3. Import Dependency**
 
<img width="975" height="342" alt="image" src="https://github.com/user-attachments/assets/25cfe6ad-41cb-4581-99ce-22446b2e7e44" />

Gambar di atas menunjukkan penambahan dependency di file pom.xml. Dependency ini berisi driver mysql-connector-j, yaitu penerjemah yang membuat 
program Java bisa berbicara dengan MySQL melalui JDBC. Tanpa dependency ini, program tidak tahu cara terhubung ke MySQL, sehingga koneksi akan 
gagal. 

**4. DAO & Prepared Statement**

 <img width="975" height="539" alt="image" src="https://github.com/user-attachments/assets/6f7702ab-14e7-4a03-88a1-ed98670fb2e9" />

Gambar di atas menunjukkan class DAO (Data Access Object), yaitu tempat menyimpan kode yang khusus mengurus komunikasi dengan database. 
Di dalamnya terdapat perintah SQL untuk menambah, membaca, mengubah, dan menghapus data penghuni. Dengan memisahkan perintah SQL ke dalam DAO, 
bagian lain dari program tidak perlu tahu cara kerja database.

<img width="975" height="441" alt="image" src="https://github.com/user-attachments/assets/e368465e-c4a4-4234-8c8a-e35607f4ff1e" />

Gambar di atas menunjukkan penerapan PreparedStatement. Cara ini membuat perintah SQL ditulis dengan tanda “?” sebagai tempat nilai, lalu 
nilainya diisi terpisah menggunakan method seperti setString() atau setInt(). Dengan cara ini, input dari pengguna tidak dianggap sebagai 
bagian dari perintah SQL, sehingga program terhindar dari SQL Injection, yaitu serangan dengan menyisipkan kode SQL berbahaya lewat input.
