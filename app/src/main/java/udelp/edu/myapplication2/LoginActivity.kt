package udelp.edu.myapplication2
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val aceptarButton : Button = findViewById<Button>(R.id.aceptarLogin)
        aceptarButton.setOnClickListener {

            doLogin()
        }
    }

    fun doLogin() {

        val username: EditText = findViewById<EditText>(R.id.username)
        val password: EditText = findViewById<EditText>(R.id.password)

        val userText = username.text.toString().trim()
        val passText = password.text.toString()

        if (userText.isEmpty() || passText.isEmpty()) {
            Toast.makeText(this, "Completa usuario y contrasena", Toast.LENGTH_LONG).show()
            return
        }

        if (userText == "admin" && passText == "123") {
            Toast.makeText(this, "Login correcto", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_LONG).show()
        }

    }
}
