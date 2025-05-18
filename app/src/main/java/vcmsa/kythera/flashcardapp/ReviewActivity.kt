package vcmsa.kythera.flashcardapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val review = findViewById<LinearLayout>(R.id.Review)
        val exit = findViewById<Button>(R.id.btnExit)
        val restart = findViewById<Button>(R.id.btnRestart)



        val historyQuestions = arrayOf(
            "The Great Wall of China is visible from space with the naked eye.",
            "Albert Einstein failed maths in school",
            "The dinosaurs died from a flood",
            "World war 1 started in 1914",
            "Cleopatra was the last pharaoh of Egypt"
        )

        val correctAnswers = arrayOf(
            "False",
            "False",
            "False",
            "True",
            "True"
        )
        val userAnswer = intent.getStringArrayExtra("userAnswer")
        Log.d("userAnswerDebug", userAnswer?.joinToString() ?: "No answers received")

        for (i in historyQuestions.indices) {
            val reviewText = TextView(this)
            reviewText.text = "${i + 1}. ${historyQuestions[i]}\n" +
                    "Your Answer: ${userAnswer?.get(i) ?: "No Answer"}\n" +
                    "Correct Answer: ${correctAnswers[i]}\n"
            reviewText.setPadding(0, 16, 0, 16)

            reviewText.textSize = 18f
            reviewText.setTextColor(resources.getColor(android.R.color.black))


            review.addView(reviewText)
        }
        restart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) // Change to your actual main screen
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish() // Close current activity
        }


        exit.setOnClickListener {
            finish()
        }


    }
}