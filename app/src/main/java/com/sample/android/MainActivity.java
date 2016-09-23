package com.sample.android;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.BindInt;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    static int one1, one2, one3, one4, one5, one6, one7, one8, one9;
    @Bind(R.id.button1)

    Button btn1;
    @Bind(R.id.button2)
    Button btn2;
    @Bind(R.id.button3)
    Button btn3;
    @Bind(R.id.button4)
    Button btn4;
    @Bind(R.id.button5)
    Button btn5;
    @Bind(R.id.button6)
    Button btn6;
    @Bind(R.id.button7)
    Button btn7;
    @Bind(R.id.button8)
    Button btn8;
    @Bind(R.id.button9)
    Button btn9;
    int count = 0;

    public static int isGameOver() {
        if (isRowWon(one1, one2, one3))
            return one1;
        if (isRowWon(one4, one5, one6))
            return one2;
        if (isRowWon(one7, one8, one9))
            return one3;
        if (isRowWon(one1, one4, one7))
            return one1;
        if (isRowWon(one2, one5, one8))
            return one2;
        if (isRowWon(one3, one6, one9))
            return one3;
        if (isRowWon(one1, one5, one9))
            return one1;
        if (isRowWon(one3, one5, one7))
            return one3;

        // Here's a slick trick: Multiply all nine squares together.
        // The result will be 0 if at least one square is empty.

        if (one1 * one2 * one3 * one4 * one5 * one6 * one7 * one8 * one9 == 0)
            return 0;            // Game is not over

        return 3;                // Game is a draw
    }

    private static boolean isRowWon(int a, int b, int c) {
        return ((a == b) & (a == c) & (a != 0));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9})
    public void submit(View view) {
        if (count < 9) {
            switch (view.getId()) {
                case R.id.button1:
                    if (isGameOver() == 1) {
                        Toast.makeText(this, "Player 1 won the game ", Toast.LENGTH_SHORT).show();
                    } else if (isGameOver() == 2) {
                        Toast.makeText(this, "Player 2 won the game ", Toast.LENGTH_SHORT).show();
                    }
                    if (count % 2 == 0) {
                        one1 = 1;
                        btn1.setBackgroundColor(Color.RED);
                    } else {
                        one1 = 2;
                        btn1.setBackgroundColor(Color.BLUE);
                    }
                    count++;
                    break;
                case R.id.button2:
                    if (isGameOver() == 1) {
                        Toast.makeText(this, "Player 1 won the game ", Toast.LENGTH_SHORT).show();
                    } else if (isGameOver() == 2) {
                        Toast.makeText(this, "Player 2 won the game ", Toast.LENGTH_SHORT).show();
                    }
                    if (count % 2 == 0) {
                        one2 = 1;
                        btn2.setBackgroundColor(Color.RED);
                    } else {
                        one2 = 2;
                        btn2.setBackgroundColor(Color.BLUE);
                    }
                    count++;
                    break;
                case R.id.button3:
                    if (isGameOver() == 1) {
                        Toast.makeText(this, "Player 1 won the game ", Toast.LENGTH_SHORT).show();
                    } else if (isGameOver() == 2) {
                        Toast.makeText(this, "Player 2 won the game ", Toast.LENGTH_SHORT).show();
                    }
                    if (count % 2 == 0) {
                        one3 = 1;
                        btn3.setBackgroundColor(Color.RED);
                    } else {
                        one3 = 2;
                        btn3.setBackgroundColor(Color.BLUE);
                    }
                    count++;
                    break;
                case R.id.button4:
                    if (isGameOver() == 1) {
                        Toast.makeText(this, "Player 1 won the game ", Toast.LENGTH_SHORT).show();
                    } else if (isGameOver() == 2) {
                        Toast.makeText(this, "Player 2 won the game ", Toast.LENGTH_SHORT).show();
                    }
                    if (count % 2 == 0) {
                        one4 = 1;
                        btn4.setBackgroundColor(Color.RED);
                    } else {
                        one4 = 2;
                        btn4.setBackgroundColor(Color.BLUE);
                    }
                    count++;
                    break;
                case R.id.button5:
                    if (isGameOver() == 1) {
                        Toast.makeText(this, "Player 1 won the game ", Toast.LENGTH_SHORT).show();
                    } else if (isGameOver() == 2) {
                        Toast.makeText(this, "Player 2 won the game ", Toast.LENGTH_SHORT).show();
                    }
                    if (count % 2 == 0) {
                        one5 = 1;
                        btn5.setBackgroundColor(Color.RED);
                    } else {
                        one5 = 2;
                        btn5.setBackgroundColor(Color.BLUE);
                    }
                    count++;
                    break;
                case R.id.button6:
                    if (isGameOver() == 1) {
                        Toast.makeText(this, "Player 1 won the game ", Toast.LENGTH_SHORT).show();
                    } else if (isGameOver() == 2) {
                        Toast.makeText(this, "Player 2 won the game ", Toast.LENGTH_SHORT).show();
                    }
                    if (count % 2 == 0) {
                        one6 = 1;
                        btn6.setBackgroundColor(Color.RED);
                    } else {
                        one6 = 2;
                        btn6.setBackgroundColor(Color.BLUE);
                    }
                    count++;
                    break;
                case R.id.button7:
                    if (isGameOver() == 1) {
                        Toast.makeText(this, "Player 1 won the game ", Toast.LENGTH_SHORT).show();
                    } else if (isGameOver() == 2) {
                        Toast.makeText(this, "Player 2 won the game ", Toast.LENGTH_SHORT).show();
                    }
                    if (count % 2 == 0) {
                        one7 = 1;
                        btn7.setBackgroundColor(Color.RED);
                    } else {
                        one7 = 2;
                        btn7.setBackgroundColor(Color.BLUE);
                    }
                    count++;
                    break;
                case R.id.button8:
                    if (isGameOver() == 1) {
                        Toast.makeText(this, "Player 1 won the game ", Toast.LENGTH_SHORT).show();
                    } else if (isGameOver() == 2) {
                        Toast.makeText(this, "Player 2 won the game ", Toast.LENGTH_SHORT).show();
                    }
                    if (count % 2 == 0) {
                        one8 = 1;
                        btn8.setBackgroundColor(Color.RED);
                    } else {
                        one8 = 2;
                        btn8.setBackgroundColor(Color.BLUE);
                    }
                    count++;
                    break;
                case R.id.button9:
                    if (isGameOver() == 1) {
                        Toast.makeText(this, "Player 1 won the game ", Toast.LENGTH_SHORT).show();
                    } else if (isGameOver() == 2) {
                        Toast.makeText(this, "Player 2 won the game ", Toast.LENGTH_SHORT).show();
                    }
                    if (count % 2 == 0) {
                        one9 = 1;
                        btn9.setBackgroundColor(Color.RED);
                    } else {
                        one9 = 2;
                        btn9.setBackgroundColor(Color.BLUE);
                    }
                    count++;
                    break;

            }
        } else {
            count = 0;
            one1 = one2 = one3 = one4 = one5 = one6 = one7 = one8 = one9 = 0;
            btn1.setBackgroundResource(android.R.drawable.btn_default);
            btn2.setBackgroundResource(android.R.drawable.btn_default);
            btn3.setBackgroundResource(android.R.drawable.btn_default);
            btn4.setBackgroundResource(android.R.drawable.btn_default);
            btn5.setBackgroundResource(android.R.drawable.btn_default);
            btn6.setBackgroundResource(android.R.drawable.btn_default);
            btn7.setBackgroundResource(android.R.drawable.btn_default);
            btn8.setBackgroundResource(android.R.drawable.btn_default);
            btn9.setBackgroundResource(android.R.drawable.btn_default);
            Toast.makeText(this, "Game is over ", Toast.LENGTH_SHORT).show();
        }


    }

}
