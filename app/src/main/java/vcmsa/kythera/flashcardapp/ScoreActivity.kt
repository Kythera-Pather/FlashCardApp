package vcmsa.kythera.flashcardapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//End of setContentView

        val score = findViewById<TextView>(R.id.tvScore)
        val review = findViewById<Button>(R.id.btnReview)

        //Get the score from the intent
        score.text = intent.getIntExtra("score", 0).toString()
        val userName = intent.getStringExtra("UserName")
        //now added a Log to check the userName
        Log.d("userName", userName.toString())

        //Check the score and display a message saying if the user did well or can do better
        val message = if (score.text.toString().toInt() >= 3) "well done, $userName"
        else
            "can do better, $userName"
        score.text = "$message you scored ${score.text} out of 5"
        Log.d("score", score.text.toString())


        //Review button to see what the user got wrong or right and take them to the ReviewActivity
        review.setOnClickListener {
            val userAnswer = intent.getStringArrayExtra("userAnswer")
            val intent = Intent(this, ReviewActivity::class.java)
            intent.putExtra("UserName", userName)
            intent.putExtra("userAnswer", userAnswer)
            startActivity(intent)
            finish()
        }
    }//End of onCreate
}//End of ScoreActivity