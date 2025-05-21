# Flash Card App

## Acknowledgements
#### (AI was assisted in some sections as a learning tool and writing assistant to improve clarity, structure, and technical accuracy., like fixing some code and documentations)

The Flashcard Quiz App is an interactive Android application built in Android Studio using Kotlin. This app is designed as a learning and self-assessment tool that helps users test their knowledge through True/False flashcards on historical facts and to test how must they know and learn from their mistakes . The quiz is user-friendly, personalized, and includes features such as a welcome page, instructions on how to use the App, Quiz screen, score tracker, feedback system, and a review screen that allows users to reflect on their performance.

Whether you're studying for a history test or just want to challenge your general knowledge, this app provides a fun and educational experience and helps the user learn more about history while testing them on their knowledge.


1. A clean, multi-screen interface

2. Personalized user interaction

3. Instant feedback (Ethier congratulating or motivating the use to do better) and score tracking 

4. A review feature (Showing the users answers compared to the correct one) for reflection and learning

Whether you're preparing for a test or simply love trivia, this app makes learning fun and effective.

---


## Key Features

1.	Name Personalization: The app greets users by name throughout the quiz and score screen for a more engaging experience.
2.	Instructions Screen: Clear and concise guidance before the quiz begins.
3.	5 Flashcard History Questions: Displays one True/False question at a time with radio button selection.
4.	Immediate Feedback: Toast messages inform users if their answer was correct or incorrect after each question.
5.	Score Calculation: Tallies total correct answers and generates a result message based on performance.
6.	Review Section: Allows users to view all questions, their responses, and the correct answers in a clean, scrollable layout.
7.	Multi-Screen Navigation: Clean separation of UI across different screens for input, quiz, score, and review.  

---

## File & Code Structure
### Activities

1.	MainActivity.kt – Handles name input and passes it forward.
2.	InstructionsActivity.kt – Displays instructions before the quiz.
3.	FlashCardActivity.kt – Core quiz logic, question navigation, answer checking.
4.	ScoreActivity.kt – Displays the score and personalized feedback.
5.	ReviewActivity.kt – Shows a list of all questions, user answers, and correct answers.

---

## Layouts
1.	activity_main.xml – Name input field and Next button.
2.	activity_instructions.xml – Simple instruction text and Start button.
3.	activity_flash_card.xml – Quiz question, True/False radio buttons, Next button.
4.	activity_score.xml – Score, feedback, and Review button.
5.	activity_review.xml – ScrollView list of questions and answers, Restart button and xit button.


---

## Technologies Used

•	IDE: Android Studio

•	Language: Kotlin

•	UI Components: TextView, EditText, Button, RadioGroup, RadioButton, LinearLayout, Toast, Intent, Imagie

•	Layouts: XML using ConstraintLayout and LinearLayout

•	Architecture: Multiple Activity-based navigation (MainActivity, InstructionsActivity, FlashCardActivity, ScoreActivity, ReviewActivity)



### Technologies Used
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


---

## Installation
1.	Download the project or clone this repository.
2.	Open the project in Android Studio. -Start Android Studio. -Select "Open an existing Android Studio project"" -Go to the directory of the cloned repository and choose either the build.gradle.kts (or build.gradle) file or the root folder of the project.
3.	Grade of Sync: Upon opening the project, Android Studio will probably ask you to sync the Gradle files. Select "Sync Now". For this step, make sure you have a steady internet connection.
4.	To build and install the application, click Run Button.Open the Android Studio menu and select "Build -> Make Project"
5.	To test, connect an Android device or emulator. -Open the application: * Use an Android emulator or connect an Android device to your PC. Choose your device or emulator in Android Studio using the device dropdown in the


---

## How It Works:
1.	The question and options are displayed one at a time.
2.	The app validates whether a selection was made.
3.	Compares the user’s answer to the correct one.
4.	Displays a toast: "Correct" or "Incorrect".
5.	After all 5 questions, the app:
6.	Calculates the score.
7.	Navigates to the Score screen.
8.	Displays a message like "Well done, (username)Sam!" or "Can do better,(username) Sam."
9.	Provides a Review button to go through answers.
10. If to wish to restart he quiz press the restart button.
11. Exit button to leave the App.
    
---

## How to Use the App
1.	Launch the app.
2.	There is welcome screen where the user enters your username and click Next.
3.	There is an instruction to show the users how to use the Flashcard App, then press Start.
4.	There is a Flashcard quiz where the question and options are displayed one at a time.
5.	Answer each True or False question.
6.	Press Next button to go to the next question until finshed will take you to the scoring screen.
7.	View your score and feedback.
8.	Press Review to see detailed feedback for each question.
9.	If to wish to restart he quiz press the restart button.
10.  To leave the App, press the Exit button.
   
---
## Questions and Answers
1. The Great Wall of China is visible from space with the naked eye- False

2.  Albert Einstein failed maths in school-False

3. The dinosaurs died from a flood-False
    
4. World war 1 started in 1914-True
    
5. Cleopatra was the last pharaoh of Egypt-True

## Quiz Logic

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

### Each time the user selects an answer and clicks Submit:
1.	The answer is stored.
2.	It is compared to the correct answer.
3.	A Toast message displays whether it was correct or incorrect right or wrong.
4.	After the last question, the app calculates the final score and navigates to ScoreActivity.



---

## Why We Use Logs
1.	Logs (e.g., Log.d("userName", userName.toString())) are used to:
2.	Debug application logic.
3.	Track variable values (like username. Buttons or selected answers).
4.	Identify issues during development.
   
Logs are not shown to the user but are extremely useful in the Logcat console of Android Studio for developers. Makes the code easy.


---

## GitHub and Version Control
GitHub is used for:

GitHub is an online platform used to store, manage, and collaborate on code projects using version control (Git). It helps keep track of changes to code over time and allows multiple people to work on the same project without losing progress.


1.	Storing the source code online
2.	Collaborating with team members
3.	Tracking changes using commits
4.	Managing issues and improvement suggestions

## GitHub Actions
GitHub Actions is a tool built into GitHub that allows you to automate tasks like building, testing, or deploying your app every time you push code to your repository.

In this project:

GitHub Actions automatically builds your Android app using Gradle every time you push updates to the master branch.

This ensures your code is always working and up-to-date, helping catch errors early.

### Why commit and push?
1.	Saves your work safely online
2.	Keeps a history of every update
3.	Makes collaboration easier
4.	Helps in testing different versions

---

## Potential Improvements
1.	Add more question categories to add(e.g., Science, Geography)
2.	Add sound effects for correct/incorrect answers
3.	Include dark mode support
4. Add more questions.
5. Add more features.

---

## Screenshot of the App and Codes
### Welcome Screen
![image](https://github.com/user-attachments/assets/d4cd2b90-fa39-4518-8779-d20ac4e7d2b9)
![image](https://github.com/user-attachments/assets/3313c492-8236-4a3d-a179-a463b2c9106f)
![image](https://github.com/user-attachments/assets/834af286-73e2-4299-8319-e7735f893e16)
![image](https://github.com/user-attachments/assets/48976143-81ad-4d9d-9732-0ac3dc4db242)


### Code
![image](https://github.com/user-attachments/assets/a0676513-9e2a-42e5-94a3-a07091403225)
![image](https://github.com/user-attachments/assets/b2493cc4-d372-4a26-b603-4d60e276d474)

---
### Instructions Screen
![image](https://github.com/user-attachments/assets/730c0291-c4d0-4e0c-8c9e-4d37255751d6)
![image](https://github.com/user-attachments/assets/d08afb80-add9-48c8-8649-e09ccf537a68)
![image](https://github.com/user-attachments/assets/a3eb54b5-5314-46bd-a11c-3b6bac8f204a)
![image](https://github.com/user-attachments/assets/6364cf00-0563-416b-81fb-fea2e4c90ceb)



### Code
![image](https://github.com/user-attachments/assets/796c1ae1-aa5f-4b2e-a9cd-5d044d966336)


---

### Flash Card Quiz Screen
![image](https://github.com/user-attachments/assets/c7e5906d-caff-41fa-b5bb-16f03c73a4cc)
![image](https://github.com/user-attachments/assets/4541f269-e750-43ed-b1ab-de9750ffcdde)
![image](https://github.com/user-attachments/assets/189ae026-70f4-49a3-bdcd-0106fa8d7ad2)
![image](https://github.com/user-attachments/assets/22e2bcb5-24a4-4d4e-ac48-3fb750019d01)


### Code
![image](https://github.com/user-attachments/assets/804ab0e7-d4d6-429c-a917-7a0ed0bd8139)
![image](https://github.com/user-attachments/assets/353c7034-226b-4fb3-9134-abda3ac47060)
![image](https://github.com/user-attachments/assets/d84d902f-4a37-4d9e-bdc4-394ad1627ebe)
![image](https://github.com/user-attachments/assets/fd96a271-c6de-44f9-afe3-51b0f9b472a5)


---
### Scoring Screen
![image](https://github.com/user-attachments/assets/27231dff-564f-410e-94db-2969e43fe6f8)
![image](https://github.com/user-attachments/assets/53f56503-3ce7-4d04-924b-8229e9c81c28)
![image](https://github.com/user-attachments/assets/754f1a98-0d45-42d6-8cb4-46431b791029)
![image](https://github.com/user-attachments/assets/61b38f97-4eea-416c-ae41-4cfb0c6e37b9)


---
### Code
![image](https://github.com/user-attachments/assets/fdfe54d3-4b71-4b0d-b7f5-c3f330d9bbb5)
![image](https://github.com/user-attachments/assets/2c3d8270-4f01-4812-9da9-65606c6a5392)


---
### Review Screen
![image](https://github.com/user-attachments/assets/c830df88-a562-48ca-a939-afd4bcea3e62)

# how it looks when runned on BlueStacks
![image](https://github.com/user-attachments/assets/a19fea06-0be9-4b72-9705-c1347d31b366)


![image](https://github.com/user-attachments/assets/948fdfe4-2565-4ab0-930b-426c9e79b891)
![image](https://github.com/user-attachments/assets/4b1fa742-2ee1-4705-a7f3-4613bf4c9511)
![image](https://github.com/user-attachments/assets/4cef8a66-6ae1-4821-b148-c23837a9ecdd)


---
### Code
![image](https://github.com/user-attachments/assets/ed260870-242a-4b8b-a971-0a42b86a68b8)
![image](https://github.com/user-attachments/assets/b378d4c5-0107-49e6-8b8e-b4853cc79278)
![image](https://github.com/user-attachments/assets/83c7f177-8e4a-452f-8e49-54536f55156e)


# Project Report 

## Problem: The Need for an Engaging, User-Friendly Learning Tool For a History Learning App
Traditional methods of learning history—such as reading or note-taking—are typically boring, Information-overloaded, or discouraging, especially for younger learners or those with bad memory. A majority of study apps are too complex, noninteractive, or do not provide real-time feedback, and the learners end up wondering if they are improving. The learners also need tools that not only check their knowledge but also enable them to think and learn more effectively in the moment. There is also no encouragement and personalization in the majority of existing quiz apps, which may cause reduced interaction and retention. Without simple navigation and considerable motivation, learners are easily bored or intimidated by standard tests.

## Solutions: Flash Card Quiz App
The Flashcard Quiz App is an educational Android application designed to help learners test and reinforce their knowledge of history in a simple, easy, engaging, and interactive way. Built using Kotlin in Android Studio, the app presents a series of five multiple-choice history questions in a flashcard format, which are easy to navigate and make learning feel less like a test and more like a game. This user-friendly interface ensures that learners of all ages and skill levels can participate without difficulty. Upon launching the app, users are greeted with a welcome screen and prompted to enter their name, personalizing their experience and making the app feel more tailored to the individual. They are then guided to an instruction screen that explains how the app works—detailing the quiz format, how to select answers, and what to expect during the activity.

The Flashcard Quiz App is a learning Android application that aims to address such issues with a simple, enjoyable, and interactive way of learning history. Developed with Kotlin through Android Studio, the app provides five questions on history in multiple-choice format in flashcard format. Its minimalist, easy-to-use design makes it accessible to students of all ages and levels.

Upon opening the app, one is welcomed to a name greeting screen where they enter their name. This provides a personal touch and engages users more. The second screen has a step-by-step walkthrough of how the app functions, i.e., how one is expected to select answers and what responses one can expect.

As users attempt the quiz. The user had to enter either True or False and then press the Next button to cotuin the quesions and has the questions come to an end, it will then go to the score page. They are provided with instant feedback in terms of toast messages indicating whether or not their selected answer is correct. Instant feedback improves error correction and learning as well as increases memory retention. At the completion of all five questions, users are shown a customized score page with positive feedback such as "Well done" or "You can try better and do better," based on their performance. This will either congratulate or motivate the user.

The application also has a review page, where the users see their answers and the right solutions. This helps to trigger reflection and personal improvement.The Review had the function where the user will be bale to see the qestion, their answers and the correct answer so they can compare the two and learn from their mistakes. Users also have the opportunity to restart the test or exit the application.

Educational benefits of the app are augmented by its simplicity, adaptive screen layout, and smooth navigation across different screens. It motivates learners both positively and also through feedback and by giving them control over learning speed, enhancing independence and confidence in themselves. Name-based feedback, simplicity of use with a minimalistic layout, didactic instructions, and an in-built review system are some of the unique features of the app that enable it to serve as an effective informal assessment and learning tool. Overall, the Flashcard Quiz App bridges the technology-learn divide to create an engaging, motivational learning system that encourages progress, builds self-esteem, and keeps users active throughout.

## Youtube link



## Author 
### Kythera Pather

