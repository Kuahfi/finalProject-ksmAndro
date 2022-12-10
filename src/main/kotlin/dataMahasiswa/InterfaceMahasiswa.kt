package dataMahasiswa

interface InterfaceMahasiswa {
    val nim: Long
    val nama: String
    val email: String
    val password: String
    val prodi: String

    fun absen(): Unit {
    }
}