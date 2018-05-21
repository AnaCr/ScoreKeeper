package com.example.anala.scorekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE1 = "com.example.anala.scorekeeper.MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "com.example.anala.scorekeeper.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Play! button */
    /** Credit: https://developer.android.com/training/basics/firstapp/starting-activity#java */
    public void beginScoreBoard(View view) {
        Intent intent = new Intent(this, ScoreBoardActivity.class);
        EditText player1editText = findViewById(R.id.player1);
        EditText player2editText = findViewById(R.id.player2);
        String player1name = player1editText.getText().toString();
        String player2name = player2editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, player1name);
        intent.putExtra(EXTRA_MESSAGE2, player2name);
        startActivity(intent);
    }


}
