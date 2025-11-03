package lat.pam.mesenmakan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etNama = findViewById<EditText>(R.id.editTextNama)
        val etUsername = findViewById<EditText>(R.id.editTextUsername)
        val etPassword = findViewById<EditText>(R.id.editTextPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val nama = etNama.text.toString()
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (nama.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Lengkapi semua data!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registrasi berhasil, silakan login.", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }
    }
}
