package com.example.connect4;

public class Player {

    public void place(Token token, Board board, int column) {
        board.putInAColumn(token);

    }
}
