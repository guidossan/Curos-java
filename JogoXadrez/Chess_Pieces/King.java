package JogoXadrez.Chess_Pieces;

import JogoXadrez.BoardGame.Board;
import JogoXadrez.Chess.ChessPiece;
import JogoXadrez.Chess.Color;

public class King extends ChessPiece{
    public King(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
    
    
}
