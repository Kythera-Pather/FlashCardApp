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
        }//End of setContentView

        // linking the elements to the layout
        val review = findViewById<LinearLayout>(R.id.Review)
        val exit = findViewById<Button>(R.id.btnExit)
        val restart = findViewById<Button>(R.id.btnRestart)

        //  history questions that were asked
        val historyQuestions = arrayOf(
            "The Great Wall of China is visible from space with the naked eye.",
            "Albert Einstein failed maths in school",
            "The dinosaurs died from a flood",
            "World war 1 started in 1914",
            "Cleopatra was the last pharaoh of Egypt"
        )

        //The answers to the questions that were asked
        val correctAnswers = arrayOf(
            "False",
            "False",
            "False",
            "True",
            "True"
        )
        Log.d("historyQuestionsDebug", historyQuestions.joinToString())


        //Get the user's answers from the intent
        val userAnswer = intent.getStringArrayExtra("userAnswer")
        Log.d("userAnswerDebug", userAnswer?.joinToString() ?: "No answers received")


        // used chatGPT " fix my code for me"
        // link: https://chatgpt.com/c/682d7904-2214-800d-8ce5-710188f43ff1
        // fix this code (60% originality)
        //Display the user's answers and the correct answers
        for (i in historyQuestions.indices) {
            val reviewText = TextView(this)
            reviewText.text = "${i + 1}. ${historyQuestions[i]}\n" +
                    "Your Answer: ${userAnswer?.get(i) ?: "No Answer"}\n" +
                    "Correct Answer: ${correctAnswers[i]}\n"
            reviewText.setPadding(0, 16, 0, 16)
            // end of referenced code

            reviewText.textSize = 18f
            reviewText.setTextColor(resources.getColor(android.R.color.black))


            review.addView(reviewText)
        }


        //Restart button taking the user to the beginning
        restart.setOnClickListener {
            Log.d(restart.toString(), "Restart button clicked")

            //To restart and the user goes back to the welcome screen
            val intent = Intent(this, MainActivity::class.java) // Change to your actual main screen
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish() // Close current activity
        }

        //Exit button taking the user to exit the App
        exit.setOnClickListener {
            finish()
        }
    }//End of OneCreate
} //End of ReviewActivity