package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class AdventureTimeQuiz extends AppCompatActivity {

    TextView question;
    Button a1;
    Button a2;
    Button a3;
    Button a4;
    Button a5;
ArrayList <HashMap> questions;
ArrayList <Question> answers;
    int counter = 0;
    int princessscore = 0;
    int marcelinescore = 0;
    int icekingscore = 0;
    int finnscore = 0;
    int jakescore = 0;

    Question q1;
    Question q2;
    Question q3;
    Question q4;
    Question q5;


    @Override

@Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_time_quiz);
        question = findViewById(R.id.question);
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);


        questions = new ArrayList<>();
        answers = new ArrayList<>();
        HashMap<String, String> question1 = new HashMap<String, String>();
        question1.put("question", "What do you want to be in the future?");
        question1.put("Pediatrician", "Princess Bubblegum");
        question1.put("Musician", "Marceline");
        question1.put("The President", "the Ice king");
        question1.put("Hero", "finn");
        question1.put("Comedian", "jake");
      questions.add(question1);


        HashMap<String, String> question2 = new HashMap<String, String>();
        question2.put("question", "What would people describe you as?");
        question2.put("Responsible, Kind", "Princess Bubblegum");
        question2.put("Down to earth,chill", "Marceline");
        question2.put("Uptight, Short tempered", "the Ice king");
        question2.put("Adventurous, Helpful, Loving", "finn");
        question2.put("funny, tough, loveable", "jake");
        questions.add(question2);


        HashMap<String, String> question3 = new HashMap<String, String>();
    question3.put("question", "You go to the beach and your friend forgets sunscreen. What do you do?");
    question3.put("I would most likely come with extra sunscreen", "Princess Bubblegum");
    question3.put("Oh well, that’s not my problem", "Marceline");
    question3.put("I wasn’t invited so…", "the Ice king");
    question3.put("Try to buy some new sunscreen", "finn");
    question3.put("Borrow someone’s sunscreen & give it back", "jake");
    questions.add(question3);

    HashMap<String, String> question4 = new HashMap<String, String>();
    question4.put("question", "How would you plan a party?");
    question4.put("A surprise party!", "Princess Bubblegum");
    question4.put("Hangout session with a few friends in the woods", "Marceline");
    question4.put("UGet them a gift & bring a lot of friends", "the Ice king");
    question4.put("Make a fun activity", "finn");
    question4.put("Small get together, I cook", "jake");
    questions.add(question4);

    HashMap<String, String> question5 = new HashMap<String, String>();
    question5.put("question", "If you knew you had a few days left to live, what would you do?");
    question5.put("Try to reach your goals in life.", "Princess Bubblegum");
    question5.put("Get some alone time.", "Marceline");
    question5.put("Let everyone know", "the Ice king");
    question5.put("Help people as much as possible", "finn");
    question5.put("Visit my family members", "jake");
    questions.add(question5);




    q1 = new Question(" What do you want to be in the future?","Pediatrician","Musician","The President", "Hero","Comedian");
    q2 = new Question(" What would people describe you as?","Responsible, Kind","Down to earth,chill","Uptight, Short tempered", "Adventurous, Helpful, Loving","funny, tough, loveable");
    q3 = new Question("You go to the beach and your friend forgets sunscreen. What do you do?","I would most likely come with extra sunscreen","Oh well, that’s not my problem","I wasn’t invited so…","Try to buy some new sunscreen","Borrow someone’s sunscreen & give it back");
    q4 = new Question("How would you plan a party?","A surprise party!","Hangout session with a few friends in the woods","Get them a gift & bring a lot of friends","Make a fun activity","Small get together, I cook");
    q5 = new Question("If you knew you had a few days left to live, what would you do?","Try to reach your goals in life. ","Get some alone time.","Let everyone know","Help people as much as possible","Visit my family members");



answers.add(q1);
answers.add(q2);
answers.add(q3);
answers.add(q4);
answers.add(q5);
    Log.d("onCreate", "" + answers);

    question.setText(questions.get(counter).get("question").toString());
    a1.setText(answers.get(counter).getAnswer1()) ;
    a2.setText(answers.get(counter).getAnswer2()) ;
    a3.setText(answers.get(counter).getAnswer3()) ;
    a4.setText(answers.get(counter).getAnswer4()) ;
    a5.setText(answers.get(counter).getAnswer5()) ;
}
public void checkanswer(String choice){
String character;
    if(counter < answers.size())
        character = questions.get(counter).get(choice).toString();
}

    public void nextquestion(View view){
        Button btn = (Button)view;

        if (counter<answers.size()){
            String buttonText = btn.getText().toString();
            Log.d("buttonINfo", buttonText);
            checkanswer(buttonText);
             counter++;
        }

        if (counter >= answers.size()-1){
            Toast.makeText(this , "You reach the end of the test",Toast.LENGTH_LONG);
        }
else {
            question.setText(questions.get(counter).get("question").toString());
            a1.setText(answers.get(counter).getAnswer1()) ;
            a2.setText(answers.get(counter).getAnswer2()) ;
            a3.setText(answers.get(counter).getAnswer3()) ;
            a4.setText(answers.get(counter).getAnswer4()) ;
            a5.setText(answers.get(counter).getAnswer5()) ;
        }

    }




}

