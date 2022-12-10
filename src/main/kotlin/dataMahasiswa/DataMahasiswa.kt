package dataMahasiswa

data class DataMahasiswa(
    val nim: Long,
    val nama: String,
    val email: String,
    val password: String,
    val prodi: String
)

// instansiasi data class mahasiswa
val mahasiswa1 = DataMahasiswa(2210511007,"Muhammad Kahfi Darmawan", "2210511007@mahasiswa.upnvj.ac.id", "kahfi", "Informatika")
val mahasiswa2 = DataMahasiswa(2210511015, "Jonathan Christoper Basuki", "2210511015@mahasiswa.upnvj.ac.id", "jonathan", "Informatika")


// membuat list data mahasiswa utk keperluan validasi login
var dataMahasiswa = listOf<DataMahasiswa>(mahasiswa1, mahasiswa2)