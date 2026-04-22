package mx.unam.aragon

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView_1)
        val button = findViewById<Button>(R.id.btnEjecutar)

        tts = TextToSpeech(this, this)

        button.setOnClickListener {
            hablar()
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            textView.text = "Hola mundo esta es una prueba de Audio. Viva la UNAM"
            tts?.language = Locale("es", "MX")
        } else {
            textView.text = "No puede hablar"
        }
    }

    private fun hablar() {
        val mensaje = textView.text.toString()
        tts?.speak(mensaje, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    override fun onDestroy() {
        tts?.stop()
        tts?.shutdown()
        super.onDestroy()
    }
}