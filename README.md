# Sistem Data RQ AlHafizh

Nama : Wahid Nur Hakim

NIM : 2509116016

Sistem Informasi A'25

Latar belakang "Sistem Pengelolaan Data Santri pada Tempat Mengaji"

Program Pengelolaan dan Monitoring Panel Surya digunakan untuk mencatat dan mengelola data pemilik, instalasi, panel surya, teknisi, serta riwayat pemeriksaan dan perbaikan. Program ini membantu pengguna mengetahui lokasi pemasangan, kondisi panel, teknisi yang bertugas, dan tindakan pemeliharaan yang telah dilakukan. Dengan sistem ini, data panel surya dapat tersimpan lebih rapi, mudah dicari, dan memudahkan pengelola dalam memantau kondisi setiap panel.

Alur program dari sistem sebagai berikut.

<img width="425" height="156" alt="image" src="https://github.com/user-attachments/assets/af9a636d-9651-4cde-a697-911c62ecdc34" />

Pada awal akan memilih data apa yang ingin dikelola

<img width="582" height="494" alt="image" src="https://github.com/user-attachments/assets/053b44d1-249b-411f-bb53-13a6ff8bebf4" />

Proses penambahan data santri baru melalui opsi menu nomor 1 pada sub-menu santri. Pengguna diminta menginputkan data diri santri berupa nama, umur (5–17 tahun), dan nomor telepon wali, serta memilih kode kelas yang tersedia sebelum data disimpan. Alur Create ini berlaku sama pada class Kelas Mengaji, di mana pengguna juga diminta memasukkan input data baru berupa kode kelas, nama kelas, pengajar, dan kapasitas kelas secara terstruktur

<img width="675" height="266" alt="image" src="https://github.com/user-attachments/assets/04f70a8e-02bb-4e68-8e7d-dbd9fa931a6f" />

Fungsi untuk menampilkan seluruh data santri yang tersimpan di dalam sistem dengan memilih opsi menu nomor 2. Data disajikan secara terstruktur dalam bentuk tabel yang memuat informasi nomor urut, nama santri, umur, nomor telepon wali, serta kode kelas. Konsep alur Read ini kurang lebih sama persis jika diterapkan pada class Kelas Mengaji, yaitu sistem akan mencetak dan menampilkan daftar seluruh kelas mengaji beserta detail pengajar dan kapasitasnya ke dalam bentuk tabel.

<img width="677" height="311" alt="image" src="https://github.com/user-attachments/assets/17a50ca1-37a8-4e1c-912a-c9ba7f8f3884" />

Tampilan ini menggambarkan alur penghapusan data santri dari sistem melalui opsi menu nomor 3, di mana program menampilkan daftar data yang ada lalu meminta pengguna memilih nomor urut santri yang akan dihapus hingga muncul pesan konfirmasi. Mekanisme Delete pada class Kelas Mengaji juga menggunakan alur serupa, yaitu pengguna memilih kode atau nomor kelas yang ingin dihapus untuk mengeluarkan data kelas tersebut dari memori sistem.

<img width="673" height="543" alt="image" src="https://github.com/user-attachments/assets/4ea54c85-51e4-49b5-b77f-bf7821a92f14" />

Gambar di atas memperlihatkan alur pembaruan data kelas santri melalui opsi menu nomor 4 dengan memilih nomor santri dan memasukkan kode kelas baru hingga sistem menampilkan konfirmasi berhasil. Fungsi Update pada class Kelas Mengaji pun kurang lebih memiliki alur yang sejenis, di mana pengguna dapat memilih kelas tertentu untuk memperbarui informasi data di dalamnya, seperti mengubah nama kelas, pengajar, maupun kapasitas kelas.

# Acces Modifier

Penggunaan private bertujuan agar data tidak diakses atau diubah secara langsung dari luar class. Data hanya bisa diakses melalui method yang disediakan, seperti getter dan setter. 

Contoh penerapannya dapat dilihat pada class santri

<img width="342" height="109" alt="image" src="https://github.com/user-attachments/assets/d1647142-e0dc-4eb5-91e2-6b7d4656174e" />

Pada class santri, atribut nama, umur, no.telp wali, kelas mengaji tidak dapat diubah secara langsung dari class lain. Hal ini berupaya untuk menjaga keamanan serta konsistensi data santri.

# Enclapsulation

Enclapsulation adalah mengelompokkan informasi dan menyembunyikan data “sensitif” dari user.

Tujuan Utama Enkapsulasi mencegah data agar tidak diubah sembarangan atau bernilai tidak valid dari luar program.

Untuk contoh penerapannya

<img width="761" height="47" alt="image" src="https://github.com/user-attachments/assets/17411c2f-89d6-4568-869a-aaa02ca17c8c" />

Gambar tersebut diterapkan saat enclapsulation pada pembaruan kelas santri melalui method setKelasMengaji(). Program mengambil data santri dan kelas yang dipilih, lalu mengubah kelas santri menggunakan setter. Hal ini membuat perubahan data tetap terkontrol dan menjaga keamanan atribut kelasMengaji yang bersifat private.

# Validasi Input

Validasi input diterapkan pada beberapa bagian program untuk memastikan data yang dimasukkan pengguna sesuai dengan ketentuan. Validasi dilakukan menggunakan perulangan while (true) sehingga pengguna harus memasukkan data yang benar sebelum program melanjutkan proses.

Contoh penerapannya

<img width="504" height="146" alt="image" src="https://github.com/user-attachments/assets/e73cb881-def0-4ca3-a746-48c64a45f6e5" />

Validasi input diterapkan pada pemilihan kode kelas baru saat proses pembaruan kelas santri untuk memastikan bahwa kode kelas yang dimasukkan pengguna berupa angka. Jika pengguna memasukkan huruf, teks, atau simbol, program menampilkan pesan kesalahan dan meminta input kembali sampai data yang dimasukkan sesuai.
