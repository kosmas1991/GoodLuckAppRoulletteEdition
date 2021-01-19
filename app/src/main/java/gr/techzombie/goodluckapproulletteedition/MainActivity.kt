package gr.techzombie.goodluckapproulletteedition

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kefalida.text = "Your lucky day"
        button.setBackgroundColor(Color.LTGRAY)
        apotelesma.text = ""
        button.text = "Generate"
        val random_number = Random()
        button.setOnClickListener {
            apotelesma.text="Gamble to " + random_number.nextInt(37).toString()

        }
    }
}
