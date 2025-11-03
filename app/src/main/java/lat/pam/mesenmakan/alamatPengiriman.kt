package lat.pam.mesenmakan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AlamatPengirimanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat_pengiriman)

        val etNama = findViewById<EditText>(R.id.editTextNama)
        val etAlamat = findViewById<EditText>(R.id.editTextAlamat)
        val etPatokan = findViewById<EditText>(R.id.editTextPatokan)
        val btnOrderKirim = findViewById<Button>(R.id.btnOrderKirim)

        val makanan = intent.getStringExtra("MAKANAN_DIPILIH")

        btnOrderKirim.setOnClickListener {
            val nama = etNama.text.toString()
            val alamat = etAlamat.text.toString()
            val patokan = etPatokan.text.toString()

            if (nama.isEmpty() || alamat.isEmpty() || patokan.isEmpty()) {
                Toast.makeText(this, "Isi semua data pengiriman!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, KonfirmasiActivity::class.java)
                intent.putExtra("MAKANAN_DIPILIH", makanan)
                intent.putExtra("NAMA", nama)
                intent.putExtra("ALAMAT", alamat)
                startActivity(intent)
            }
        }
    }
}
