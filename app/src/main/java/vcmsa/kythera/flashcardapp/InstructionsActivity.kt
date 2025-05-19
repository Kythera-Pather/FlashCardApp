package vcmsa.kythera.flashcardapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.util.Log

class InstructionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_instructions)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//End of setContentView

        //Linking the elements
        val start = findViewById<Button>(R.id.btnStart)
        val userName = intent.getStringExtra("UserName")
        //now added a Log to check the userName
        Log.d("userName", userName.toString())

        //Start button to answer the history questions in the FlashCardActivity
        start.setOnClickListener {
            Log.d(start.toString(), "Start button clicked")

            // To next Activity with the userName
            val intent = Intent(this, FlashCardActivity::class.java)
            intent.putExtra("UserName", userName)
            startActivity(intent)
            finish()
        }
    }//End of onCreate
}//End of InstructionsActivity
