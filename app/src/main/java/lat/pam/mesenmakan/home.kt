package lat.pam.mesenmakan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var radioGroupMakanan: RadioGroup
    private lateinit var btnPesan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        radioGroupMakanan = findViewById(R.id.radioGroupMakanan)
        btnPesan = findViewById(R.id.btnPesan)

        btnPesan.setOnClickListener {
            val selectedId = radioGroupMakanan.checkedRadioButtonId

            if (selectedId == -1) {
                Toast.makeText(this, "Pilih makanan dulu!", Toast.LENGTH_SHORT).show()
            } else {
                val selectedRadioButton = findViewById<RadioButton>(selectedId)
                val makananDipilih = selectedRadioButton.text.toString()

                Toast.makeText(this, "Kamu memilih: $makananDipilih", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, PesananActivity::class.java)
                intent.putExtra("MAKANAN_DIPILIH", makananDipilih)
                startActivity(intent)
            }
        }
    }
}
