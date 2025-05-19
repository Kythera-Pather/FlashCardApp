package vcmsa.kythera.flashcardapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Button
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//End of setContentView

        //Linking the elements
        val userName = findViewById<EditText>(R.id.edtUserName)
        val next = findViewById<Button>(R.id.btnNext)

        //Next button to the instructions
        next.setOnClickListener {
            //user name from the user
            val userName = userName.text.toString()
            // If the userName is empty
            if (userName.isNotEmpty()) {

                // To next Activity with the userName
                val intent = Intent(this, InstructionsActivity::class.java)
                intent.putExtra("UserName", userName)
                //now added a Log to check the userName
                Log.d("userName", userName)

                startActivity(intent)
                finish()
            } else{
                Toast.makeText(this, "Please enter your UserName in the space provided", Toast.LENGTH_SHORT).show()
            }
        }
    }//End of onCreate
}//End of MainActivity