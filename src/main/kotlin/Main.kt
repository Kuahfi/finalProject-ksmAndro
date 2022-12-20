import dataMahasiswa.Mahasiswa
import dataMahasiswa.dataMahasiswa

// buat variabel utk validasi login dengan visibility modifier
private var nim: Long? = null
private var password: String? = null

fun main() {
    // akan melakukan looping jika nim tidak ditemukan || password salah
    do {
        // akan melakukan looping jika nim tidak sesuai format
        do {
            // deklarasi variabel untuk menampung error
            var nimError = false

            // meminta input nim user
            print("Masukkan NIM: ")
            var inputNim = readLine()

            // exception handling utk kasus input nim dengan abjad
            try {
                nim = inputNim?.toLong() // -> data type conversion
            } catch (err: NumberFormatException) {
                nimError = true
            }
        } while (inputNim?.length != 10 || nimError)

        // minta password user
        print("Masukkan Password: ")
        var inputPassword = readLine()

        // buat variabel utk validasi data
        var dataExist: Boolean = false

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

                    // memanggil fungsi absen dari class Mahasiswa
                    val mahasiswa = Mahasiswa(nim, nama, prodi)
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