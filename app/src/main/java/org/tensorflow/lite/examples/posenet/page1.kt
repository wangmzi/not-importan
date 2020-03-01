package org.tensorflow.lite.examples.posenet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import kotlinx.android.synthetic.main.activity_page1.*

class page1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        fab2.setOnClickListener { view ->
            //Launch camera activity here
            val intent = Intent(this, ActualCameraActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button5).setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button6).setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent)
        }
    }
}
