package dataMahasiswa

class Mahasiswa: InterfaceMahasiswa {
    override val nim: Long
        get() = TODO("Not yet implemented")
    override val nama: String
        get() = TODO("Not yet implemented")
    override val email: String
        get() = TODO("Not yet implemented")
    override val password: String
        get() = TODO("Not yet implemented")
    override val prodi: String
        get() = TODO("Not yet implemented")

    override fun absen() {
        println("""
==============================================================            
|            Silahkan isi absen di bawah ini:                |
|            [1]: Hadir                                      |
|            [2]: Sakit                                      |
|            [3]: Izin                                       |
==============================================================  
        """.trimIndent())
    }
}