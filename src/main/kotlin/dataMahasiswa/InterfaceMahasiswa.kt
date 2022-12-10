package dataMahasiswa

interface InterfaceMahasiswa {
    val nim: Long
    val nama: String
    val email: String
    val password: String
    val prodi: String

    fun absen(): Unit {
        println("""
==============================================================            
|            $nama, silahkan isi absen di bawah ini:         |
|            [1]: Hadir                                      |
|            [2]: Sakit                                      |
|            [3]: Izin                                       |
==============================================================  
        """.trimIndent())
    }
}