package dataMahasiswa

data class Mahasiswa(
    val nim: Long,
    val nama: String,
    val email: String,
    val password: String,
    val prodi: String,
)

val mahasiswa1 = Mahasiswa(2210511007, "Muhammad Kahfi Darmawan", "2210511007@mahasiswa.upnvj.ac.id", "kahfi", "Informatika")
val mahasiswa2 = Mahasiswa(2210511015, "Jonathan Christoper Basuki", "2210511015@mahasiswa.upnvj.ac.id", "jonathan", "Informatika")
