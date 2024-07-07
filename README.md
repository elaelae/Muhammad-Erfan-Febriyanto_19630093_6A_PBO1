# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Nama`, `Member`, dan `Barang` adalah contoh dari class.

```bash
public class Penjualan {
    ...
}

public class PenjualanDetail extends Penjualan {
    ...
}

public class getPilihMember {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `brg[0] = new PenjualanDetail(id, nama, kodeMember, kodeBarang, totalHarga);` adalah contoh pembuatan object.

```bash
brg[0] = new PenjualanDetail(id, nama, kodeMember, kodeBarang, totalHarga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `member` adalah contoh atribut.

```bash
String nama;
String member;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Nama`, `Member`, `barang`, dan `TotalHarga`.

```bash
public  Penjualan (String id, String nama, String member, String barang, int totalHarga) {
    this.id = id;
    this.nama = nama;
    this.member = member;
    this.barang = barang;
    this.totalHarga = totalHarga;
}

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `id`, `nama`, `member`, `barang`, dan `totalHarga`  adalah contoh method mutator.

```bash
public void setId(String id) {
    this.id = id;
}
public void setNama(String nama) {
    this.nama = nama;
}
public void setMember(String member) {
    this.member = member;
}
public void setBarang(String barang) {
    this.barang = barang;
}
public void setTotalHarga(int totalHarga) {
    this.totalHarga = totalHarga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getId`, `getNama`, `getMember`, `getBarang`, dan `getTotalHarga`,  adalah contoh method accessor.

```bash
public String getId() {
    return id;
}
public String getNama() {
    return nama;
}
public String getMember() {
    return member;
}
public String getBarang() {
    return barang;
}
public int getTotalHarga() {
    return totalHarga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `id`, `nama`, `member`,  dan `barang` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String id;
private String nama;
private String member;
private String barang;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PenjualanDetail` mewarisi `Penjualan` dengan sintaks `extends`.

```bash
public class PenjualanDetail extends Penjualan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Penjualan` merupakan overloading method `displayInfo` dan `displayInfo` di `PenjualanDetail` merupakan override dari method `displayInfo` di `Penjualan`.

```bash
public String displayInfo1(String alamat){
    return displayInfo() + "\nAlamat: "+alamat;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPilihMember` dan seleksi `switch` dalam method `getPilihBarang`.

```bash
public String getPilihMember () {
        String kodeMember = getMember().substring(0, 2);
        //seleksi if
        if (kodeMember.equals("01")){
            return "Active";
        } else if (kodeMember.equals("02")){
            return "Inactive";
        } else {
            return "Kode yang anda masukkan salah";
        }
    }

public String getPilihBarang(){
        String  kodeBarang = getBarang().substring(0, 2);
        
        switch (kodeBarang) {
            case "01":
                return "Meja";
            case "02":
                return "Kursi";
            default:
                return "Barang tidak ada";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < penjualan.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Penjualan ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Penjualan:");
System.out.println(Penjualan.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PenjualanDetail[] Penjualan = new PenjualanDetail[2];` adalah contoh penggunaan array.

```bash
PenjualanDetail[] Penjualan = new PenjualanDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Erfan Febriyanto
NPM: 19630093
