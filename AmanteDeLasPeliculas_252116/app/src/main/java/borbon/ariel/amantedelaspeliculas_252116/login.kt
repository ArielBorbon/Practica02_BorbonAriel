package borbon.ariel.amantedelaspeliculas_252116

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val botonLogin = findViewById<Button>(R.id.btnLogin)
        val textoUsuario  = findViewById<EditText>(R.id.txtNombre)
        val textoContrasena = findViewById<EditText>(R.id.txtContrasena)





        botonLogin.setOnClickListener {

            val intentPelicula = Intent(this , MainActivity::class.java)


            val textoObtenidoUsuario = textoUsuario.text.toString()
            val textoObtenidoContrasena = textoContrasena.text.toString()

            if (textoObtenidoContrasena.isEmpty() || textoObtenidoUsuario.isEmpty()){
                textoUsuario.setText("")
                textoContrasena.setText("")
                return@setOnClickListener
            }

            startActivity(intentPelicula)

        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}