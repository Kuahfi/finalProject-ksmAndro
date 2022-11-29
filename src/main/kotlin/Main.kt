import dataMahasiswa.dataMahasiswa
import java.util.Scanner

fun main() {
    // buat variabel utk validasi login
    var dataExist: Boolean = false
    var password: String? = null

    // akan melakukan looping jika nim tidak ditemukan || password salah
    do {
        // ambil input dari user
        print("Masukkan NIM: ")
        var inputNim = readLine()?.toLong() // -> konversi tipe data

        print("Masukkan Password: ")
        var inputPassword = readLine()

        // akan melakukan looping utk ngecek data mahasiswa yg ada
        for (mahasiswa in dataMahasiswa) {
            // akan melakukan validasi password berdasarkan nim yg dimasukkan
            if (mahasiswa.nim == inputNim) {
                dataExist = true
                password = mahasiswa.password

                // inisialisasi variabel data mahasiswa
                val nim = mahasiswa.nim
                val nama = mahasiswa.nama
                val email = mahasiswa.email
                val prodi = mahasiswa.prodi

                // akan melakukan validasi password
                if (password == inputPassword) {
                    println("Berhasil login!")
                } else {
                    dataExist = false
                }
            }
        }

        // akan menampilkan pesan jika nim tidak ditemukan || password salah
        if (!dataExist) {
            println("NIM atau Password salah!")
        }
    } while (!dataExist || password != inputPassword)
}