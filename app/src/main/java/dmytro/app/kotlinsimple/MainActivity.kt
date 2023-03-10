package dmytro.app.kotlinsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.myBtn)
        val myTitle = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        myButton.setOnClickListener {
            timesClicked += 1
            myTitle.text = timesClicked.toString()
        }
    }
}