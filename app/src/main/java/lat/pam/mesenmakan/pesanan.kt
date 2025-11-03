package lat.pam.mesenmakan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PesananActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesanan)

        val tvPesanan = findViewById<TextView>(R.id.tvPesanan)
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        val makananDipilih = intent.getStringExtra("MAKANAN_DIPILIH")
        tvPesanan.text = "Pesanan Anda: $makananDipilih"

        btnKirim.setOnClickListener {
            val intent = Intent(this, AlamatPengirimanActivity::class.java)
            intent.putExtra("MAKANAN_DIPILIH", makananDipilih)
            startActivity(intent)
        }
    }
}
