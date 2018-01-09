package com.example.connect4;

public class Board {
    private Token column;

    public void putInAColumn(Token token) {
        column = token;
    }

    public boolean isGameOver() {
        return column != null;
    }

}
