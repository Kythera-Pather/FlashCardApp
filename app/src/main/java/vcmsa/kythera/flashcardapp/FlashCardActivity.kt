package vcmsa.kythera.flashcardapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import android.content.Intent
import android.util.Log


class FlashCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flash_card)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//End of setContentView

        //Linking the elements
        val question = findViewById<TextView>(R.id.tvQuestion)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val rbtnTrue = findViewById<RadioButton>(R.id.rbtnTrue)
        val rbtnFalse = findViewById<RadioButton>(R.id.rbtnFalse)
        val next = findViewById<Button>(R.id.btnNext)
        val userName = intent.getStringExtra("UserName")
        //now added a Log to check the userName
        Log.d("userName", userName.toString())



        // array of the questions
        val historyQuestions = arrayOf(
            "The Great Wall of China is visible from space with the naked eye.",
            "Albert Einstein failed maths in school",
            "The dinosaurs died from a flood",
            "World war 1 started in 1914",
            "Cleopatra was the last pharaoh of Egypt"
        )

        // array of the answers choice
        val answerChoice = arrayOf(
            arrayOf("True", "False"),
            arrayOf("True", "False"),
            arrayOf("True", "False"),
            arrayOf("True", "False"),
            arrayOf("True", "False")
        )

        // array of the correct answers
        var userAnswer = arrayOfNulls<String>(5)
        val correctAnswers = arrayOf(
            "False",
            "False",
            "False",
            "True",
            "True"
        )
        var counter = 0

        //Set the first question and the answers
        question.text = historyQuestions[counter]
        rbtnTrue.text = answerChoice[counter][0]
        rbtnFalse.text = answerChoice[counter][1]
        radioGroup.clearCheck()


        //Button to the next question
        next.setOnClickListener {
            if ( counter < 5) {
                var selectedOption = radioGroup.checkedRadioButtonId

                if ( selectedOption != -1) {
                    val selectedRadioButton = findViewById<RadioButton>(selectedOption)
                    userAnswer[counter] = selectedRadioButton.text.toString()

                    if (userAnswer[counter] == correctAnswers[counter]) {
                        Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show()
                    }

                    counter++
                } else {
                    Toast.makeText(this, "Please select either True or False", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                if (counter < 5) {
                    question.text = historyQuestions[counter]
                    for (i in 0 until radioGroup.childCount) {
                        val radioButton = radioGroup.getChildAt(i) as RadioButton
                        radioButton.text = answerChoice[counter] [i]
                    }
                    radioGroup.clearCheck()
                } else {
                    var intent = Intent(this, ScoreActivity::class.java)
                    var score = 0

                    for (i in userAnswer.indices) {
                        if (userAnswer[i] == correctAnswers[i]) {
                            score++
                        }
                    }

                    intent.putExtra("score", score)
                    intent.putExtra("userAnswer", userAnswer)
                    intent.putExtra("UserName", userName)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }//End of onCreate
}//End of FlashCardActivity