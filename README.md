Overview of Project
The Flashcard Quiz App is an interactive Android application built in Android Studio using Kotlin. This app is designed as a learning and self-assessment tool that helps users test their knowledge through True/False flashcards on historical facts. The quiz is user-friendly, personalized, and includes features such as a score tracker, feedback system, and a review screen that allows users to reflect on their performance.

Whether you're studying for a history test or just want to challenge your general knowledge, this app provides a fun and educational experience and helps the user learn more about history while testing them on their knowledge.


Key Features

•	Name Personalization: The app greets users by name throughout the quiz and score screen for a more engaging experience.

•	Instructions Screen: Clear and concise guidance before the quiz begins.

•	5 Flashcard Questions: Displays one True/False question at a time with radio button selection.

•	Immediate Feedback: Toast messages inform users if their answer was correct or incorrect after each question.

•	Score Calculation: Tallies total correct answers and generates a result message based on performance.

•	Review Section: Allows users to view all questions, their responses, and the correct answers in a clean, scrollable layout.

•	Multi-Screen Navigation: Clean separation of UI across different screens for input, quiz, score, and review.


File & Code Structure

Activities

•	MainActivity.kt – Handles name input and passes it forward.

•	InstructionsActivity.kt – Displays instructions before the quiz.

•	FlashCardActivity.kt – Core quiz logic, question navigation, answer checking.

•	ScoreActivity.kt – Displays the score and personalized feedback.

•	ReviewActivity.kt – Shows a list of all questions, user answers, and correct answers.    


Layouts
•	activity_main.xml – Name input field and Next button.

•	activity_instructions.xml – Simple instruction text and Start button.

•	activity_flash_card.xml – Quiz question, True/False radio buttons, Submit button.

•	activity_score.xml – Score, feedback, and Review button.

•	activity_review.xml – ScrollView list of questions and answers.



Technologies Used
•	IDE: Android Studio

•	Language: Kotlin

•	UI Components: TextView, EditText, Button, RadioGroup, RadioButton, LinearLayout, Toast, Intent

•	Layouts: XML using ConstraintLayout and LinearLayout

•	Architecture: Multiple Activity-based navigation (MainActivity, InstructionsActivity, FlashCardActivity, ScoreActivity, ReviewActivity)



Technologies Used
Technology       -             	Purpose

Android Studio	    -            Main development environment

Kotlin           -             	Programming language

XML            -               	Designing UI layouts

RadioGroup & RadioButton   -   	User selection for True/False

EditText          -            	User input (name)

Intent           -             	Navigation between activities

Toast           -               	Feedback to users

ConstraintLayout, LinearLayout	-UI structuring

Logcat (Log.d)             -    	Debugging and development tracing




Installation

1.Download the project or clone this repository.
2.Open the project in Android Studio. -Start Android Studio. -Select "Open an existing Android Studio project"" -Go to the directory of the cloned repository and choose either the build.gradle.kts (or build.gradle) file or the root folder of the project.
3.Grade of Sync: Upon opening the project, Android Studio will probably ask you to sync the Gradle files. Select "Sync Now". For this step, make sure you have a steady internet connection.
4.To build and install the application, click Run Button.Open the Android Studio menu and select "Build -> Make Project"
5.To test, connect an Android device or emulator. -Open the application: * Use an Android emulator or connect an Android device to your PC. Choose your device or emulator in Android Studio using the device dropdown in the


How It Works:
1.	The question and options are displayed one at a time.
2.	The app validates whether a selection was made.
3.	Compares the user’s answer to the correct one.
4.	Displays a toast: "Correct" or "Incorrect".
5.	After all 5 questions, the app:
o	Calculates the score.
o	Navigates to the Score screen.
o	Displays a message like "Well done, Sam!" or "Can do better, Sam."
o	Provides a Review button to go through answers.


How to Use the App
1.	Launch the app.
2.	There is welcome screen where the user enters your username and click Next.
3.	There is an instruction to show the users how to use the Flashcard App, then press Start.
4.	There is a Flashcard quiz where the question and options are displayed one at a time.
5.	Answer each True or False question.
6.	View your score and feedback.
7.	Optionally, press Review to see detailed feedback for each question.
   

Quiz Logic
The app uses parallel arrays to manage the flow of questions, user answers, and the scoring system.
Some of the arrays user: 

val historyQuestions = arrayOf(

    "The Great Wall of China is visible from space with the naked eye.",
    
    "Albert Einstein failed maths in school",
    
    "The dinosaurs died from a flood",
    
    "World war 1 started in 1914",
    
    "Cleopatra was the last pharaoh of Egypt"
    
)


array of the answers choice

 val answerChoice = arrayOf( 
 
arrayOf("True", "False"),

 arrayOf("True", "False"),
 
 arrayOf("True", "False"), 
 
arrayOf("True", "False"), 

arrayOf("True", "False")

 )
 

val correctAnswers = arrayOf(

"False", 

"False", 

"False", 

"True", 

"True"
)

val userAnswer = arrayOfNulls<String>(5)

Each time the user selects an answer and clicks Submit:

•	The answer is stored.

•	It is compared to the correct answer.

•	A Toast message displays whether it was right or wrong.

•	After the last question, the app calculates the final score and navigates to ScoreActivity.



Why We Use Logs

Logs (e.g., Log.d("userName", userName.toString())) are used to:

•	Debug application logic.

•	Track variable values (like username or selected answers).

•	Identify issues during development.

Logs are not shown to the user but are extremely useful in the Logcat console of Android Studio for developers.



GitHub and Version Control

GitHub is used for:

•	Storing the source code online

•	Collaborating with team members

•	Tracking changes using commits

•	Managing issues and improvement suggestions


Why commit and push?

•	Saves your work safely online

•	Keeps a history of every update

•	Makes collaboration easier

•	Helps in testing different versions

