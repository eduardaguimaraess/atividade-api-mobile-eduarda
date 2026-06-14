package com.example.weathernow

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    lateinit var textoResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textoResultado = findViewById(R.id.textoResultado)

        val inputCidade = findViewById<EditText>(R.id.inputCidade)
        val botaoBuscar = findViewById<Button>(R.id.botaoBuscar)
        val textoResultado = findViewById<TextView>(R.id.textoResultado)

        botaoBuscar.setOnClickListener {

            val cidade = inputCidade.text.toString()

            if (cidade.isBlank()) {
                textoResultado.text = "Digite uma cidade"
                return@setOnClickListener
            }

            textoResultado.text = "Consultando..."
            consultarClima(cidade)
        }
    }

    fun consultarClima(cidade: String) {

        val url = "https://wttr.in/$cidade?format=j1"

        val queue = Volley.newRequestQueue(this)

        val request = StringRequest(
            Request.Method.GET,
            url,
            { response ->

                val json = JSONObject(response)

                val current = json.getJSONArray("current_condition").getJSONObject(0)

                val tempAtual = current.getString("temp_C")
                val sensacao = current.getString("FeelsLikeC")
                val umidade = current.getString("humidity")
                val vento = current.getString("windspeedKmph")

                val descricao = current
                    .getJSONArray("weatherDesc")
                    .getJSONObject(0)
                    .getString("value")

                val icone = when {
                    descricao.contains("sun", true) -> "☀️"
                    descricao.contains("rain", true) -> "🌧"
                    descricao.contains("cloud", true) -> "☁️"
                    descricao.contains("storm", true) -> "⛈"
                    else -> "🌤"
                }

                val weather = json.getJSONArray("weather").getJSONObject(0)

                val tempMin = weather.getString("mintempC")
                val tempMax = weather.getString("maxtempC")

                val resultado = """
                    
                    🌡 Atual: $tempAtual °C
                    🤔 Sensação: $sensacao °C
                    
                    📈 Máx: $tempMax °C
                    📉 Mín: $tempMin °C
                    
                    $icone $descricao
                    💧 Umidade: $umidade%
                    🌬 Vento: $vento km/h
                    
                """.trimIndent()

                textoResultado.text = resultado

            },
            {
                textoResultado.text = "Erro ao consultar API"
            }
        )

        queue.add(request)
    }
}