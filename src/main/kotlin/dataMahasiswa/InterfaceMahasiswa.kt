package dataMahasiswa

// deklarasi interface
interface InterfaceMahasiswa {
    val nim: Long
    val nama: String
    val prodi: String

    // buat fungsi absen
    fun absen(): Unit {
        println("""
================================================================================            
|            $nama, Silahkan isi absen di bawah ini:                            |
|            [1]: Hadir                                                        |
|            [2]: Sakit                                                        |
|            [3]: Izin                                                         |
================================================================================
        """.trimIndent())
    }
}