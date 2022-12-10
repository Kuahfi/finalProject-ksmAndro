import dataMahasiswa.Mahasiswa
import dataMahasiswa.dataMahasiswa
import java.util.Scanner


// buat variabel utk validasi login
private var dataExist: Boolean = false
private var password: String? = null
fun main() {
    // akan melakukan looping jika nim tidak ditemukan || password salah
    do {
        // ambil input dari user
        print("Masukkan NIM: ")
        var inputNim = readLine()

        while (inputNim?.length!! != 10) {
            print("Masukkan NIM yang benar: ")
            inputNim = readLine()
        }
        var nim = inputNim.toLong() // -> konversi tipe data

        print("Masukkan Password: ")
        var inputPassword = readLine()

        // akan melakukan looping utk ngecek data mahasiswa yg ada
        for (mahasiswa in dataMahasiswa) {
            // akan melakukan validasi password berdasarkan nim yg dimasukkan
            if (mahasiswa.nim == nim) {
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
                    val mahasiswa = Mahasiswa(nama)
                    mahasiswa.absen()
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