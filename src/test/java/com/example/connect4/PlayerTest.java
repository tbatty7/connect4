package com.example.connect4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {
    @Test
    public void playerPlacesFirstToken() throws Exception {
        Player player = new Player();
        Board board = new Board();
        Token token = new Token();
        player.place(token, board, 0);
        assertEquals(true, board.isGameOver());
    }

    @Test
    public void playerOnePlacesTokenInColumnOne() {
        Player player = new Player();
        Board board = new Board();
        Token token = new Token();
        player.place(token, board, 1);
        assertEquals(true, board.isGameOver());
    }
}
