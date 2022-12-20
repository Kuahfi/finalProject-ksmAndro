package dataMahasiswa

import java.util.Scanner

// deklrasi class + constructor
class Mahasiswa(nim: Long, nama: String, prodi: String): InterfaceMahasiswa {
    override val nim: Long = nim
    override val nama: String = nama
    override val prodi: String = prodi

    // polymorphism
    override fun absen() {
        super.absen()

        val scan = Scanner(System.`in`)
        var absen: String? = null

        print("Masukkan absensi: ")
        var pilihan = scan.nextInt()

        when(pilihan) {
            1 -> absen = "Hadir"
            2 -> absen = "Sakit"
            3 -> absen = "Izin"
        }

        if(absen != null) {
            println("""
================================================================================            
|            Detail Absensi:
|            Nama:          $nama
|            Prodi:         $prodi
|            Keterangan:    $absen
================================================================================
        """.trimIndent())
        }
    }
}