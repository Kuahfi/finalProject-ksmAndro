package dataMahasiswa

class Mahasiswa: InterfaceMahasiswa {
    override val nim: Long
        get() = TODO("Not yet implemented")
    override var nama: String = ""
        get() = TODO("Not yet implemented")
    override val email: String
        get() = TODO("Not yet implemented")
    override val password: String
        get() = TODO("Not yet implemented")
    override val prodi: String
        get() = TODO("Not yet implemented")

    override fun absen() {
        super.absen()
    }
}