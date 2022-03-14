package dev.ky3he4ik.pract2_8

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.getSolution).setOnClickListener {
            var result: Int? = null
            do {
                val a = findViewById<EditText>(R.id.sideA).text.toString().toIntOrNull() ?: break
                val b = findViewById<EditText>(R.id.sideB).text.toString().toIntOrNull() ?: break
                val c = findViewById<EditText>(R.id.sideC).text.toString().toIntOrNull() ?: break
                result = when (findViewById<Spinner>(R.id.spinner).selectedItem.toString()) {
                    "Сумма длины ребер" -> (a + b + c) * 4
                    "Площадь поверхности" -> (a * b + b * c + a * c) * 2
                    else -> a * b * c
                }
            } while (false)
            findViewById<TextView>(R.id.solution).apply {
                text = if (result == null)
                    "Ошибка ввода"
                else
                    "Ответ: $result"
            }
        }
    }
}
