package com.example.homework_tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var board = arrayOf(arrayOf("","",""),
                        arrayOf("","",""),
                        arrayOf("","",""))

    var turn = 0

    lateinit var player1 : TextView
    var pl1winCount = 0
    lateinit var player2 : TextView
    var pl2winCount = 0

    lateinit var button1 : Button
    lateinit var button2 : Button
    lateinit var button3 : Button
    lateinit var button4 : Button
    lateinit var button5 : Button
    lateinit var button6 : Button
    lateinit var button7 : Button
    lateinit var button8 : Button
    lateinit var button9 : Button
    lateinit var reset : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        player1 = findViewById(R.id.player1)
        player2 = findViewById(R.id.player2)

        button1 = findViewById(R.id.button)
        button1.setOnClickListener(this)
        button2 = findViewById(R.id.button2)
        button2.setOnClickListener(this)
        button3 = findViewById(R.id.button3)
        button3.setOnClickListener(this)
        button4 = findViewById(R.id.button4)
        button4.setOnClickListener(this)
        button5 = findViewById(R.id.button5)
        button5.setOnClickListener(this)
        button6 = findViewById(R.id.button6)
        button6.setOnClickListener(this)
        button7 = findViewById(R.id.button7)
        button7.setOnClickListener(this)
        button8 = findViewById(R.id.button8)
        button8.setOnClickListener(this)
        button9 = findViewById(R.id.button9)
        button9.setOnClickListener(this)

        reset = findViewById(R.id.reset)
        reset.setOnClickListener(this)
    }


    fun cleanBoard() {
        for(i in 0 until 3)
        {
            for(j in 0 until 3)
                board[i][j] = ""
        }

        turn = 0

        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""
    }

    fun checkWin() : Boolean
    {
        if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]) &&
            board[0][0].isNotEmpty() && board[0][1].isNotEmpty() && board[0][2].isNotEmpty() ||
            (board[1][0] == board[1][1]) && (board[1][1] == board[1][2]) &&
            board[1][0].isNotEmpty() && board[1][1].isNotEmpty() && board[1][2].isNotEmpty() ||
            (board[2][0] == board[2][1]) && (board[2][1] == board[2][2]) &&
            board[2][0].isNotEmpty() && board[2][1].isNotEmpty() && board[2][2].isNotEmpty() ||
            (board[0][0] == board[1][0]) && (board[1][0] == board[2][0]) &&
            board[0][0].isNotEmpty() && board[1][0].isNotEmpty() && board[2][0].isNotEmpty() ||
            (board[0][1] == board[1][1]) && (board[1][1] == board[2][1]) &&
            board[0][1].isNotEmpty() && board[1][1].isNotEmpty() && board[2][1].isNotEmpty() ||
            (board[0][2] == board[1][2]) && (board[1][2] == board[2][2]) &&
            board[0][2].isNotEmpty() && board[1][2].isNotEmpty() && board[2][2].isNotEmpty() ||
            (board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) &&
            board[0][0].isNotEmpty() && board[1][1].isNotEmpty() && board[2][2].isNotEmpty() ||
            (board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) &&
            board[0][2].isNotEmpty() && board[1][1].isNotEmpty() && board[2][0].isNotEmpty())
        {
            return true
        }
        return false
    }

    override fun onClick(v: View?) {
        when(v?.id)
        {
            R.id.button->{
                if(button1.text.isNotEmpty())
                    return
                if(turn%2 == 0)
                {
                    button1.text = "X"
                    board[0][0] = "X"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 1 WON", Toast.LENGTH_SHORT).show()
                        pl1winCount++
                        player1.text = "Player 1 Score: $pl1winCount"
                        cleanBoard()
                        return
                    }
                }
                else{
                    button1.text = "O"
                    board[0][0] = "O"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 2 WON", Toast.LENGTH_SHORT).show()
                        pl2winCount++
                        player2.text = "Player 2 Score: $pl2winCount"
                        cleanBoard()
                        return
                    }
                }
                turn++
            }
            R.id.button2->{
                if(button2.text.isNotEmpty())
                    return
                if(turn%2 == 0)
                {
                    button2.text = "X"
                    board[0][1] = "X"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 1 WON", Toast.LENGTH_SHORT).show()
                        pl1winCount++
                        player1.text = "Player 1 Score: $pl1winCount"
                        cleanBoard()
                        return
                    }
                }
                else{
                    button2.text = "O"
                    board[0][1] = "O"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 2 WON", Toast.LENGTH_SHORT).show()
                        pl2winCount++
                        player2.text = "Player 2 Score: $pl2winCount"
                        cleanBoard()
                        return
                    }
                }
                turn++
            }
            R.id.button3->{
                if(button3.text.isNotEmpty())
                    return
                if(turn%2 == 0)
                {
                    button3.text = "X"
                    board[0][2] = "X"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 1 WON", Toast.LENGTH_SHORT).show()
                        pl1winCount++
                        player1.text = "Player 1 Score: $pl1winCount"
                        cleanBoard()
                        return
                    }
                }
                else{
                    button3.text = "O"
                    board[0][2] = "O"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 2 WON", Toast.LENGTH_SHORT).show()
                        pl2winCount++
                        player2.text = "Player 2 Score: $pl2winCount"
                        cleanBoard()
                        return
                    }
                }
                turn++
            }
            R.id.button4->{
                if(button4.text.isNotEmpty())
                    return
                if(turn%2 == 0)
                {
                    button4.text = "X"
                    board[1][0] = "X"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 1 WON", Toast.LENGTH_SHORT).show()
                        pl1winCount++
                        player1.text = "Player 1 Score: $pl1winCount"
                        cleanBoard()
                        return
                    }
                }
                else{
                    button4.text = "O"
                    board[1][0] = "O"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 2 WON", Toast.LENGTH_SHORT).show()
                        pl2winCount++
                        player2.text = "Player 2 Score: $pl2winCount"
                        cleanBoard()
                        return
                    }
                }
                turn++
            }
            R.id.button5->{
                if(button5.text.isNotEmpty())
                    return
                if(turn%2 == 0)
                {
                    button5.text = "X"
                    board[1][1] = "X"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 1 WON", Toast.LENGTH_SHORT).show()
                        pl1winCount++
                        player1.text = "Player 1 Score: $pl1winCount"
                        cleanBoard()
                        return
                    }
                }
                else{
                    button5.text = "O"
                    board[1][1] = "O"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 2 WON", Toast.LENGTH_SHORT).show()
                        pl2winCount++
                        player2.text = "Player 2 Score: $pl2winCount"
                        cleanBoard()
                        return
                    }
                }
                turn++
            }
            R.id.button6->{
                if(button6.text.isNotEmpty())
                    return
                if(turn%2 == 0)
                {
                    button6.text = "X"
                    board[1][2] = "X"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 1 WON", Toast.LENGTH_SHORT).show()
                        pl1winCount++
                        player1.text = "Player 1 Score: $pl1winCount"
                        cleanBoard()
                        return
                    }
                }
                else{
                    button6.text = "O"
                    board[1][2] = "O"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 2 WON", Toast.LENGTH_SHORT).show()
                        pl2winCount++
                        player2.text = "Player 2 Score: $pl2winCount"
                        cleanBoard()
                        return
                    }
                }
                turn++
            }
            R.id.button7->{
                if(button7.text.isNotEmpty())
                    return
                if(turn%2 == 0)
                {
                    button7.text = "X"
                    board[2][0] = "X"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 1 WON", Toast.LENGTH_SHORT).show()
                        pl1winCount++
                        player1.text = "Player 1 Score: $pl1winCount"
                        cleanBoard()
                        return
                    }
                }
                else{
                    button7.text = "O"
                    board[2][0] = "O"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 2 WON", Toast.LENGTH_SHORT).show()
                        pl2winCount++
                        player2.text = "Player 2 Score: $pl2winCount"
                        cleanBoard()
                        return
                    }
                }
                turn++
            }
            R.id.button8->{
                if(button8.text.isNotEmpty())
                    return
                if(turn%2 == 0)
                {
                    button8.text = "X"
                    board[2][1] = "X"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 1 WON", Toast.LENGTH_SHORT).show()
                        pl1winCount++
                        player1.text = "Player 1 Score: $pl1winCount"
                        cleanBoard()
                        return
                    }
                }
                else{
                    button8.text = "O"
                    board[2][1] = "O"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 2 WON", Toast.LENGTH_SHORT).show()
                        pl2winCount++
                        player2.text = "Player 2 Score: $pl2winCount"
                        cleanBoard()
                        return
                    }
                }
                turn++
            }
            R.id.button9->{
                if(button9.text.isNotEmpty())
                    return
                if(turn%2 == 0)
                {
                    button9.text = "X"
                    board[2][2] = "X"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 1 WON", Toast.LENGTH_SHORT).show()
                        pl1winCount++
                        player1.text = "Player 1 Score: $pl1winCount"
                        cleanBoard()
                        return
                    }
                }
                else{
                    button9.text = "O"
                    board[2][2] = "O"
                    if(checkWin())
                    {
                        Toast.makeText(this, "Player 2 WON", Toast.LENGTH_SHORT).show()
                        pl2winCount++
                        player2.text = "Player 2 Score: $pl2winCount"
                        cleanBoard()
                        return
                    }
                }
                turn++
            }
            R.id.reset->{
                cleanBoard()
                pl1winCount = 0
                pl2winCount = 0
                turn = 0
                player1.text = "Player 1 Score: $pl1winCount"
                player2.text = "Player 2 Score: $pl2winCount"
            }
        }
        if(turn > 8 )
        {
            Toast.makeText(this,"It's a DRAW",Toast.LENGTH_SHORT).show()
            cleanBoard()
        }
    }


}