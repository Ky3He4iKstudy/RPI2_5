package dev.ky3he4ik.pract2_7

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val edit = findViewById<EditText>(R.id.editText).text
            val check = if (findViewById<CheckBox>(R.id.checkBox).isChecked) "ON" else "OFF"
            val toggle =
                if (findViewById<ToggleButton>(R.id.toggleButton).isChecked) "ON" else "OFF"
            val radio = if (findViewById<RadioButton>(R.id.radioButton).isChecked) "1" else "2"
            findViewById<TextView>(R.id.textView).text =
                "EditText: $edit\nCheckBox: $check\nToggleButton: $toggle\nRadioGroup: RadioButton $radio"
        }
    }
}