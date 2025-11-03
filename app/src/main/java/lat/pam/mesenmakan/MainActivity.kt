package lat.pam.mesenmakan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val btnStart = findViewById<Button>(R.id.btnStart)

        btnStart.setOnClickListener {
            startActivity(Intent(this, SignChoiceActivity::class.java))
        }
    }
}
