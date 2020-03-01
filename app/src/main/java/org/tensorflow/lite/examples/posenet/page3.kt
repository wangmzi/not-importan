package org.tensorflow.lite.examples.posenet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import kotlinx.android.synthetic.main.activity_page3.*

class page3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        fab4.setOnClickListener { view ->
            //Launch camera activity here
            val intent = Intent(this, ActualCameraActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button9).setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button10).setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
    }
}
