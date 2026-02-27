package udelp.edu.myapplication2
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        val aceptarButton: Button = findViewById(R.id.aceptarLogin)
        aceptarButton.backgroundTintList =
            ColorStateList.valueOf(ContextCompat.getColor(this, R.color.spotify_green))
        aceptarButton.setOnClickListener {
            doLogin()
        }
    }

    private fun doLogin() {

        val username: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.password)

        val userText = username.text.toString().trim()
        val passText = password.text.toString().trim()

        if (userText.isNotEmpty() && passText.isNotEmpty()) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
        }


        if (userText == "admin" && passText == "123") {
            Toast.makeText(this, "Login correcto", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_LONG).show()
        }

    }
}
