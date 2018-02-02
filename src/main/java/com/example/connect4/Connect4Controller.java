package com.example.connect4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Connect4Controller {


    @RequestMapping("/")
    public @ResponseBody
    Board newGame() {
        Player player = new Player();
        Board board = new Board();
        Token token = new Token();
        return board;
    }
}
