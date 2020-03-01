package org.tensorflow.lite.examples.posenet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import kotlinx.android.synthetic.main.activity_page2.*

class page2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        fab3.setOnClickListener { view ->
            //Launch camera activity here
            val intent = Intent(this, ActualCameraActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button7).setOnClickListener {
            val intent = Intent(this, page1::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button8).setOnClickListener {
            val intent = Intent(this, page3::class.java)
            startActivity(intent)
        }
    }
}
