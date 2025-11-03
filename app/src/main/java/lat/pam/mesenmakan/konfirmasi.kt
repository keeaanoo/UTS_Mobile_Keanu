package lat.pam.mesenmakan

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KonfirmasiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi)

        val tvHalo = findViewById<TextView>(R.id.tvHalo)
        val tvKonfirmasi = findViewById<TextView>(R.id.tvKonfirmasi)

        val nama = intent.getStringExtra("NAMA")
        val makanan = intent.getStringExtra("MAKANAN_DIPILIH")
        val alamat = intent.getStringExtra("ALAMAT")

        tvHalo.text = "Halo, $nama!"
        tvKonfirmasi.text =
            "Terima kasih sudah memesan $makanan.\nPesananmu akan dikirim ke:\n$alamat"
    }
}
