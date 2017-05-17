Perbedaan Kelas Abstrak dengan Kelas Enkapsulasi

1. Kelas Abstrak adalah kelas yang mengandung satu metode abstrak atau lebih.
2. kelas abstrak berfungsi hanya untuk membuat atau mendeklarasikan beberapa metode tanpa implentasinya langsung.
3. Kelas abstrak lebih menjelaskan tentang fungsi dan aksi yang dapat dilakukan oleh objek, bukan bagaimana proses kerja objek sehingga bisa memiliki fungsi dan aksi.
4. contohnya : pengenalan fungsi Pensil sebagai alat tulis, tidak di jelaskan proses bagaimana si pensil di buat.

Sedangkan..

1. Enkapsulasi adalah proses pemaketan data bersama metode-metodenya.
2. Manfaat utama pengapsulan adalah menyembunyikan rincian-rincian implementasi dari pemakai.
3. Bagian eksternal objek sering disebut antarmuka objek karena berlaku sebagai antarmuka objek terhadap objek lain. Karena objek lain harus berkomunikasi dengan objek itu hanya melalui antarmuka maka bagian internal objek dapat dilindungi dari gangguan luar. Karena program luar tidak mengakses implementasi internal objek, implementasi internal dapat berubah tanpa mempengaruhi bagian-bagian program yang lain.
4. Pengapsulan menyediakan dua manfaat utama bagi pemrogram, yaitu:
  A.     Penyembunyian informasi
Penyembunyian implementasi (implementation hiding) mengacu perlindungan implementasi internal objek. Objek disusun dari antarmuka public dan bagian private yang merupakan kombinasi data dan metode internal. Manfaat utama adalah bagian interlnal dapat berubah tanpa mempengaruhi bagian-bagian program yang lain.
  B.    Modularitas
Modularitas (modularity) berarti objek dapat dikelola secara independen. Karena kode sumber bagian internal objek dikelola secara terpisah dari antarmuka, maka kita bebas melakukan modifikasi yang tidak menyebabkan masalah pada bagian-bagian lain dari sistem. Manfaat ini mempermudah mendistribusikan objek-objek di sistem. Pengapsulan pada java dilakukan dengan pembentukan kelas-kelas, yaitu keyword class. Sedangkan penyembunyian informasi dilakukan dengan pengendalian terhadap pengaksesan pembentuk kelas dengan keyword-keyword untuk kendali pengaksesan default, private, protected, dan public. Penyembunyian informasi dilakukan dengan menerapkan kendali pengaksesan private atau protected pada elemen kita.
