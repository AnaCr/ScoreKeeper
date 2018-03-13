package com.example.anala.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scorePOne = 0;
    int scorePTwo = 0;
    int hole = 1;
    String gameOver = "false";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** displays the score for Player One */
    public void displayScorePOne (int score){
        TextView scoreView = findViewById(R.id.playerOneScore);
        scoreView.setText(String.valueOf(score));
    }

    /** displays the score for Player Two */
    public void displayScorePTwo (int score){
        TextView scoreView = findViewById(R.id.playerTwoScore);
        scoreView.setText(String.valueOf(score));
    }

    /** displays the hole number */
    public void displayHoleNum (int holeNum){
        TextView holeNumView = findViewById(R.id.holeTxtView);
        holeNumView.setText("Hole: " + String.valueOf(holeNum) );
    }

    /** displays result P1 */
    public void displayResultP1 (String result){
        TextView resultP1 = findViewById(R.id.resultP1);
        resultP1.setText(result);
    }

    /** displays result P2 */
    public void displayResultP2 (String result){
        TextView resultP1 = findViewById(R.id.resultP2);
        resultP1.setText(result);
    }

    /** Ends the game */
    public void endGame (String gameOver){
        if (gameOver.equals("true") ){
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
            if (scorePOne < scorePTwo){
                displayResultP1("Winner!");
                displayResultP2("Loser!");
            }
            if (scorePTwo < scorePOne){
                displayResultP1("Loser!");
                displayResultP2("Winner!");
            }
            if (scorePOne == scorePTwo){
                displayResultP1("Tie!");
                displayResultP2("Tie!");
            }
        }
    }

    /** adds 1 to Player 1 score */
    public void holeInOneP1 (View v){
        if (gameOver.equals("false")){
            scorePOne = scorePOne + 1;
            displayScorePOne(scorePOne);
        }
    }

    /** adds 1 to Player 2 score */
    public void holeInOneP2 (View v){
        if (hole < 18) {
            scorePTwo = scorePTwo + 1;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            displayHoleNum(hole);
        }
        else if (hole == 18){
            scorePTwo = scorePTwo + 1;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            gameOver = "true";
            endGame(gameOver);
        }
    }

    /** adds 2 to Player 1 score */
    public void plusTwoP1 (View v){
        if (gameOver.equals("false")){
            scorePOne = scorePOne + 2;
            displayScorePOne(scorePOne);
        }
    }

    /** adds 2 to Player 2 score */
    public void plusTwoP2 (View v){
        if (hole < 18) {
            scorePTwo = scorePTwo + 2;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            displayHoleNum(hole);
        }
        else if (hole == 18){
            scorePTwo = scorePTwo + 2;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            gameOver = "true";
            endGame(gameOver);
        }
    }

    /** adds 3 to Player 1 score */
    public void plusThreeP1 (View v){
        if (gameOver.equals("false")){
            scorePOne = scorePOne + 3;
            displayScorePOne(scorePOne);
        }
    }

    /** adds 3 to Player 2 score */
    public void plusThreeP2 (View v){
        if (hole < 18) {
            scorePTwo = scorePTwo + 3;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            displayHoleNum(hole);
        }
        else if (hole == 18){
            scorePTwo = scorePTwo + 3;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            gameOver = "true";
            endGame(gameOver);
        }
    }

    /** adds 4 to Player 1 score */
    public void plusFourP1 (View v){
        if (gameOver.equals("false")){
            scorePOne = scorePOne + 4;
            displayScorePOne(scorePOne);
        }
    }

    /** adds 4 to Player 2 score */
    public void plusFourP2 (View v){
        if (hole < 18) {
            scorePTwo = scorePTwo + 4;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            displayHoleNum(hole);
        }
        else if (hole == 18){
            scorePTwo = scorePTwo + 4;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            gameOver = "true";
            endGame(gameOver);
        }
    }

    /** adds 5 to Player 1 score */
    public void plusFiveP1 (View v){
        if (gameOver.equals("false")){
            scorePOne = scorePOne + 5;
            displayScorePOne(scorePOne);
        }
    }

    /** adds 5 to Player 2 score */
    public void plusFiveP2 (View v){
        if (hole < 18) {
            scorePTwo = scorePTwo + 5;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            displayHoleNum(hole);
        }
        else if (hole == 18){
            scorePTwo = scorePTwo + 5;
            hole = hole + 1;
            displayScorePTwo(scorePTwo);
            gameOver = "true";
            endGame(gameOver);
        }
    }

    /** Resets the game */
    public void resetGame (View v){
        hole = 1;
        scorePOne = 0;
        scorePTwo = 0;
        gameOver = "false";
        displayScorePOne(scorePOne);
        displayScorePTwo(scorePTwo);
        displayHoleNum(hole);
        displayResultP1(" ");
        displayResultP2(" ");
    }
}
