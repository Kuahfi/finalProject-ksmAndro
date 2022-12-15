package dataMahasiswa

// deklrasi class + constructor
class Mahasiswa(nim: Long, nama: String, prodi: String): InterfaceMahasiswa {
    override val nim: Long = nim
    override val nama: String = nama
    override val prodi: String = prodi

    // polymorphism
    override fun absen() {
        super.absen()

        // TODO: AMBIL INPUT DARI USER UTK ABSEN
    }
}