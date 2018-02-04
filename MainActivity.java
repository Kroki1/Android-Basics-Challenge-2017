package com.example.android.geoquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers (View view) {

        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();

        //update final result - display and show number

        TextView finalResult = (TextView) findViewById(R.id.result);

        ViewGroup.LayoutParams params = finalResult.getLayoutParams();
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        finalResult.setLayoutParams(params);

        finalResult.setText(points + "/10");

        // submit button change to reset button

        Button submitToReset = (Button) findViewById(R.id.submitButton);
        submitToReset.setText("RESET QUIZ");
        submitToReset.setOnClickListener( new OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                //***Do what you want with the click here***

                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

    }

    public int question1 () {
        RadioButton question1button1 = (RadioButton) findViewById(R.id.que1ans1);
        boolean answer1que1 = question1button1.isChecked();

        RadioButton question1button2 = (RadioButton) findViewById(R.id.que1ans2);
        boolean answer2que1 = question1button2.isChecked();

        RadioButton question1button3 = (RadioButton) findViewById(R.id.que1ans3);
        boolean answer3que1 = question1button3.isChecked();

        if (answer2que1) {
            points = points + 1;
            question1button2.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer1que1) {
            question1button1.setTextColor(getResources().getColor(R.color.mistake));
            question1button2.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer3que1) {
            question1button1.setTextColor(getResources().getColor(R.color.mistake));
            question1button2.setTextColor(getResources().getColor(R.color.correct));
        }
        return points;
    }
    public int question2 () {
        RadioButton question2button1 = (RadioButton) findViewById(R.id.que2ans1);
        boolean answer1que2 = question2button1.isChecked();

        RadioButton question2button2 = (RadioButton) findViewById(R.id.que2ans2);
        boolean answer2que2 = question2button2.isChecked();

        RadioButton question2button3 = (RadioButton) findViewById(R.id.que2ans3);
        boolean answer3que2 = question2button3.isChecked();

        if (answer1que2) {
            points = points + 1;
            question2button1.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer2que2) {
            question2button2.setTextColor(getResources().getColor(R.color.mistake));
            question2button1.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer3que2) {
            question2button3.setTextColor(getResources().getColor(R.color.mistake));
            question2button1.setTextColor(getResources().getColor(R.color.correct));
        }
        return points;
    }
    public int question3 () {
        RadioButton question3button1 = (RadioButton) findViewById(R.id.que3ans1);
        boolean answer1que3 = question3button1.isChecked();

        RadioButton question3button2 = (RadioButton) findViewById(R.id.que3ans2);
        boolean answer2que3 = question3button2.isChecked();

        RadioButton question3button3 = (RadioButton) findViewById(R.id.que3ans3);
        boolean answer3que3 = question3button3.isChecked();

        if (answer1que3) {
            points = points + 1;
            question3button1.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer2que3) {
            question3button2.setTextColor(getResources().getColor(R.color.mistake));
            question3button1.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer3que3) {
            question3button3.setTextColor(getResources().getColor(R.color.mistake));
            question3button1.setTextColor(getResources().getColor(R.color.correct));
        }
        return points;
    }
    public int question4 () {
        RadioButton question4button1 = (RadioButton) findViewById(R.id.que4ans1);
        boolean answer1que4 = question4button1.isChecked();

        RadioButton question4button2 = (RadioButton) findViewById(R.id.que4ans2);
        boolean answer2que4 = question4button2.isChecked();

        RadioButton question4button3 = (RadioButton) findViewById(R.id.que4ans3);
        boolean answer3que4 = question4button3.isChecked();

        if (answer1que4) {
            points = points + 1;
            question4button1.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer2que4) {
            question4button2.setTextColor(getResources().getColor(R.color.mistake));
            question4button1.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer3que4) {
            question4button3.setTextColor(getResources().getColor(R.color.mistake));
            question4button1.setTextColor(getResources().getColor(R.color.correct));
        }
        return points;
    }
    public int question5 () {
        RadioButton question5button1 = (RadioButton) findViewById(R.id.que5ans1);
        boolean answer1que5 = question5button1.isChecked();

        RadioButton question5button2 = (RadioButton) findViewById(R.id.que5ans2);
        boolean answer2que5 = question5button2.isChecked();

        RadioButton question5button3 = (RadioButton) findViewById(R.id.que5ans3);
        boolean answer3que5 = question5button3.isChecked();

        if (answer2que5) {
            points = points + 1;
            question5button2.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer1que5) {
            question5button1.setTextColor(getResources().getColor(R.color.mistake));
            question5button2.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer3que5) {
            question5button1.setTextColor(getResources().getColor(R.color.mistake));
            question5button2.setTextColor(getResources().getColor(R.color.correct));
        }
        return points;
    }
    public int question6 () {
        RadioButton question6button1 = (RadioButton) findViewById(R.id.que6ans1);
        boolean answer1que6 = question6button1.isChecked();

        RadioButton question6button2 = (RadioButton) findViewById(R.id.que6ans2);
        boolean answer2que6 = question6button2.isChecked();

        RadioButton question6button3 = (RadioButton) findViewById(R.id.que6ans3);
        boolean answer3que6 = question6button3.isChecked();

        if (answer3que6) {
            points = points + 1;
            question6button3.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer1que6) {
            question6button1.setTextColor(getResources().getColor(R.color.mistake));
            question6button3.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer2que6) {
            question6button2.setTextColor(getResources().getColor(R.color.mistake));
            question6button3.setTextColor(getResources().getColor(R.color.correct));
        }
        return points;
    }
    public int question7 () {
        CheckBox question7box1 = (CheckBox) findViewById(R.id.que7ans1);
        boolean answer1que7 = question7box1.isChecked();

        CheckBox question7box2 = (CheckBox) findViewById(R.id.que7ans2);
        boolean answer2que7 = question7box2.isChecked();

        CheckBox question7box3 = (CheckBox) findViewById(R.id.que7ans3);
        boolean answer3que7 = question7box3.isChecked();

        CheckBox question7box4 = (CheckBox) findViewById(R.id.que7ans4);
        boolean answer4que7 = question7box4.isChecked();


        if (answer1que7 && answer3que7 && answer4que7 ) {
            points = points + 1;
            question7box1.setTextColor(getResources().getColor(R.color.correct));
            question7box3.setTextColor(getResources().getColor(R.color.correct));
            question7box4.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer2que7) {
            question7box2.setTextColor(getResources().getColor(R.color.mistake));
            question7box1.setTextColor(getResources().getColor(R.color.correct));
            question7box3.setTextColor(getResources().getColor(R.color.correct));
            question7box4.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer1que7 == false || answer3que7 == false || answer4que7 == false) {
            question7box1.setTextColor(getResources().getColor(R.color.correct));
            question7box3.setTextColor(getResources().getColor(R.color.correct));
            question7box4.setTextColor(getResources().getColor(R.color.correct));
        }
        return points;
    }
    public int question8 () {
        CheckBox question8box1 = (CheckBox) findViewById(R.id.que8ans1);
        boolean answer1que8 = question8box1.isChecked();

        CheckBox question8box2 = (CheckBox) findViewById(R.id.que8ans2);
        boolean answer2que8 = question8box2.isChecked();

        CheckBox question8box3 = (CheckBox) findViewById(R.id.que8ans3);
        boolean answer3que8 = question8box3.isChecked();

        CheckBox question8box4 = (CheckBox) findViewById(R.id.que8ans4);
        boolean answer4que8 = question8box4.isChecked();


        if (answer1que8 && answer3que8 && answer4que8 ) {
            points = points + 1;
            question8box1.setTextColor(getResources().getColor(R.color.correct));
            question8box3.setTextColor(getResources().getColor(R.color.correct));
            question8box4.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer2que8) {
            question8box2.setTextColor(getResources().getColor(R.color.mistake));
            question8box1.setTextColor(getResources().getColor(R.color.correct));
            question8box3.setTextColor(getResources().getColor(R.color.correct));
            question8box4.setTextColor(getResources().getColor(R.color.correct));
        } else if (answer1que8 == false || answer3que8 == false || answer4que8 == false) {
            question8box1.setTextColor(getResources().getColor(R.color.correct));
            question8box3.setTextColor(getResources().getColor(R.color.correct));
            question8box4.setTextColor(getResources().getColor(R.color.correct));
        }
        return points;
    }
    public int question9 () {
        EditText question9ans = (EditText) findViewById(R.id.que9ans);
        String answer9 = question9ans.getText().toString();
        answer9 = answer9.toUpperCase();
        String correctAnswer = "CANADA";

        if (answer9.equals(correctAnswer)) {
            points = points + 1;
            question9ans.setTextColor(getResources().getColor(R.color.correct));
        } else {
            question9ans.setTextColor(getResources().getColor(R.color.mistake));
        }
        return points;
    }
    public int question10() {
        EditText question10ans = (EditText) findViewById(R.id.que10ans);
        String answer10 = question10ans.getText().toString();
        answer10 = answer10.toUpperCase();
        String correctAnswer = "ALPS";

        if (answer10.equals(correctAnswer)) {
            points = points + 1;
            question10ans.setTextColor(getResources().getColor(R.color.correct));
        } else {
            question10ans.setTextColor(getResources().getColor(R.color.mistake));
        }
        return points;
    }


}
